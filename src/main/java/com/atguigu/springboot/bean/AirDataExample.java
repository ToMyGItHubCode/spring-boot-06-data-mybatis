package com.atguigu.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class AirDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirDataExample() {
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

        public Criteria andAirIdIsNull() {
            addCriterion("AIR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAirIdIsNotNull() {
            addCriterion("AIR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAirIdEqualTo(Long value) {
            addCriterion("AIR_ID =", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotEqualTo(Long value) {
            addCriterion("AIR_ID <>", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdGreaterThan(Long value) {
            addCriterion("AIR_ID >", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AIR_ID >=", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdLessThan(Long value) {
            addCriterion("AIR_ID <", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdLessThanOrEqualTo(Long value) {
            addCriterion("AIR_ID <=", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdIn(List<Long> values) {
            addCriterion("AIR_ID in", values, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotIn(List<Long> values) {
            addCriterion("AIR_ID not in", values, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdBetween(Long value1, Long value2) {
            addCriterion("AIR_ID between", value1, value2, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotBetween(Long value1, Long value2) {
            addCriterion("AIR_ID not between", value1, value2, "airId");
            return (Criteria) this;
        }

        public Criteria andAqiIsNull() {
            addCriterion("AQI is null");
            return (Criteria) this;
        }

        public Criteria andAqiIsNotNull() {
            addCriterion("AQI is not null");
            return (Criteria) this;
        }

        public Criteria andAqiEqualTo(Integer value) {
            addCriterion("AQI =", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiNotEqualTo(Integer value) {
            addCriterion("AQI <>", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiGreaterThan(Integer value) {
            addCriterion("AQI >", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiGreaterThanOrEqualTo(Integer value) {
            addCriterion("AQI >=", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiLessThan(Integer value) {
            addCriterion("AQI <", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiLessThanOrEqualTo(Integer value) {
            addCriterion("AQI <=", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiIn(List<Integer> values) {
            addCriterion("AQI in", values, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiNotIn(List<Integer> values) {
            addCriterion("AQI not in", values, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiBetween(Integer value1, Integer value2) {
            addCriterion("AQI between", value1, value2, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiNotBetween(Integer value1, Integer value2) {
            addCriterion("AQI not between", value1, value2, "aqi");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNull() {
            addCriterion("YEAR_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNotNull() {
            addCriterion("YEAR_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthEqualTo(Long value) {
            addCriterion("YEAR_MONTH =", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotEqualTo(Long value) {
            addCriterion("YEAR_MONTH <>", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThan(Long value) {
            addCriterion("YEAR_MONTH >", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("YEAR_MONTH >=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThan(Long value) {
            addCriterion("YEAR_MONTH <", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThanOrEqualTo(Long value) {
            addCriterion("YEAR_MONTH <=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthIn(List<Long> values) {
            addCriterion("YEAR_MONTH in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotIn(List<Long> values) {
            addCriterion("YEAR_MONTH not in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthBetween(Long value1, Long value2) {
            addCriterion("YEAR_MONTH between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotBetween(Long value1, Long value2) {
            addCriterion("YEAR_MONTH not between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("SCOPE =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("SCOPE <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("SCOPE >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("SCOPE >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("SCOPE <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("SCOPE <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("SCOPE like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("SCOPE not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("SCOPE in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("SCOPE not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("SCOPE between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("SCOPE not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIsNull() {
            addCriterion("QUALITY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIsNotNull() {
            addCriterion("QUALITY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelEqualTo(String value) {
            addCriterion("QUALITY_LEVEL =", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotEqualTo(String value) {
            addCriterion("QUALITY_LEVEL <>", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelGreaterThan(String value) {
            addCriterion("QUALITY_LEVEL >", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITY_LEVEL >=", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLessThan(String value) {
            addCriterion("QUALITY_LEVEL <", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLessThanOrEqualTo(String value) {
            addCriterion("QUALITY_LEVEL <=", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLike(String value) {
            addCriterion("QUALITY_LEVEL like", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotLike(String value) {
            addCriterion("QUALITY_LEVEL not like", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIn(List<String> values) {
            addCriterion("QUALITY_LEVEL in", values, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotIn(List<String> values) {
            addCriterion("QUALITY_LEVEL not in", values, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelBetween(String value1, String value2) {
            addCriterion("QUALITY_LEVEL between", value1, value2, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotBetween(String value1, String value2) {
            addCriterion("QUALITY_LEVEL not between", value1, value2, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("PM25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Integer value) {
            addCriterion("PM25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Integer value) {
            addCriterion("PM25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Integer value) {
            addCriterion("PM25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Integer value) {
            addCriterion("PM25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Integer value) {
            addCriterion("PM25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Integer value) {
            addCriterion("PM25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Integer> values) {
            addCriterion("PM25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Integer> values) {
            addCriterion("PM25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Integer value1, Integer value2) {
            addCriterion("PM25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Integer value1, Integer value2) {
            addCriterion("PM25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("PM10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Integer value) {
            addCriterion("PM10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Integer value) {
            addCriterion("PM10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Integer value) {
            addCriterion("PM10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Integer value) {
            addCriterion("PM10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Integer value) {
            addCriterion("PM10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Integer value) {
            addCriterion("PM10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Integer> values) {
            addCriterion("PM10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Integer> values) {
            addCriterion("PM10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Integer value1, Integer value2) {
            addCriterion("PM10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Integer value1, Integer value2) {
            addCriterion("PM10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("SO2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Integer value) {
            addCriterion("SO2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Integer value) {
            addCriterion("SO2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Integer value) {
            addCriterion("SO2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Integer value) {
            addCriterion("SO2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Integer value) {
            addCriterion("SO2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Integer value) {
            addCriterion("SO2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Integer> values) {
            addCriterion("SO2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Integer> values) {
            addCriterion("SO2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Integer value1, Integer value2) {
            addCriterion("SO2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Integer value1, Integer value2) {
            addCriterion("SO2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Float value) {
            addCriterion("CO =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Float value) {
            addCriterion("CO <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Float value) {
            addCriterion("CO >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Float value) {
            addCriterion("CO >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Float value) {
            addCriterion("CO <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Float value) {
            addCriterion("CO <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Float> values) {
            addCriterion("CO in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Float> values) {
            addCriterion("CO not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Float value1, Float value2) {
            addCriterion("CO between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Float value1, Float value2) {
            addCriterion("CO not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andNo2IsNull() {
            addCriterion("NO2 is null");
            return (Criteria) this;
        }

        public Criteria andNo2IsNotNull() {
            addCriterion("NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andNo2EqualTo(Integer value) {
            addCriterion("NO2 =", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotEqualTo(Integer value) {
            addCriterion("NO2 <>", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThan(Integer value) {
            addCriterion("NO2 >", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThanOrEqualTo(Integer value) {
            addCriterion("NO2 >=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThan(Integer value) {
            addCriterion("NO2 <", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThanOrEqualTo(Integer value) {
            addCriterion("NO2 <=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2In(List<Integer> values) {
            addCriterion("NO2 in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotIn(List<Integer> values) {
            addCriterion("NO2 not in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Between(Integer value1, Integer value2) {
            addCriterion("NO2 between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotBetween(Integer value1, Integer value2) {
            addCriterion("NO2 not between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andO3IsNull() {
            addCriterion("O3 is null");
            return (Criteria) this;
        }

        public Criteria andO3IsNotNull() {
            addCriterion("O3 is not null");
            return (Criteria) this;
        }

        public Criteria andO3EqualTo(Integer value) {
            addCriterion("O3 =", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotEqualTo(Integer value) {
            addCriterion("O3 <>", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThan(Integer value) {
            addCriterion("O3 >", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThanOrEqualTo(Integer value) {
            addCriterion("O3 >=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThan(Integer value) {
            addCriterion("O3 <", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThanOrEqualTo(Integer value) {
            addCriterion("O3 <=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3In(List<Integer> values) {
            addCriterion("O3 in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotIn(List<Integer> values) {
            addCriterion("O3 not in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3Between(Integer value1, Integer value2) {
            addCriterion("O3 between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotBetween(Integer value1, Integer value2) {
            addCriterion("O3 not between", value1, value2, "o3");
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