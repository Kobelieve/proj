$('#comfirmDel').click(function () {
    var orderId = $('#orderid').text();
    $.ajax({
        type: "GET",
        url: "/payment/delByPrimarykey/" + orderId,
        async: false,
        cache: false,
        success: function(res) {
            showDialogMsg(res.msg);
            refresh();
        },
        error: function (res) {
            showDialogMsg("删除失败，请联系管理员");
        }
    });
});

var comfirmDel = function(url) {
      $.ajax({
               type: "GET",
               url: "/payment/delByPrimarykey/" + row.orderId,
               async: false,
               cache: false,
               success: function(res) {
                   console.log(res);
               }
           });
}

// 导入
$('#import').click(function () {
    $('#importModal').modal('show');
});

// 确认导入
function importConfirm() {
    // $('form').submit();
    var fileObj = document.getElementById('excelImp').files[0];
    if (typeof (fileObj) == "undefined" || fileObj.size <= 0) {
        showDialogMsg("请选择excel文件");
        return;
    }
    var formFile = new FormData();
    formFile.append('file', fileObj);

    var url = '';
    $('#titleList li').each(function (index) {
        if ($(this).hasClass('active')) {
            if (index == 0) {
                url = '/payment/importExcel';
            } else if (index == 1) {
                url = '/refund/importExcel';
            } else if (index == 2) {
                url = '/cost/importExcel';
            } else if (index == 3) {
                url = '/settlement/importExcel';
            }
        }
    })

    $('#searchModal').modal('show');
    $.ajax({
        url: url,
        type: 'post',
        data: formFile,
        processData:false,
        contentType:false,
        // async: false,
        success:function(data) {
            $('#searchModal').modal('hide');
            showDialogMsg('导入成功');
            refresh();
        },
        error: function (e) {
            $('#searchModal').modal('hide');
            showDialogMsg('导入失败，请联系管理员');
        }
    })
}

// 导出
$('#export').click(function () {
    $('#confirmModel').modal('show');
});

// 确认导出
function exportConfirm() {
    var url = '';
    $('#titleList li').each(function (index) {
        if ($(this).hasClass('active')) {
            if (index == 0) {
                url = '/payment/exportExcel';
            } else if (index == 1) {
                url = '/refund/exportExcel';
            } else if (index == 2) {
                url = '/cost/exportExcel';
            } else if (index == 3) {
                url = '/settlement/exportExcel';
            }
        }
    })
    window.location.href = url;
}

// 动态构造table
function initBootstrapTable(url, columns) {

    $('#idText').text('订单编号');
    var select2Url = url + 'getAllOrderId';

    $('#finishedStart').hide();
    $('#finishedEnd').hide();

    if (columns == 1) {
        $('#startTime').text('支付时间');
        $('#endTime').text('支付时间');
        columns = paymentColumns;
    } else if (columns == 2) {
        $('#startTime').text('退款支付时间');
        $('#endTime').text('退款支付时间');
        columns = refundColumns;
    } else if (columns == 3) {
        $('#finishedStart').show();
        $('#finishedEnd').show();
        $('#startTime').text('订单支付时间');
        $('#endTime').text('订单支付时间');
        columns = costColumns;
    } else if (columns == 4) {
        $('#startTime').text('结算时间');
        $('#endTime').text('结算时间');
        $('#idText').text('结算单号');
        columns = settlementColumns;
        var select2Url = url + 'getAllSettleId';
    }
    $('#tb').bootstrapTable('refreshOptions', {url: url + 'getDataByPage', columns: columns});

    $('#area').empty();
    $("#area").select2({
        placeholder: '--请选择--',
        data: getSelect2Data(select2Url),
        allowClear: true
    });
};

//刷新表格数据,点击你的按钮调用这个方法就可以刷新
function refresh() {
    $('#tb').bootstrapTable('refreshOptions', {pageNumber: 1});
}

// 切换样式
$('#titleList li').click(function () {
    $('#titleList li').removeClass('active');
    $(this).addClass('active');

    $('#beginTime1').val('');
    $('#endTime1').val('');
    $('#startTime2').val('');
    $('#startTime2').val('');
});

// 提示框
function showDialogMsg(msg) {
    $("#typeNameMes").html(msg);
    $("#alertText").modal("show");
}

// 查询按钮
$('#queryData').click(function () {

    // 组装地址和表头
    var url = '';
    var columns = [];
    $('#titleList li').each(function (index) {
        if ($(this).hasClass('active')) {
            if (index == 0) {
                url = '/payment/';
                columns = paymentColumns;
            } else if (index == 1) {
                url = '/refund/';
                columns = refundColumns;
            } else if (index == 2) {
                url = '/cost/';
                columns = costColumns;
            } else if (index == 3) {
                url = '/settlement/';
                columns = settlementColumns;
            }
        }
    })

    // 组装参数
/*    var params = {
        id: $("#area").val(),
        startTime: $('#beginTime1').val(),
        endTime: $('#endTime1').val(),
    }
    if ($('#startTime2').val()) {
        params.startTime1 = $('#startTime2').val();
    }
    if ($('#endTime2').val()) {
        params.endTime1 = $('#endTime2').val();
    }*/

    $('#tb').bootstrapTable('destroy', null);
    $('#tb').bootstrapTable({
        url: url + "selectByConditions",
        method: "get",
        striped: true,
        cache: false,
        pagination: true,
        sortable: false,
        pageNumber: 1,
        pageSize: 10,
        pageList: [10, 20, 30, 40, 50, 60, 70, 80 ,90, 100],
        columns: columns,
        sidePagination: "server",
        dataField: "data",
        showColumns: true,
        toolbar: '#toolbar',
        queryParams: function (params) {
            return {
                pageNum: params.offset / params.limit + 1,
                pageSize: params.limit,
                id: $("#area").val(),
                startTime: $('#beginTime1').val(),
                endTime: $('#endTime1').val(),
                startTime1: $('#startTime2').val(),
                endTime1: $('#endTime2').val()
            };
        },
        responseHandler: function (result) {
            return {
                total: result.total,
                data: result.list
            };
        },
    });

    /*$.ajax({
        type: "POST",
        url: url + 'selectByConditions',
        dataType: "JSON",
        data: params,
        async: false,
        cache: false,
        success: function(res) {
            $('#tb').bootstrapTable('load', {data: res});
        }
    });*/
})
