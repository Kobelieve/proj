package com.lea.proj.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

public class Refund {

    @Excel(name = "订单编号", orderNum = "0")
    private Long orderId;

    @Excel(name = "支付类型", orderNum = "1")
    private String paymentType;

    @Excel(name = "对应订单", orderNum = "2")
    private Long correspondOrderId;

    @Excel(name = "店铺名称", orderNum = "3")
    private String shopName;

    @Excel(name = "买家名称", orderNum = "4")
    private String buyerName;

    @Excel(name = "网银退款流水号", orderNum = "5")
    private String bankRefundId;

    @Excel(name = "退款金额", orderNum = "6")
    private BigDecimal refundPrice;

    @Excel(name = "退款支付时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "7")
    private Date refundPaymentTime;

    @Excel(name = "退款状态", orderNum = "8")
    private String refundStatus;

    //mybatis判断Id是否存在
    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public Refund(Long orderId, String paymentType, Long correspondOrderId, String shopName, String buyerName, String bankRefundId, BigDecimal refundPrice, Date refundPaymentTime, String refundStatus) {
        this.orderId = orderId;
        this.paymentType = paymentType;
        this.correspondOrderId = correspondOrderId;
        this.shopName = shopName;
        this.buyerName = buyerName;
        this.bankRefundId = bankRefundId;
        this.refundPrice = refundPrice;
        this.refundPaymentTime = refundPaymentTime;
        this.refundStatus = refundStatus;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "orderId=" + orderId +
                ", paymentType='" + paymentType + '\'' +
                ", correspondOrderId=" + correspondOrderId +
                ", shopName='" + shopName + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", bankRefundId='" + bankRefundId + '\'' +
                ", refundPrice=" + refundPrice +
                ", refundPaymentTime=" + refundPaymentTime +
                ", refundStatus='" + refundStatus + '\'' +
                '}';
    }

    public Refund() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public String getBankRefundId() {
        return bankRefundId;
    }

    public void setBankRefundId(String bankRefundId) {
        this.bankRefundId = bankRefundId;
    }

    public BigDecimal getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(BigDecimal refundPrice) {
        this.refundPrice = refundPrice;
    }

    public Date getRefundPaymentTime() {
        return refundPaymentTime;
    }

    public void setRefundPaymentTime(Date refundPaymentTime) {
        this.refundPaymentTime = refundPaymentTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
}