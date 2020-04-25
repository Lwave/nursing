package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class BodyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BodyInfoExample() {
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

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andColdIsNull() {
            addCriterion("cold is null");
            return (Criteria) this;
        }

        public Criteria andColdIsNotNull() {
            addCriterion("cold is not null");
            return (Criteria) this;
        }

        public Criteria andColdEqualTo(String value) {
            addCriterion("cold =", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdNotEqualTo(String value) {
            addCriterion("cold <>", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdGreaterThan(String value) {
            addCriterion("cold >", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdGreaterThanOrEqualTo(String value) {
            addCriterion("cold >=", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdLessThan(String value) {
            addCriterion("cold <", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdLessThanOrEqualTo(String value) {
            addCriterion("cold <=", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdLike(String value) {
            addCriterion("cold like", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdNotLike(String value) {
            addCriterion("cold not like", value, "cold");
            return (Criteria) this;
        }

        public Criteria andColdIn(List<String> values) {
            addCriterion("cold in", values, "cold");
            return (Criteria) this;
        }

        public Criteria andColdNotIn(List<String> values) {
            addCriterion("cold not in", values, "cold");
            return (Criteria) this;
        }

        public Criteria andColdBetween(String value1, String value2) {
            addCriterion("cold between", value1, value2, "cold");
            return (Criteria) this;
        }

        public Criteria andColdNotBetween(String value1, String value2) {
            addCriterion("cold not between", value1, value2, "cold");
            return (Criteria) this;
        }

        public Criteria andBodyattentIsNull() {
            addCriterion("bodyAttent is null");
            return (Criteria) this;
        }

        public Criteria andBodyattentIsNotNull() {
            addCriterion("bodyAttent is not null");
            return (Criteria) this;
        }

        public Criteria andBodyattentEqualTo(String value) {
            addCriterion("bodyAttent =", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentNotEqualTo(String value) {
            addCriterion("bodyAttent <>", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentGreaterThan(String value) {
            addCriterion("bodyAttent >", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentGreaterThanOrEqualTo(String value) {
            addCriterion("bodyAttent >=", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentLessThan(String value) {
            addCriterion("bodyAttent <", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentLessThanOrEqualTo(String value) {
            addCriterion("bodyAttent <=", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentLike(String value) {
            addCriterion("bodyAttent like", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentNotLike(String value) {
            addCriterion("bodyAttent not like", value, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentIn(List<String> values) {
            addCriterion("bodyAttent in", values, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentNotIn(List<String> values) {
            addCriterion("bodyAttent not in", values, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentBetween(String value1, String value2) {
            addCriterion("bodyAttent between", value1, value2, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andBodyattentNotBetween(String value1, String value2) {
            addCriterion("bodyAttent not between", value1, value2, "bodyattent");
            return (Criteria) this;
        }

        public Criteria andChronicIsNull() {
            addCriterion("chronic is null");
            return (Criteria) this;
        }

        public Criteria andChronicIsNotNull() {
            addCriterion("chronic is not null");
            return (Criteria) this;
        }

        public Criteria andChronicEqualTo(String value) {
            addCriterion("chronic =", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicNotEqualTo(String value) {
            addCriterion("chronic <>", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicGreaterThan(String value) {
            addCriterion("chronic >", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicGreaterThanOrEqualTo(String value) {
            addCriterion("chronic >=", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicLessThan(String value) {
            addCriterion("chronic <", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicLessThanOrEqualTo(String value) {
            addCriterion("chronic <=", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicLike(String value) {
            addCriterion("chronic like", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicNotLike(String value) {
            addCriterion("chronic not like", value, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicIn(List<String> values) {
            addCriterion("chronic in", values, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicNotIn(List<String> values) {
            addCriterion("chronic not in", values, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicBetween(String value1, String value2) {
            addCriterion("chronic between", value1, value2, "chronic");
            return (Criteria) this;
        }

        public Criteria andChronicNotBetween(String value1, String value2) {
            addCriterion("chronic not between", value1, value2, "chronic");
            return (Criteria) this;
        }

        public Criteria andUrineIsNull() {
            addCriterion("urine is null");
            return (Criteria) this;
        }

        public Criteria andUrineIsNotNull() {
            addCriterion("urine is not null");
            return (Criteria) this;
        }

        public Criteria andUrineEqualTo(String value) {
            addCriterion("urine =", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineNotEqualTo(String value) {
            addCriterion("urine <>", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineGreaterThan(String value) {
            addCriterion("urine >", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineGreaterThanOrEqualTo(String value) {
            addCriterion("urine >=", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineLessThan(String value) {
            addCriterion("urine <", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineLessThanOrEqualTo(String value) {
            addCriterion("urine <=", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineLike(String value) {
            addCriterion("urine like", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineNotLike(String value) {
            addCriterion("urine not like", value, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineIn(List<String> values) {
            addCriterion("urine in", values, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineNotIn(List<String> values) {
            addCriterion("urine not in", values, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineBetween(String value1, String value2) {
            addCriterion("urine between", value1, value2, "urine");
            return (Criteria) this;
        }

        public Criteria andUrineNotBetween(String value1, String value2) {
            addCriterion("urine not between", value1, value2, "urine");
            return (Criteria) this;
        }

        public Criteria andShitIsNull() {
            addCriterion("shit is null");
            return (Criteria) this;
        }

        public Criteria andShitIsNotNull() {
            addCriterion("shit is not null");
            return (Criteria) this;
        }

        public Criteria andShitEqualTo(String value) {
            addCriterion("shit =", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitNotEqualTo(String value) {
            addCriterion("shit <>", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitGreaterThan(String value) {
            addCriterion("shit >", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitGreaterThanOrEqualTo(String value) {
            addCriterion("shit >=", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitLessThan(String value) {
            addCriterion("shit <", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitLessThanOrEqualTo(String value) {
            addCriterion("shit <=", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitLike(String value) {
            addCriterion("shit like", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitNotLike(String value) {
            addCriterion("shit not like", value, "shit");
            return (Criteria) this;
        }

        public Criteria andShitIn(List<String> values) {
            addCriterion("shit in", values, "shit");
            return (Criteria) this;
        }

        public Criteria andShitNotIn(List<String> values) {
            addCriterion("shit not in", values, "shit");
            return (Criteria) this;
        }

        public Criteria andShitBetween(String value1, String value2) {
            addCriterion("shit between", value1, value2, "shit");
            return (Criteria) this;
        }

        public Criteria andShitNotBetween(String value1, String value2) {
            addCriterion("shit not between", value1, value2, "shit");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNull() {
            addCriterion("symptom is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNotNull() {
            addCriterion("symptom is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomEqualTo(String value) {
            addCriterion("symptom =", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotEqualTo(String value) {
            addCriterion("symptom <>", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThan(String value) {
            addCriterion("symptom >", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("symptom >=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThan(String value) {
            addCriterion("symptom <", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThanOrEqualTo(String value) {
            addCriterion("symptom <=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLike(String value) {
            addCriterion("symptom like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotLike(String value) {
            addCriterion("symptom not like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomIn(List<String> values) {
            addCriterion("symptom in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotIn(List<String> values) {
            addCriterion("symptom not in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomBetween(String value1, String value2) {
            addCriterion("symptom between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotBetween(String value1, String value2) {
            addCriterion("symptom not between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andTightnessIsNull() {
            addCriterion("tightness is null");
            return (Criteria) this;
        }

        public Criteria andTightnessIsNotNull() {
            addCriterion("tightness is not null");
            return (Criteria) this;
        }

        public Criteria andTightnessEqualTo(Integer value) {
            addCriterion("tightness =", value, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessNotEqualTo(Integer value) {
            addCriterion("tightness <>", value, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessGreaterThan(Integer value) {
            addCriterion("tightness >", value, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessGreaterThanOrEqualTo(Integer value) {
            addCriterion("tightness >=", value, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessLessThan(Integer value) {
            addCriterion("tightness <", value, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessLessThanOrEqualTo(Integer value) {
            addCriterion("tightness <=", value, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessIn(List<Integer> values) {
            addCriterion("tightness in", values, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessNotIn(List<Integer> values) {
            addCriterion("tightness not in", values, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessBetween(Integer value1, Integer value2) {
            addCriterion("tightness between", value1, value2, "tightness");
            return (Criteria) this;
        }

        public Criteria andTightnessNotBetween(Integer value1, Integer value2) {
            addCriterion("tightness not between", value1, value2, "tightness");
            return (Criteria) this;
        }

        public Criteria andMedhistoryIsNull() {
            addCriterion("medHistory is null");
            return (Criteria) this;
        }

        public Criteria andMedhistoryIsNotNull() {
            addCriterion("medHistory is not null");
            return (Criteria) this;
        }

        public Criteria andMedhistoryEqualTo(String value) {
            addCriterion("medHistory =", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryNotEqualTo(String value) {
            addCriterion("medHistory <>", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryGreaterThan(String value) {
            addCriterion("medHistory >", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("medHistory >=", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryLessThan(String value) {
            addCriterion("medHistory <", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryLessThanOrEqualTo(String value) {
            addCriterion("medHistory <=", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryLike(String value) {
            addCriterion("medHistory like", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryNotLike(String value) {
            addCriterion("medHistory not like", value, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryIn(List<String> values) {
            addCriterion("medHistory in", values, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryNotIn(List<String> values) {
            addCriterion("medHistory not in", values, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryBetween(String value1, String value2) {
            addCriterion("medHistory between", value1, value2, "medhistory");
            return (Criteria) this;
        }

        public Criteria andMedhistoryNotBetween(String value1, String value2) {
            addCriterion("medHistory not between", value1, value2, "medhistory");
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