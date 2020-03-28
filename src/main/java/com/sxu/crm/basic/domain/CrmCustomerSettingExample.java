package com.sxu.crm.basic.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  *
  * @className CrmCustomerSettingExample
  * @author 李今朝
  * @version1.0 
  * @description 
  * @createdTime 2020/3/24 22:53
  */
public class CrmCustomerSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmCustomerSettingExample() {
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

        public Criteria andSettingIdIsNull() {
            addCriterion("setting_id is null");
            return (Criteria) this;
        }

        public Criteria andSettingIdIsNotNull() {
            addCriterion("setting_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettingIdEqualTo(Integer value) {
            addCriterion("setting_id =", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdNotEqualTo(Integer value) {
            addCriterion("setting_id <>", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdGreaterThan(Integer value) {
            addCriterion("setting_id >", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("setting_id >=", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdLessThan(Integer value) {
            addCriterion("setting_id <", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdLessThanOrEqualTo(Integer value) {
            addCriterion("setting_id <=", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdIn(List<Integer> values) {
            addCriterion("setting_id in", values, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdNotIn(List<Integer> values) {
            addCriterion("setting_id not in", values, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdBetween(Integer value1, Integer value2) {
            addCriterion("setting_id between", value1, value2, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("setting_id not between", value1, value2, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingNameIsNull() {
            addCriterion("setting_name is null");
            return (Criteria) this;
        }

        public Criteria andSettingNameIsNotNull() {
            addCriterion("setting_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettingNameEqualTo(String value) {
            addCriterion("setting_name =", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotEqualTo(String value) {
            addCriterion("setting_name <>", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameGreaterThan(String value) {
            addCriterion("setting_name >", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameGreaterThanOrEqualTo(String value) {
            addCriterion("setting_name >=", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameLessThan(String value) {
            addCriterion("setting_name <", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameLessThanOrEqualTo(String value) {
            addCriterion("setting_name <=", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameLike(String value) {
            addCriterion("setting_name like", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotLike(String value) {
            addCriterion("setting_name not like", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameIn(List<String> values) {
            addCriterion("setting_name in", values, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotIn(List<String> values) {
            addCriterion("setting_name not in", values, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameBetween(String value1, String value2) {
            addCriterion("setting_name between", value1, value2, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotBetween(String value1, String value2) {
            addCriterion("setting_name not between", value1, value2, "settingName");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIsNull() {
            addCriterion("customer_num is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIsNotNull() {
            addCriterion("customer_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumEqualTo(Integer value) {
            addCriterion("customer_num =", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotEqualTo(Integer value) {
            addCriterion("customer_num <>", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumGreaterThan(Integer value) {
            addCriterion("customer_num >", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_num >=", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLessThan(Integer value) {
            addCriterion("customer_num <", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLessThanOrEqualTo(Integer value) {
            addCriterion("customer_num <=", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIn(List<Integer> values) {
            addCriterion("customer_num in", values, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotIn(List<Integer> values) {
            addCriterion("customer_num not in", values, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumBetween(Integer value1, Integer value2) {
            addCriterion("customer_num between", value1, value2, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_num not between", value1, value2, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerDealIsNull() {
            addCriterion("customer_deal is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDealIsNotNull() {
            addCriterion("customer_deal is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDealEqualTo(Integer value) {
            addCriterion("customer_deal =", value, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealNotEqualTo(Integer value) {
            addCriterion("customer_deal <>", value, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealGreaterThan(Integer value) {
            addCriterion("customer_deal >", value, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_deal >=", value, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealLessThan(Integer value) {
            addCriterion("customer_deal <", value, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealLessThanOrEqualTo(Integer value) {
            addCriterion("customer_deal <=", value, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealIn(List<Integer> values) {
            addCriterion("customer_deal in", values, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealNotIn(List<Integer> values) {
            addCriterion("customer_deal not in", values, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealBetween(Integer value1, Integer value2) {
            addCriterion("customer_deal between", value1, value2, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andCustomerDealNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_deal not between", value1, value2, "customerDeal");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
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