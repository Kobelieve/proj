package com.lea.proj.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    @Excel(name = "订单编号", orderNum = "0")
    private Long orderId;

    @Excel(name = "支付渠道", orderNum = "1")
    private String paymentChannel;

    @Excel(name = "支付类型", orderNum = "2")
    private String paymentType;

    @Excel(name = "对应订单", orderNum = "3")
    private Long correspondOrderId;

    @Excel(name = "店铺名称", orderNum = "4")
    private String shopName;

    @Excel(name = "买家名称", orderNum = "5")
    private String buyerName;

    @Excel(name = "订单金额", orderNum = "6")
    private BigDecimal orderAmount;

    @Excel(name = "支付总金额", orderNum = "7")
    private BigDecimal paymentTotalPrice;

    @Excel(name = "网银支付流水号", orderNum = "8")
    private String bankPaymentId;

    @Excel(name = "支付时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "9")
    private Date paymentTime;

    //mybatis判断Id是否存在
    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public Payment(Long orderId, String paymentChannel, String paymentType, Long correspondOrderId, String shopName, String buyerName, BigDecimal orderAmount, BigDecimal paymentTotalPrice, String bankPaymentId, Date paymentTime) {
        this.orderId = orderId;
        this.paymentChannel = paymentChannel;
        this.paymentType = paymentType;
        this.correspondOrderId = correspondOrderId;
        this.shopName = shopName;
        this.buyerName = buyerName;
        this.orderAmount = orderAmount;
        this.paymentTotalPrice = paymentTotalPrice;
        this.bankPaymentId = bankPaymentId;
        this.paymentTime = paymentTime;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId=" + orderId +
                ", paymentChannel='" + paymentChannel + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", correspondOrderId=" + correspondOrderId +
                ", shopName='" + shopName + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", orderAmount=" + orderAmount +
                ", paymentTotalPrice=" + paymentTotalPrice +
                ", bankPaymentId='" + bankPaymentId + '\'' +
                ", paymentTime=" + paymentTime +
                '}';
    }

    public Payment() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Long getCorrespondOrderId() {
        return correspondOrderId;
    }

    public void setCorrespondOrderId(Long correspondOrderId) {
        this.correspondOrderId = correspondOrderId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getPaymentTotalPrice() {
        return paymentTotalPrice;
    }

    public void setPaymentTotalPrice(BigDecimal paymentTotalPrice) {
        this.paymentTotalPrice = paymentTotalPrice;
    }

    public String getBankPaymentId() {
        return bankPaymentId;
    }

    public void setBankPaymentId(String bankPaymentId) {
        this.bankPaymentId = bankPaymentId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}