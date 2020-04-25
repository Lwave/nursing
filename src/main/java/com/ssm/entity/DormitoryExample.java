package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class DormitoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DormitoryExample() {
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

        public Criteria andBedcountIsNull() {
            addCriterion("bedCount is null");
            return (Criteria) this;
        }

        public Criteria andBedcountIsNotNull() {
            addCriterion("bedCount is not null");
            return (Criteria) this;
        }

        public Criteria andBedcountEqualTo(Integer value) {
            addCriterion("bedCount =", value, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountNotEqualTo(Integer value) {
            addCriterion("bedCount <>", value, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountGreaterThan(Integer value) {
            addCriterion("bedCount >", value, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedCount >=", value, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountLessThan(Integer value) {
            addCriterion("bedCount <", value, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountLessThanOrEqualTo(Integer value) {
            addCriterion("bedCount <=", value, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountIn(List<Integer> values) {
            addCriterion("bedCount in", values, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountNotIn(List<Integer> values) {
            addCriterion("bedCount not in", values, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountBetween(Integer value1, Integer value2) {
            addCriterion("bedCount between", value1, value2, "bedcount");
            return (Criteria) this;
        }

        public Criteria andBedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("bedCount not between", value1, value2, "bedcount");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomNum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomNum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(String value) {
            addCriterion("roomNum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(String value) {
            addCriterion("roomNum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(String value) {
            addCriterion("roomNum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {
            addCriterion("roomNum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(String value) {
            addCriterion("roomNum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(String value) {
            addCriterion("roomNum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLike(String value) {
            addCriterion("roomNum like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotLike(String value) {
            addCriterion("roomNum not like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<String> values) {
            addCriterion("roomNum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<String> values) {
            addCriterion("roomNum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(String value1, String value2) {
            addCriterion("roomNum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(String value1, String value2) {
            addCriterion("roomNum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andLayernumIsNull() {
            addCriterion("layerNum is null");
            return (Criteria) this;
        }

        public Criteria andLayernumIsNotNull() {
            addCriterion("layerNum is not null");
            return (Criteria) this;
        }

        public Criteria andLayernumEqualTo(Integer value) {
            addCriterion("layerNum =", value, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumNotEqualTo(Integer value) {
            addCriterion("layerNum <>", value, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumGreaterThan(Integer value) {
            addCriterion("layerNum >", value, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("layerNum >=", value, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumLessThan(Integer value) {
            addCriterion("layerNum <", value, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumLessThanOrEqualTo(Integer value) {
            addCriterion("layerNum <=", value, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumIn(List<Integer> values) {
            addCriterion("layerNum in", values, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumNotIn(List<Integer> values) {
            addCriterion("layerNum not in", values, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumBetween(Integer value1, Integer value2) {
            addCriterion("layerNum between", value1, value2, "layernum");
            return (Criteria) this;
        }

        public Criteria andLayernumNotBetween(Integer value1, Integer value2) {
            addCriterion("layerNum not between", value1, value2, "layernum");
            return (Criteria) this;
        }

        public Criteria andDormnumIsNull() {
            addCriterion("dormNum is null");
            return (Criteria) this;
        }

        public Criteria andDormnumIsNotNull() {
            addCriterion("dormNum is not null");
            return (Criteria) this;
        }

        public Criteria andDormnumEqualTo(String value) {
            addCriterion("dormNum =", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumNotEqualTo(String value) {
            addCriterion("dormNum <>", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumGreaterThan(String value) {
            addCriterion("dormNum >", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumGreaterThanOrEqualTo(String value) {
            addCriterion("dormNum >=", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumLessThan(String value) {
            addCriterion("dormNum <", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumLessThanOrEqualTo(String value) {
            addCriterion("dormNum <=", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumLike(String value) {
            addCriterion("dormNum like", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumNotLike(String value) {
            addCriterion("dormNum not like", value, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumIn(List<String> values) {
            addCriterion("dormNum in", values, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumNotIn(List<String> values) {
            addCriterion("dormNum not in", values, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumBetween(String value1, String value2) {
            addCriterion("dormNum between", value1, value2, "dormnum");
            return (Criteria) this;
        }

        public Criteria andDormnumNotBetween(String value1, String value2) {
            addCriterion("dormNum not between", value1, value2, "dormnum");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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