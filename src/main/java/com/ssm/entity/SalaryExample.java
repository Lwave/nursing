package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
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

        public Criteria andPerformanceIsNull() {
            addCriterion("performance is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("performance is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(Double value) {
            addCriterion("performance =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(Double value) {
            addCriterion("performance <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(Double value) {
            addCriterion("performance >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(Double value) {
            addCriterion("performance >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(Double value) {
            addCriterion("performance <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(Double value) {
            addCriterion("performance <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<Double> values) {
            addCriterion("performance in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<Double> values) {
            addCriterion("performance not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(Double value1, Double value2) {
            addCriterion("performance between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(Double value1, Double value2) {
            addCriterion("performance not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andFactsalaryIsNull() {
            addCriterion("factSalary is null");
            return (Criteria) this;
        }

        public Criteria andFactsalaryIsNotNull() {
            addCriterion("factSalary is not null");
            return (Criteria) this;
        }

        public Criteria andFactsalaryEqualTo(Double value) {
            addCriterion("factSalary =", value, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryNotEqualTo(Double value) {
            addCriterion("factSalary <>", value, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryGreaterThan(Double value) {
            addCriterion("factSalary >", value, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("factSalary >=", value, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryLessThan(Double value) {
            addCriterion("factSalary <", value, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryLessThanOrEqualTo(Double value) {
            addCriterion("factSalary <=", value, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryIn(List<Double> values) {
            addCriterion("factSalary in", values, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryNotIn(List<Double> values) {
            addCriterion("factSalary not in", values, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryBetween(Double value1, Double value2) {
            addCriterion("factSalary between", value1, value2, "factsalary");
            return (Criteria) this;
        }

        public Criteria andFactsalaryNotBetween(Double value1, Double value2) {
            addCriterion("factSalary not between", value1, value2, "factsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsituationIsNull() {
            addCriterion("deductSituation is null");
            return (Criteria) this;
        }

        public Criteria andDeductsituationIsNotNull() {
            addCriterion("deductSituation is not null");
            return (Criteria) this;
        }

        public Criteria andDeductsituationEqualTo(String value) {
            addCriterion("deductSituation =", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationNotEqualTo(String value) {
            addCriterion("deductSituation <>", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationGreaterThan(String value) {
            addCriterion("deductSituation >", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationGreaterThanOrEqualTo(String value) {
            addCriterion("deductSituation >=", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationLessThan(String value) {
            addCriterion("deductSituation <", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationLessThanOrEqualTo(String value) {
            addCriterion("deductSituation <=", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationLike(String value) {
            addCriterion("deductSituation like", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationNotLike(String value) {
            addCriterion("deductSituation not like", value, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationIn(List<String> values) {
            addCriterion("deductSituation in", values, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationNotIn(List<String> values) {
            addCriterion("deductSituation not in", values, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationBetween(String value1, String value2) {
            addCriterion("deductSituation between", value1, value2, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsituationNotBetween(String value1, String value2) {
            addCriterion("deductSituation not between", value1, value2, "deductsituation");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryIsNull() {
            addCriterion("deductSalary is null");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryIsNotNull() {
            addCriterion("deductSalary is not null");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryEqualTo(Double value) {
            addCriterion("deductSalary =", value, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryNotEqualTo(Double value) {
            addCriterion("deductSalary <>", value, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryGreaterThan(Double value) {
            addCriterion("deductSalary >", value, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("deductSalary >=", value, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryLessThan(Double value) {
            addCriterion("deductSalary <", value, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryLessThanOrEqualTo(Double value) {
            addCriterion("deductSalary <=", value, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryIn(List<Double> values) {
            addCriterion("deductSalary in", values, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryNotIn(List<Double> values) {
            addCriterion("deductSalary not in", values, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryBetween(Double value1, Double value2) {
            addCriterion("deductSalary between", value1, value2, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andDeductsalaryNotBetween(Double value1, Double value2) {
            addCriterion("deductSalary not between", value1, value2, "deductsalary");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
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