package com.sxu.crm.basic.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  *
  * @className AdminExamineStepExample
  * @author 李今朝
  * @version1.0 
  * @description 
  * @createdTime 2020/3/24 22:53
  */
public class AdminExamineStepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExamineStepExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(Long value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(Long value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(Long value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(Long value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(Long value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<Long> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<Long> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(Long value1, Long value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(Long value1, Long value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepTypeIsNull() {
            addCriterion("step_type is null");
            return (Criteria) this;
        }

        public Criteria andStepTypeIsNotNull() {
            addCriterion("step_type is not null");
            return (Criteria) this;
        }

        public Criteria andStepTypeEqualTo(Integer value) {
            addCriterion("step_type =", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeNotEqualTo(Integer value) {
            addCriterion("step_type <>", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeGreaterThan(Integer value) {
            addCriterion("step_type >", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_type >=", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeLessThan(Integer value) {
            addCriterion("step_type <", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeLessThanOrEqualTo(Integer value) {
            addCriterion("step_type <=", value, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeIn(List<Integer> values) {
            addCriterion("step_type in", values, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeNotIn(List<Integer> values) {
            addCriterion("step_type not in", values, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeBetween(Integer value1, Integer value2) {
            addCriterion("step_type between", value1, value2, "stepType");
            return (Criteria) this;
        }

        public Criteria andStepTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("step_type not between", value1, value2, "stepType");
            return (Criteria) this;
        }

        public Criteria andExamineIdIsNull() {
            addCriterion("examine_id is null");
            return (Criteria) this;
        }

        public Criteria andExamineIdIsNotNull() {
            addCriterion("examine_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamineIdEqualTo(Integer value) {
            addCriterion("examine_id =", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotEqualTo(Integer value) {
            addCriterion("examine_id <>", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThan(Integer value) {
            addCriterion("examine_id >", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine_id >=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThan(Integer value) {
            addCriterion("examine_id <", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThanOrEqualTo(Integer value) {
            addCriterion("examine_id <=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdIn(List<Integer> values) {
            addCriterion("examine_id in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotIn(List<Integer> values) {
            addCriterion("examine_id not in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdBetween(Integer value1, Integer value2) {
            addCriterion("examine_id between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examine_id not between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNull() {
            addCriterion("check_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNotNull() {
            addCriterion("check_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdEqualTo(String value) {
            addCriterion("check_user_id =", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotEqualTo(String value) {
            addCriterion("check_user_id <>", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThan(String value) {
            addCriterion("check_user_id >", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_user_id >=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThan(String value) {
            addCriterion("check_user_id <", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThanOrEqualTo(String value) {
            addCriterion("check_user_id <=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLike(String value) {
            addCriterion("check_user_id like", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotLike(String value) {
            addCriterion("check_user_id not like", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIn(List<String> values) {
            addCriterion("check_user_id in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotIn(List<String> values) {
            addCriterion("check_user_id not in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdBetween(String value1, String value2) {
            addCriterion("check_user_id between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotBetween(String value1, String value2) {
            addCriterion("check_user_id not between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNull() {
            addCriterion("step_num is null");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNotNull() {
            addCriterion("step_num is not null");
            return (Criteria) this;
        }

        public Criteria andStepNumEqualTo(Integer value) {
            addCriterion("step_num =", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotEqualTo(Integer value) {
            addCriterion("step_num <>", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThan(Integer value) {
            addCriterion("step_num >", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_num >=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThan(Integer value) {
            addCriterion("step_num <", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThanOrEqualTo(Integer value) {
            addCriterion("step_num <=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumIn(List<Integer> values) {
            addCriterion("step_num in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotIn(List<Integer> values) {
            addCriterion("step_num not in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumBetween(Integer value1, Integer value2) {
            addCriterion("step_num between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotBetween(Integer value1, Integer value2) {
            addCriterion("step_num not between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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