// 初始化bootstrapTable
$('#tb').bootstrapTable({
    url: "/payment/getDataByPage",
    method: "get",
    striped: true,                      //是否显示行间隔色
    cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
    pagination: true,                   //是否显示分页（*）
    sortable: false,                    //是否启用排序
    pageNumber: 1,
    pageSize: 10,
    pageList: [10, 20, 30, 40, 50, 60, 70, 80 ,90, 100],
    columns: paymentColumns,
    sidePagination: "server",
    dataField: "data",
    showColumns: true,
    toolbar: '#toolbar',
    queryParams: function (params) {
        return {
            pageNum: params.offset / params.limit + 1,
            pageSize: params.limit
        };
    },
    responseHandler: function (result) {
        return {
            total: result.total, //总页数,前面的key必须为"total"
            data: result.list //行数据，前面的key要与之前设置的dataField的值一致.
        };
    },
});

// 获取下拉框数据
var getSelect2Data = function(url) {
    var result = [];
    $.ajax({
        type: "GET",
        url: url,
        async: false,
        cache: false,
        success: function(res) {
            result = res;
        }
    });
    return result;
}

// 初始化select2
$("#area").select2({
    data: getSelect2Data('/payment/getAllOrderId'),
    placeholder: '--请选择--',
    allowClear: true
});

// 初始化日期控件
jeDate({
    dateCell: "#beginTime1",
    isTime: true,
    format: "YYYY-MM-DD hh:mm:ss", //控制是否显示小时
});
jeDate({
    dateCell: "#endTime1",
    isTime: true,
    format: "YYYY-MM-DD hh:mm:ss", //控制是否显示小时
});

jeDate({
    dateCell: "#startTime2",
    isTime: true,
    format: "YYYY-MM-DD hh:mm:ss", //控制是否显示小时
});
jeDate({
    dateCell: "#endTime2",
    isTime: true,
    format: "YYYY-MM-DD hh:mm:ss", //控制是否显示小时
});
$('#finishedStart').hide();
$('#finishedEnd').hide();