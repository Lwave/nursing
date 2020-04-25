package com.ssm.entity;

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCostdateIsNull() {
            addCriterion("costDate is null");
            return (Criteria) this;
        }

        public Criteria andCostdateIsNotNull() {
            addCriterion("costDate is not null");
            return (Criteria) this;
        }

        public Criteria andCostdateEqualTo(Date value) {
            addCriterion("costDate =", value, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateNotEqualTo(Date value) {
            addCriterion("costDate <>", value, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateGreaterThan(Date value) {
            addCriterion("costDate >", value, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateGreaterThanOrEqualTo(Date value) {
            addCriterion("costDate >=", value, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateLessThan(Date value) {
            addCriterion("costDate <", value, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateLessThanOrEqualTo(Date value) {
            addCriterion("costDate <=", value, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateIn(List<Date> values) {
            addCriterion("costDate in", values, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateNotIn(List<Date> values) {
            addCriterion("costDate not in", values, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateBetween(Date value1, Date value2) {
            addCriterion("costDate between", value1, value2, "costdate");
            return (Criteria) this;
        }

        public Criteria andCostdateNotBetween(Date value1, Date value2) {
            addCriterion("costDate not between", value1, value2, "costdate");
            return (Criteria) this;
        }

        public Criteria andEaxmcostIsNull() {
            addCriterion("eaxmCost is null");
            return (Criteria) this;
        }

        public Criteria andEaxmcostIsNotNull() {
            addCriterion("eaxmCost is not null");
            return (Criteria) this;
        }

        public Criteria andEaxmcostEqualTo(Double value) {
            addCriterion("eaxmCost =", value, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostNotEqualTo(Double value) {
            addCriterion("eaxmCost <>", value, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostGreaterThan(Double value) {
            addCriterion("eaxmCost >", value, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostGreaterThanOrEqualTo(Double value) {
            addCriterion("eaxmCost >=", value, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostLessThan(Double value) {
            addCriterion("eaxmCost <", value, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostLessThanOrEqualTo(Double value) {
            addCriterion("eaxmCost <=", value, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostIn(List<Double> values) {
            addCriterion("eaxmCost in", values, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostNotIn(List<Double> values) {
            addCriterion("eaxmCost not in", values, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostBetween(Double value1, Double value2) {
            addCriterion("eaxmCost between", value1, value2, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andEaxmcostNotBetween(Double value1, Double value2) {
            addCriterion("eaxmCost not between", value1, value2, "eaxmcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostIsNull() {
            addCriterion("foodCost is null");
            return (Criteria) this;
        }

        public Criteria andFoodcostIsNotNull() {
            addCriterion("foodCost is not null");
            return (Criteria) this;
        }

        public Criteria andFoodcostEqualTo(Double value) {
            addCriterion("foodCost =", value, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostNotEqualTo(Double value) {
            addCriterion("foodCost <>", value, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostGreaterThan(Double value) {
            addCriterion("foodCost >", value, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostGreaterThanOrEqualTo(Double value) {
            addCriterion("foodCost >=", value, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostLessThan(Double value) {
            addCriterion("foodCost <", value, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostLessThanOrEqualTo(Double value) {
            addCriterion("foodCost <=", value, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostIn(List<Double> values) {
            addCriterion("foodCost in", values, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostNotIn(List<Double> values) {
            addCriterion("foodCost not in", values, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostBetween(Double value1, Double value2) {
            addCriterion("foodCost between", value1, value2, "foodcost");
            return (Criteria) this;
        }

        public Criteria andFoodcostNotBetween(Double value1, Double value2) {
            addCriterion("foodCost not between", value1, value2, "foodcost");
            return (Criteria) this;
        }

        public Criteria andLinecostIsNull() {
            addCriterion("lineCost is null");
            return (Criteria) this;
        }

        public Criteria andLinecostIsNotNull() {
            addCriterion("lineCost is not null");
            return (Criteria) this;
        }

        public Criteria andLinecostEqualTo(Double value) {
            addCriterion("lineCost =", value, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostNotEqualTo(Double value) {
            addCriterion("lineCost <>", value, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostGreaterThan(Double value) {
            addCriterion("lineCost >", value, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostGreaterThanOrEqualTo(Double value) {
            addCriterion("lineCost >=", value, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostLessThan(Double value) {
            addCriterion("lineCost <", value, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostLessThanOrEqualTo(Double value) {
            addCriterion("lineCost <=", value, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostIn(List<Double> values) {
            addCriterion("lineCost in", values, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostNotIn(List<Double> values) {
            addCriterion("lineCost not in", values, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostBetween(Double value1, Double value2) {
            addCriterion("lineCost between", value1, value2, "linecost");
            return (Criteria) this;
        }

        public Criteria andLinecostNotBetween(Double value1, Double value2) {
            addCriterion("lineCost not between", value1, value2, "linecost");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
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