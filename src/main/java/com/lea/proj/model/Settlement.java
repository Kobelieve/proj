package com.lea.proj.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

public class Settlement {

    @Excel(name = "订单编号", orderNum = "0")
    private Long orderId;

    @Excel(name = "结算单号", orderNum = "1")
    private Long settlementId;

    @Excel(name = "店铺名", orderNum = "2")
    private String shopName;

    @Excel(name = "下单时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "3")
    private Date orderTime;

    @Excel(name = "计费时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "4")
    private Date billingTime;

    @Excel(name = "结算时间", format = "yyyy-MM-dd HH:mm:ss", orderNum = "5")
    private Date settlementTime;

    @Excel(name = "货款", orderNum = "6")
    private BigDecimal orderPrice;

    @Excel(name = "平台补贴", orderNum = "7")
    private BigDecimal platformAllowancePrice;

    @Excel(name = "佣金", orderNum = "8")
    private BigDecimal commissionMoney;

    //mybatis判断Id是否存在
    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public Settlement(Long orderId, Long settlementId, String shopName, Date orderTime, Date billingTime, Date settlementTime, BigDecimal orderPrice, BigDecimal platformAllowancePrice, BigDecimal commissionMoney) {
        this.orderId = orderId;
        this.settlementId = settlementId;
        this.shopName = shopName;
        this.orderTime = orderTime;
        this.billingTime = billingTime;
        this.settlementTime = settlementTime;
        this.orderPrice = orderPrice;
        this.platformAllowancePrice = platformAllowancePrice;
        this.commissionMoney = commissionMoney;
    }

    public Settlement() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getBillingTime() {
        return billingTime;
    }

    public void setBillingTime(Date billingTime) {
        this.billingTime = billingTime;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getPlatformAllowancePrice() {
        return platformAllowancePrice;
    }

    public void setPlatformAllowancePrice(BigDecimal platformAllowancePrice) {
        this.platformAllowancePrice = platformAllowancePrice;
    }

    public BigDecimal getCommissionMoney() {
        return commissionMoney;
    }

    public void setCommissionMoney(BigDecimal commissionMoney) {
        this.commissionMoney = commissionMoney;
    }
}