// 支付列表
var paymentColumns = [
    {
        field: 'orderId',
        title: '订单编号',
        align: 'center',
    },
    {
        field: 'paymentChannel',
        title: '支付渠道',
        align: 'center',
    },
    {
        field: 'paymentType',
        title: '支付类型',
        align: 'center',
    },
    {
        field: 'correspondOrderId',
        title: '对应订单',
        align: 'center',
    },
    {
        field: 'shopName',
        title: '店铺名称',
        align: 'center',
    },
    {
        field: 'buyerName',
        title: '买家名称',
        align: 'center',
    },
    {
        field: 'orderAmount',
        title: '订单金额',
        align: 'center',
    },
    {
        field: 'paymentTotalPrice',
        title: '支付总金额',
        align: 'center',
    },
    {
        field: 'bankPaymentId',
        title: '网银支付流水号',
        align: 'center',
    },
    {
        field: 'paymentTime',
        title: '支付时间',
        align: 'center',
    },
    /*   {
           field: 'oper',
           title: '操作',
           align: 'center',
           formatter: function () {
               return '<div id="del" style="cursor:pointer"><span class="glyphicon glyphicon glyphicon-trash"></span></div>';
           },
           events: {
               'click #del': function (e,value,row,index) {
                   $('#delText').html('确认删除订单编号为<span id="orderid" style="color:red">' + row.orderId + '</span>吗？');
                   $('#delAlert').modal('show');
               }
           }
       },*/
];

// 退款列表
var refundColumns = [
    {
        field: 'orderId',
        title: '订单编号',
        align: 'center',
    },
    {
        field: 'paymentType',
        title: '支付类型',
        align: 'center',
    },
    {
        field: 'correspondOrderId',
        title: '对应订单',
        align: 'center',
    },
    {
        field: 'shopName',
        title: '店铺名称',
        align: 'center',
    },
    {
        field: 'buyerName',
        title: '买家名称',
        align: 'center',
    },
    {
        field: 'bankRefundId',
        title: '网银退款流水号',
        align: 'center',
    },
    {
        field: 'refundPrice',
        title: '退款金额',
        align: 'center',
    },
    {
        field: 'refundPaymentTime',
        title: '退款支付时间',
        align: 'center',
    },
    {
        field: 'refundStatus',
        title: '退款状态',
        align: 'center',
    },
];

// 费用列表
var costColumns = [
    {
        field: 'orderId',
        title: '订单编号',
        align: 'center',
    },
    {
        field: 'paymentChannel',
        title: '支付渠道',
        align: 'center',
    },
    {
        field: 'shopName',
        title: '店铺名称',
        align: 'center',
    },
    {
        field: 'orderPaymentTime',
        title: '订单支付时间',
        align: 'center',
    },
    {
        field: 'orderCompletionTime',
        title: '订单完成时间',
        align: 'center',
    },
    {
        field: 'platformAllowancePrice',
        title: '平台补贴金额',
        align: 'center',
    },
    {
        field: 'platformTradingFee',
        title: '平台交易手续费',
        align: 'center',
    },
    {
        field: 'totalCost',
        title: '费用总金额',
        align: 'center',
    },
];

// 结算列表
var settlementColumns = [
    {
        field: 'settlementId',
        title: '结算单号',
        align: 'center',
    },
    {
        field: 'shopName',
        title: '店铺名称',
        align: 'center',
    },

    {
        field: 'orderId',
        title: '订单编号',
        align: 'center',
    },
    {
        field: 'orderTime',
        title: '下单时间',
        align: 'center',
    },
    {
        field: 'billingTime',
        title: '计费时间',
        align: 'center',
    },

    {
        field: 'settlementTime',
        title: '结算时间',
        align: 'center',
    },
    {
        field: 'orderPrice',
        title: '货款',
        align: 'center',
    },
    {
        field: 'platformAllowancePrice',
        title: '平台补贴',
        align: 'center',
    },

    {
        field: 'commissionMoney',
        title: '佣金',
        align: 'center',
    },
];