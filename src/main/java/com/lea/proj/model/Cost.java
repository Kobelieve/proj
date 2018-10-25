package com.lea.proj.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
    @Excel(name = "订单编号", orderNum = "0")
    private Long orderId;

    @Excel(name = "支付渠道", orderNum = "1")
    private String paymentChannel;

    @Excel(name = "店铺名称", orderNum = "2")
    private String shopName;

    @Excel(name = "订单支付时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "3")
    private Date orderPaymentTime;

    @Excel(name = "订单完成时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "4")
    private Date orderCompletionTime;

    @Excel(name = "平台补贴金额", orderNum = "5")
    private BigDecimal platformAllowancePrice;

    @Excel(name = "平台交易手续费", orderNum = "6")
    private BigDecimal platformTradingFee;

    @Excel(name = "费用总金额", orderNum = "7")
    private BigDecimal totalCost;

    //mybatis判断Id是否存在
    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public Cost(Long orderId, String paymentChannel, String shopName, Date orderPaymentTime, Date orderCompletionTime, BigDecimal platformAllowancePrice, BigDecimal platformTradingFee, BigDecimal totalCost) {
        this.orderId = orderId;
        this.paymentChannel = paymentChannel;
        this.shopName = shopName;
        this.orderPaymentTime = orderPaymentTime;
        this.orderCompletionTime = orderCompletionTime;
        this.platformAllowancePrice = platformAllowancePrice;
        this.platformTradingFee = platformTradingFee;
        this.totalCost = totalCost;
    }

    public Cost() {
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getOrderPaymentTime() {
        return orderPaymentTime;
    }

    public void setOrderPaymentTime(Date orderPaymentTime) {
        this.orderPaymentTime = orderPaymentTime;
    }

    public Date getOrderCompletionTime() {
        return orderCompletionTime;
    }

    public void setOrderCompletionTime(Date orderCompletionTime) {
        this.orderCompletionTime = orderCompletionTime;
    }

    public BigDecimal getPlatformAllowancePrice() {
        return platformAllowancePrice;
    }

    public void setPlatformAllowancePrice(BigDecimal platformAllowancePrice) {
        this.platformAllowancePrice = platformAllowancePrice;
    }

    public BigDecimal getPlatformTradingFee() {
        return platformTradingFee;
    }

    public void setPlatformTradingFee(BigDecimal platformTradingFee) {
        this.platformTradingFee = platformTradingFee;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}