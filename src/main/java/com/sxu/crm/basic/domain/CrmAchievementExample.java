package com.sxu.crm.basic.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
  *
  * @className CrmAchievementExample
  * @author 李今朝
  * @version1.0 
  * @description 
  * @createdTime 2020/3/24 22:53
  */
public class CrmAchievementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmAchievementExample() {
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

        public Criteria andAchievementIdIsNull() {
            addCriterion("achievement_id is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIdIsNotNull() {
            addCriterion("achievement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementIdEqualTo(Integer value) {
            addCriterion("achievement_id =", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdNotEqualTo(Integer value) {
            addCriterion("achievement_id <>", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdGreaterThan(Integer value) {
            addCriterion("achievement_id >", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("achievement_id >=", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdLessThan(Integer value) {
            addCriterion("achievement_id <", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdLessThanOrEqualTo(Integer value) {
            addCriterion("achievement_id <=", value, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdIn(List<Integer> values) {
            addCriterion("achievement_id in", values, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdNotIn(List<Integer> values) {
            addCriterion("achievement_id not in", values, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdBetween(Integer value1, Integer value2) {
            addCriterion("achievement_id between", value1, value2, "achievementId");
            return (Criteria) this;
        }

        public Criteria andAchievementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("achievement_id not between", value1, value2, "achievementId");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNull() {
            addCriterion("obj_id is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("obj_id is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(Integer value) {
            addCriterion("obj_id =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(Integer value) {
            addCriterion("obj_id <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(Integer value) {
            addCriterion("obj_id >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("obj_id >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(Integer value) {
            addCriterion("obj_id <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(Integer value) {
            addCriterion("obj_id <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<Integer> values) {
            addCriterion("obj_id in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<Integer> values) {
            addCriterion("obj_id not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(Integer value1, Integer value2) {
            addCriterion("obj_id between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("obj_id not between", value1, value2, "objId");
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

        public Criteria andYearIsNull() {
            addCriterion("`year` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`year` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("`year` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("`year` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("`year` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("`year` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("`year` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("`year` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("`year` like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("`year` not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("`year` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("`year` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("`year` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("`year` not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNull() {
            addCriterion("january is null");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNotNull() {
            addCriterion("january is not null");
            return (Criteria) this;
        }

        public Criteria andJanuaryEqualTo(BigDecimal value) {
            addCriterion("january =", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotEqualTo(BigDecimal value) {
            addCriterion("january <>", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThan(BigDecimal value) {
            addCriterion("january >", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("january >=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThan(BigDecimal value) {
            addCriterion("january <", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("january <=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryIn(List<BigDecimal> values) {
            addCriterion("january in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotIn(List<BigDecimal> values) {
            addCriterion("january not in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("january between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("january not between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNull() {
            addCriterion("february is null");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNotNull() {
            addCriterion("february is not null");
            return (Criteria) this;
        }

        public Criteria andFebruaryEqualTo(BigDecimal value) {
            addCriterion("february =", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotEqualTo(BigDecimal value) {
            addCriterion("february <>", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThan(BigDecimal value) {
            addCriterion("february >", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("february >=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThan(BigDecimal value) {
            addCriterion("february <", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("february <=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryIn(List<BigDecimal> values) {
            addCriterion("february in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotIn(List<BigDecimal> values) {
            addCriterion("february not in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("february between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("february not between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andMarchIsNull() {
            addCriterion("march is null");
            return (Criteria) this;
        }

        public Criteria andMarchIsNotNull() {
            addCriterion("march is not null");
            return (Criteria) this;
        }

        public Criteria andMarchEqualTo(BigDecimal value) {
            addCriterion("march =", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotEqualTo(BigDecimal value) {
            addCriterion("march <>", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThan(BigDecimal value) {
            addCriterion("march >", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("march >=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThan(BigDecimal value) {
            addCriterion("march <", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThanOrEqualTo(BigDecimal value) {
            addCriterion("march <=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchIn(List<BigDecimal> values) {
            addCriterion("march in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotIn(List<BigDecimal> values) {
            addCriterion("march not in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("march between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("march not between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andAprilIsNull() {
            addCriterion("april is null");
            return (Criteria) this;
        }

        public Criteria andAprilIsNotNull() {
            addCriterion("april is not null");
            return (Criteria) this;
        }

        public Criteria andAprilEqualTo(BigDecimal value) {
            addCriterion("april =", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotEqualTo(BigDecimal value) {
            addCriterion("april <>", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThan(BigDecimal value) {
            addCriterion("april >", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("april >=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThan(BigDecimal value) {
            addCriterion("april <", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThanOrEqualTo(BigDecimal value) {
            addCriterion("april <=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilIn(List<BigDecimal> values) {
            addCriterion("april in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotIn(List<BigDecimal> values) {
            addCriterion("april not in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("april between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("april not between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andMayIsNull() {
            addCriterion("may is null");
            return (Criteria) this;
        }

        public Criteria andMayIsNotNull() {
            addCriterion("may is not null");
            return (Criteria) this;
        }

        public Criteria andMayEqualTo(BigDecimal value) {
            addCriterion("may =", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotEqualTo(BigDecimal value) {
            addCriterion("may <>", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThan(BigDecimal value) {
            addCriterion("may >", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("may >=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThan(BigDecimal value) {
            addCriterion("may <", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("may <=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayIn(List<BigDecimal> values) {
            addCriterion("may in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotIn(List<BigDecimal> values) {
            addCriterion("may not in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("may between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("may not between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andJuneIsNull() {
            addCriterion("june is null");
            return (Criteria) this;
        }

        public Criteria andJuneIsNotNull() {
            addCriterion("june is not null");
            return (Criteria) this;
        }

        public Criteria andJuneEqualTo(BigDecimal value) {
            addCriterion("june =", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotEqualTo(BigDecimal value) {
            addCriterion("june <>", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThan(BigDecimal value) {
            addCriterion("june >", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("june >=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThan(BigDecimal value) {
            addCriterion("june <", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("june <=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneIn(List<BigDecimal> values) {
            addCriterion("june in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotIn(List<BigDecimal> values) {
            addCriterion("june not in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("june between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("june not between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJulyIsNull() {
            addCriterion("july is null");
            return (Criteria) this;
        }

        public Criteria andJulyIsNotNull() {
            addCriterion("july is not null");
            return (Criteria) this;
        }

        public Criteria andJulyEqualTo(BigDecimal value) {
            addCriterion("july =", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotEqualTo(BigDecimal value) {
            addCriterion("july <>", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThan(BigDecimal value) {
            addCriterion("july >", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("july >=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThan(BigDecimal value) {
            addCriterion("july <", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("july <=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyIn(List<BigDecimal> values) {
            addCriterion("july in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotIn(List<BigDecimal> values) {
            addCriterion("july not in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("july between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("july not between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andAugustIsNull() {
            addCriterion("august is null");
            return (Criteria) this;
        }

        public Criteria andAugustIsNotNull() {
            addCriterion("august is not null");
            return (Criteria) this;
        }

        public Criteria andAugustEqualTo(BigDecimal value) {
            addCriterion("august =", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotEqualTo(BigDecimal value) {
            addCriterion("august <>", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThan(BigDecimal value) {
            addCriterion("august >", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("august >=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThan(BigDecimal value) {
            addCriterion("august <", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThanOrEqualTo(BigDecimal value) {
            addCriterion("august <=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustIn(List<BigDecimal> values) {
            addCriterion("august in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotIn(List<BigDecimal> values) {
            addCriterion("august not in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("august between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("august not between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNull() {
            addCriterion("september is null");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNotNull() {
            addCriterion("september is not null");
            return (Criteria) this;
        }

        public Criteria andSeptemberEqualTo(BigDecimal value) {
            addCriterion("september =", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotEqualTo(BigDecimal value) {
            addCriterion("september <>", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThan(BigDecimal value) {
            addCriterion("september >", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("september >=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThan(BigDecimal value) {
            addCriterion("september <", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("september <=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberIn(List<BigDecimal> values) {
            addCriterion("september in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotIn(List<BigDecimal> values) {
            addCriterion("september not in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("september between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("september not between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNull() {
            addCriterion("october is null");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNotNull() {
            addCriterion("october is not null");
            return (Criteria) this;
        }

        public Criteria andOctoberEqualTo(BigDecimal value) {
            addCriterion("october =", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotEqualTo(BigDecimal value) {
            addCriterion("october <>", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThan(BigDecimal value) {
            addCriterion("october >", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("october >=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThan(BigDecimal value) {
            addCriterion("october <", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("october <=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberIn(List<BigDecimal> values) {
            addCriterion("october in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotIn(List<BigDecimal> values) {
            addCriterion("october not in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("october between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("october not between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNull() {
            addCriterion("november is null");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNotNull() {
            addCriterion("november is not null");
            return (Criteria) this;
        }

        public Criteria andNovemberEqualTo(BigDecimal value) {
            addCriterion("november =", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotEqualTo(BigDecimal value) {
            addCriterion("november <>", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThan(BigDecimal value) {
            addCriterion("november >", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("november >=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThan(BigDecimal value) {
            addCriterion("november <", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("november <=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberIn(List<BigDecimal> values) {
            addCriterion("november in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotIn(List<BigDecimal> values) {
            addCriterion("november not in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("november between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("november not between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNull() {
            addCriterion("december is null");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNotNull() {
            addCriterion("december is not null");
            return (Criteria) this;
        }

        public Criteria andDecemberEqualTo(BigDecimal value) {
            addCriterion("december =", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotEqualTo(BigDecimal value) {
            addCriterion("december <>", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThan(BigDecimal value) {
            addCriterion("december >", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("december >=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThan(BigDecimal value) {
            addCriterion("december <", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("december <=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberIn(List<BigDecimal> values) {
            addCriterion("december in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotIn(List<BigDecimal> values) {
            addCriterion("december not in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("december between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("december not between", value1, value2, "december");
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

        public Criteria andYeartargetIsNull() {
            addCriterion("yeartarget is null");
            return (Criteria) this;
        }

        public Criteria andYeartargetIsNotNull() {
            addCriterion("yeartarget is not null");
            return (Criteria) this;
        }

        public Criteria andYeartargetEqualTo(BigDecimal value) {
            addCriterion("yeartarget =", value, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetNotEqualTo(BigDecimal value) {
            addCriterion("yeartarget <>", value, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetGreaterThan(BigDecimal value) {
            addCriterion("yeartarget >", value, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yeartarget >=", value, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetLessThan(BigDecimal value) {
            addCriterion("yeartarget <", value, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yeartarget <=", value, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetIn(List<BigDecimal> values) {
            addCriterion("yeartarget in", values, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetNotIn(List<BigDecimal> values) {
            addCriterion("yeartarget not in", values, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeartarget between", value1, value2, "yeartarget");
            return (Criteria) this;
        }

        public Criteria andYeartargetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeartarget not between", value1, value2, "yeartarget");
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