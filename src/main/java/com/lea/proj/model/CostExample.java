package com.lea.proj.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNull() {
            addCriterion("payment_channel is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNotNull() {
            addCriterion("payment_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelEqualTo(String value) {
            addCriterion("payment_channel =", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotEqualTo(String value) {
            addCriterion("payment_channel <>", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThan(String value) {
            addCriterion("payment_channel >", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("payment_channel >=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThan(String value) {
            addCriterion("payment_channel <", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThanOrEqualTo(String value) {
            addCriterion("payment_channel <=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLike(String value) {
            addCriterion("payment_channel like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotLike(String value) {
            addCriterion("payment_channel not like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIn(List<String> values) {
            addCriterion("payment_channel in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotIn(List<String> values) {
            addCriterion("payment_channel not in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelBetween(String value1, String value2) {
            addCriterion("payment_channel between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotBetween(String value1, String value2) {
            addCriterion("payment_channel not between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeIsNull() {
            addCriterion("order_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeIsNotNull() {
            addCriterion("order_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeEqualTo(Date value) {
            addCriterion("order_payment_time =", value, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeNotEqualTo(Date value) {
            addCriterion("order_payment_time <>", value, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeGreaterThan(Date value) {
            addCriterion("order_payment_time >", value, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_payment_time >=", value, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeLessThan(Date value) {
            addCriterion("order_payment_time <", value, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_payment_time <=", value, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeIn(List<Date> values) {
            addCriterion("order_payment_time in", values, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeNotIn(List<Date> values) {
            addCriterion("order_payment_time not in", values, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("order_payment_time between", value1, value2, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_payment_time not between", value1, value2, "orderPaymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeIsNull() {
            addCriterion("order_completion_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeIsNotNull() {
            addCriterion("order_completion_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeEqualTo(Date value) {
            addCriterion("order_completion_time =", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeNotEqualTo(Date value) {
            addCriterion("order_completion_time <>", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeGreaterThan(Date value) {
            addCriterion("order_completion_time >", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_completion_time >=", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeLessThan(Date value) {
            addCriterion("order_completion_time <", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_completion_time <=", value, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeIn(List<Date> values) {
            addCriterion("order_completion_time in", values, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeNotIn(List<Date> values) {
            addCriterion("order_completion_time not in", values, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeBetween(Date value1, Date value2) {
            addCriterion("order_completion_time between", value1, value2, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletionTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_completion_time not between", value1, value2, "orderCompletionTime");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceIsNull() {
            addCriterion("platform_allowance_price is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceIsNotNull() {
            addCriterion("platform_allowance_price is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceEqualTo(BigDecimal value) {
            addCriterion("platform_allowance_price =", value, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceNotEqualTo(BigDecimal value) {
            addCriterion("platform_allowance_price <>", value, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceGreaterThan(BigDecimal value) {
            addCriterion("platform_allowance_price >", value, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_allowance_price >=", value, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceLessThan(BigDecimal value) {
            addCriterion("platform_allowance_price <", value, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_allowance_price <=", value, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceIn(List<BigDecimal> values) {
            addCriterion("platform_allowance_price in", values, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceNotIn(List<BigDecimal> values) {
            addCriterion("platform_allowance_price not in", values, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_allowance_price between", value1, value2, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformAllowancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_allowance_price not between", value1, value2, "platformAllowancePrice");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeIsNull() {
            addCriterion("platform_trading_fee is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeIsNotNull() {
            addCriterion("platform_trading_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeEqualTo(BigDecimal value) {
            addCriterion("platform_trading_fee =", value, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeNotEqualTo(BigDecimal value) {
            addCriterion("platform_trading_fee <>", value, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeGreaterThan(BigDecimal value) {
            addCriterion("platform_trading_fee >", value, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_trading_fee >=", value, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeLessThan(BigDecimal value) {
            addCriterion("platform_trading_fee <", value, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_trading_fee <=", value, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeIn(List<BigDecimal> values) {
            addCriterion("platform_trading_fee in", values, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeNotIn(List<BigDecimal> values) {
            addCriterion("platform_trading_fee not in", values, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_trading_fee between", value1, value2, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andPlatformTradingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_trading_fee not between", value1, value2, "platformTradingFee");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(BigDecimal value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(BigDecimal value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(BigDecimal value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<BigDecimal> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}