package com.sxu.crm.basic.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  *
  * @className OaLogRelationExample
  * @author 李今朝
  * @version1.0 
  * @description 
  * @createdTime 2020/3/24 22:53
  */
public class OaLogRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaLogRelationExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsIsNull() {
            addCriterion("customer_ids is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsIsNotNull() {
            addCriterion("customer_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsEqualTo(String value) {
            addCriterion("customer_ids =", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsNotEqualTo(String value) {
            addCriterion("customer_ids <>", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsGreaterThan(String value) {
            addCriterion("customer_ids >", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsGreaterThanOrEqualTo(String value) {
            addCriterion("customer_ids >=", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsLessThan(String value) {
            addCriterion("customer_ids <", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsLessThanOrEqualTo(String value) {
            addCriterion("customer_ids <=", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsLike(String value) {
            addCriterion("customer_ids like", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsNotLike(String value) {
            addCriterion("customer_ids not like", value, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsIn(List<String> values) {
            addCriterion("customer_ids in", values, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsNotIn(List<String> values) {
            addCriterion("customer_ids not in", values, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsBetween(String value1, String value2) {
            addCriterion("customer_ids between", value1, value2, "customerIds");
            return (Criteria) this;
        }

        public Criteria andCustomerIdsNotBetween(String value1, String value2) {
            addCriterion("customer_ids not between", value1, value2, "customerIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsIsNull() {
            addCriterion("contacts_ids is null");
            return (Criteria) this;
        }

        public Criteria andContactsIdsIsNotNull() {
            addCriterion("contacts_ids is not null");
            return (Criteria) this;
        }

        public Criteria andContactsIdsEqualTo(String value) {
            addCriterion("contacts_ids =", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsNotEqualTo(String value) {
            addCriterion("contacts_ids <>", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsGreaterThan(String value) {
            addCriterion("contacts_ids >", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_ids >=", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsLessThan(String value) {
            addCriterion("contacts_ids <", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsLessThanOrEqualTo(String value) {
            addCriterion("contacts_ids <=", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsLike(String value) {
            addCriterion("contacts_ids like", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsNotLike(String value) {
            addCriterion("contacts_ids not like", value, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsIn(List<String> values) {
            addCriterion("contacts_ids in", values, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsNotIn(List<String> values) {
            addCriterion("contacts_ids not in", values, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsBetween(String value1, String value2) {
            addCriterion("contacts_ids between", value1, value2, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andContactsIdsNotBetween(String value1, String value2) {
            addCriterion("contacts_ids not between", value1, value2, "contactsIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsIsNull() {
            addCriterion("business_ids is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsIsNotNull() {
            addCriterion("business_ids is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsEqualTo(String value) {
            addCriterion("business_ids =", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsNotEqualTo(String value) {
            addCriterion("business_ids <>", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsGreaterThan(String value) {
            addCriterion("business_ids >", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsGreaterThanOrEqualTo(String value) {
            addCriterion("business_ids >=", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsLessThan(String value) {
            addCriterion("business_ids <", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsLessThanOrEqualTo(String value) {
            addCriterion("business_ids <=", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsLike(String value) {
            addCriterion("business_ids like", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsNotLike(String value) {
            addCriterion("business_ids not like", value, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsIn(List<String> values) {
            addCriterion("business_ids in", values, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsNotIn(List<String> values) {
            addCriterion("business_ids not in", values, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsBetween(String value1, String value2) {
            addCriterion("business_ids between", value1, value2, "businessIds");
            return (Criteria) this;
        }

        public Criteria andBusinessIdsNotBetween(String value1, String value2) {
            addCriterion("business_ids not between", value1, value2, "businessIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsIsNull() {
            addCriterion("contract_ids is null");
            return (Criteria) this;
        }

        public Criteria andContractIdsIsNotNull() {
            addCriterion("contract_ids is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdsEqualTo(String value) {
            addCriterion("contract_ids =", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotEqualTo(String value) {
            addCriterion("contract_ids <>", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsGreaterThan(String value) {
            addCriterion("contract_ids >", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsGreaterThanOrEqualTo(String value) {
            addCriterion("contract_ids >=", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLessThan(String value) {
            addCriterion("contract_ids <", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLessThanOrEqualTo(String value) {
            addCriterion("contract_ids <=", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLike(String value) {
            addCriterion("contract_ids like", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotLike(String value) {
            addCriterion("contract_ids not like", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsIn(List<String> values) {
            addCriterion("contract_ids in", values, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotIn(List<String> values) {
            addCriterion("contract_ids not in", values, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsBetween(String value1, String value2) {
            addCriterion("contract_ids between", value1, value2, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotBetween(String value1, String value2) {
            addCriterion("contract_ids not between", value1, value2, "contractIds");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
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