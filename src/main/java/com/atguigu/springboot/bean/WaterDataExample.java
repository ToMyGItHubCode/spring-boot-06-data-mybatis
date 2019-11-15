package com.atguigu.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class WaterDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterDataExample() {
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

        public Criteria andWaterIdIsNull() {
            addCriterion("WATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWaterIdIsNotNull() {
            addCriterion("WATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWaterIdEqualTo(Long value) {
            addCriterion("WATER_ID =", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotEqualTo(Long value) {
            addCriterion("WATER_ID <>", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThan(Long value) {
            addCriterion("WATER_ID >", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WATER_ID >=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThan(Long value) {
            addCriterion("WATER_ID <", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThanOrEqualTo(Long value) {
            addCriterion("WATER_ID <=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdIn(List<Long> values) {
            addCriterion("WATER_ID in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotIn(List<Long> values) {
            addCriterion("WATER_ID not in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdBetween(Long value1, Long value2) {
            addCriterion("WATER_ID between", value1, value2, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotBetween(Long value1, Long value2) {
            addCriterion("WATER_ID not between", value1, value2, "waterId");
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

        public Criteria andPlaceIsNull() {
            addCriterion("PLACE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("PLACE =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("PLACE <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("PLACE >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("PLACE <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("PLACE <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("PLACE like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("PLACE not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("PLACE in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("PLACE not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("PLACE between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("PLACE not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("PH is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("PH is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("PH =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("PH <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("PH >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("PH >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("PH <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("PH <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("PH like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("PH not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("PH in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("PH not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("PH between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("PH not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andDooIsNull() {
            addCriterion("DOO is null");
            return (Criteria) this;
        }

        public Criteria andDooIsNotNull() {
            addCriterion("DOO is not null");
            return (Criteria) this;
        }

        public Criteria andDooEqualTo(Float value) {
            addCriterion("DOO =", value, "doo");
            return (Criteria) this;
        }

        public Criteria andDooNotEqualTo(Float value) {
            addCriterion("DOO <>", value, "doo");
            return (Criteria) this;
        }

        public Criteria andDooGreaterThan(Float value) {
            addCriterion("DOO >", value, "doo");
            return (Criteria) this;
        }

        public Criteria andDooGreaterThanOrEqualTo(Float value) {
            addCriterion("DOO >=", value, "doo");
            return (Criteria) this;
        }

        public Criteria andDooLessThan(Float value) {
            addCriterion("DOO <", value, "doo");
            return (Criteria) this;
        }

        public Criteria andDooLessThanOrEqualTo(Float value) {
            addCriterion("DOO <=", value, "doo");
            return (Criteria) this;
        }

        public Criteria andDooIn(List<Float> values) {
            addCriterion("DOO in", values, "doo");
            return (Criteria) this;
        }

        public Criteria andDooNotIn(List<Float> values) {
            addCriterion("DOO not in", values, "doo");
            return (Criteria) this;
        }

        public Criteria andDooBetween(Float value1, Float value2) {
            addCriterion("DOO between", value1, value2, "doo");
            return (Criteria) this;
        }

        public Criteria andDooNotBetween(Float value1, Float value2) {
            addCriterion("DOO not between", value1, value2, "doo");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Float value) {
            addCriterion("TEMPERATURE =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Float value) {
            addCriterion("TEMPERATURE <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Float value) {
            addCriterion("TEMPERATURE >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("TEMPERATURE >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Float value) {
            addCriterion("TEMPERATURE <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("TEMPERATURE <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Float> values) {
            addCriterion("TEMPERATURE in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Float> values) {
            addCriterion("TEMPERATURE not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Float value1, Float value2) {
            addCriterion("TEMPERATURE between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andDeepIsNull() {
            addCriterion("DEEP is null");
            return (Criteria) this;
        }

        public Criteria andDeepIsNotNull() {
            addCriterion("DEEP is not null");
            return (Criteria) this;
        }

        public Criteria andDeepEqualTo(Float value) {
            addCriterion("DEEP =", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepNotEqualTo(Float value) {
            addCriterion("DEEP <>", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepGreaterThan(Float value) {
            addCriterion("DEEP >", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepGreaterThanOrEqualTo(Float value) {
            addCriterion("DEEP >=", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepLessThan(Float value) {
            addCriterion("DEEP <", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepLessThanOrEqualTo(Float value) {
            addCriterion("DEEP <=", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepIn(List<Float> values) {
            addCriterion("DEEP in", values, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepNotIn(List<Float> values) {
            addCriterion("DEEP not in", values, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepBetween(Float value1, Float value2) {
            addCriterion("DEEP between", value1, value2, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepNotBetween(Float value1, Float value2) {
            addCriterion("DEEP not between", value1, value2, "deep");
            return (Criteria) this;
        }

        public Criteria andSdIsNull() {
            addCriterion("SD is null");
            return (Criteria) this;
        }

        public Criteria andSdIsNotNull() {
            addCriterion("SD is not null");
            return (Criteria) this;
        }

        public Criteria andSdEqualTo(Float value) {
            addCriterion("SD =", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotEqualTo(Float value) {
            addCriterion("SD <>", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdGreaterThan(Float value) {
            addCriterion("SD >", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdGreaterThanOrEqualTo(Float value) {
            addCriterion("SD >=", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLessThan(Float value) {
            addCriterion("SD <", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLessThanOrEqualTo(Float value) {
            addCriterion("SD <=", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdIn(List<Float> values) {
            addCriterion("SD in", values, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotIn(List<Float> values) {
            addCriterion("SD not in", values, "sd");
            return (Criteria) this;
        }

        public Criteria andSdBetween(Float value1, Float value2) {
            addCriterion("SD between", value1, value2, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotBetween(Float value1, Float value2) {
            addCriterion("SD not between", value1, value2, "sd");
            return (Criteria) this;
        }

        public Criteria andCodIsNull() {
            addCriterion("COD is null");
            return (Criteria) this;
        }

        public Criteria andCodIsNotNull() {
            addCriterion("COD is not null");
            return (Criteria) this;
        }

        public Criteria andCodEqualTo(Float value) {
            addCriterion("COD =", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotEqualTo(Float value) {
            addCriterion("COD <>", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodGreaterThan(Float value) {
            addCriterion("COD >", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodGreaterThanOrEqualTo(Float value) {
            addCriterion("COD >=", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLessThan(Float value) {
            addCriterion("COD <", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLessThanOrEqualTo(Float value) {
            addCriterion("COD <=", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodIn(List<Float> values) {
            addCriterion("COD in", values, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotIn(List<Float> values) {
            addCriterion("COD not in", values, "cod");
            return (Criteria) this;
        }

        public Criteria andCodBetween(Float value1, Float value2) {
            addCriterion("COD between", value1, value2, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotBetween(Float value1, Float value2) {
            addCriterion("COD not between", value1, value2, "cod");
            return (Criteria) this;
        }

        public Criteria andNnIsNull() {
            addCriterion("NN is null");
            return (Criteria) this;
        }

        public Criteria andNnIsNotNull() {
            addCriterion("NN is not null");
            return (Criteria) this;
        }

        public Criteria andNnEqualTo(Float value) {
            addCriterion("NN =", value, "nn");
            return (Criteria) this;
        }

        public Criteria andNnNotEqualTo(Float value) {
            addCriterion("NN <>", value, "nn");
            return (Criteria) this;
        }

        public Criteria andNnGreaterThan(Float value) {
            addCriterion("NN >", value, "nn");
            return (Criteria) this;
        }

        public Criteria andNnGreaterThanOrEqualTo(Float value) {
            addCriterion("NN >=", value, "nn");
            return (Criteria) this;
        }

        public Criteria andNnLessThan(Float value) {
            addCriterion("NN <", value, "nn");
            return (Criteria) this;
        }

        public Criteria andNnLessThanOrEqualTo(Float value) {
            addCriterion("NN <=", value, "nn");
            return (Criteria) this;
        }

        public Criteria andNnIn(List<Float> values) {
            addCriterion("NN in", values, "nn");
            return (Criteria) this;
        }

        public Criteria andNnNotIn(List<Float> values) {
            addCriterion("NN not in", values, "nn");
            return (Criteria) this;
        }

        public Criteria andNnBetween(Float value1, Float value2) {
            addCriterion("NN between", value1, value2, "nn");
            return (Criteria) this;
        }

        public Criteria andNnNotBetween(Float value1, Float value2) {
            addCriterion("NN not between", value1, value2, "nn");
            return (Criteria) this;
        }

        public Criteria andYnnIsNull() {
            addCriterion("YNN is null");
            return (Criteria) this;
        }

        public Criteria andYnnIsNotNull() {
            addCriterion("YNN is not null");
            return (Criteria) this;
        }

        public Criteria andYnnEqualTo(Float value) {
            addCriterion("YNN =", value, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnNotEqualTo(Float value) {
            addCriterion("YNN <>", value, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnGreaterThan(Float value) {
            addCriterion("YNN >", value, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnGreaterThanOrEqualTo(Float value) {
            addCriterion("YNN >=", value, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnLessThan(Float value) {
            addCriterion("YNN <", value, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnLessThanOrEqualTo(Float value) {
            addCriterion("YNN <=", value, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnIn(List<Float> values) {
            addCriterion("YNN in", values, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnNotIn(List<Float> values) {
            addCriterion("YNN not in", values, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnBetween(Float value1, Float value2) {
            addCriterion("YNN between", value1, value2, "ynn");
            return (Criteria) this;
        }

        public Criteria andYnnNotBetween(Float value1, Float value2) {
            addCriterion("YNN not between", value1, value2, "ynn");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("TP is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("TP is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(Float value) {
            addCriterion("TP =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(Float value) {
            addCriterion("TP <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(Float value) {
            addCriterion("TP >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(Float value) {
            addCriterion("TP >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(Float value) {
            addCriterion("TP <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(Float value) {
            addCriterion("TP <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<Float> values) {
            addCriterion("TP in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<Float> values) {
            addCriterion("TP not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(Float value1, Float value2) {
            addCriterion("TP between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(Float value1, Float value2) {
            addCriterion("TP not between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTnIsNull() {
            addCriterion("TN is null");
            return (Criteria) this;
        }

        public Criteria andTnIsNotNull() {
            addCriterion("TN is not null");
            return (Criteria) this;
        }

        public Criteria andTnEqualTo(Float value) {
            addCriterion("TN =", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotEqualTo(Float value) {
            addCriterion("TN <>", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnGreaterThan(Float value) {
            addCriterion("TN >", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnGreaterThanOrEqualTo(Float value) {
            addCriterion("TN >=", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnLessThan(Float value) {
            addCriterion("TN <", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnLessThanOrEqualTo(Float value) {
            addCriterion("TN <=", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnIn(List<Float> values) {
            addCriterion("TN in", values, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotIn(List<Float> values) {
            addCriterion("TN not in", values, "tn");
            return (Criteria) this;
        }

        public Criteria andTnBetween(Float value1, Float value2) {
            addCriterion("TN between", value1, value2, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotBetween(Float value1, Float value2) {
            addCriterion("TN not between", value1, value2, "tn");
            return (Criteria) this;
        }

        public Criteria andAnIsNull() {
            addCriterion("AN is null");
            return (Criteria) this;
        }

        public Criteria andAnIsNotNull() {
            addCriterion("AN is not null");
            return (Criteria) this;
        }

        public Criteria andAnEqualTo(Float value) {
            addCriterion("AN =", value, "an");
            return (Criteria) this;
        }

        public Criteria andAnNotEqualTo(Float value) {
            addCriterion("AN <>", value, "an");
            return (Criteria) this;
        }

        public Criteria andAnGreaterThan(Float value) {
            addCriterion("AN >", value, "an");
            return (Criteria) this;
        }

        public Criteria andAnGreaterThanOrEqualTo(Float value) {
            addCriterion("AN >=", value, "an");
            return (Criteria) this;
        }

        public Criteria andAnLessThan(Float value) {
            addCriterion("AN <", value, "an");
            return (Criteria) this;
        }

        public Criteria andAnLessThanOrEqualTo(Float value) {
            addCriterion("AN <=", value, "an");
            return (Criteria) this;
        }

        public Criteria andAnIn(List<Float> values) {
            addCriterion("AN in", values, "an");
            return (Criteria) this;
        }

        public Criteria andAnNotIn(List<Float> values) {
            addCriterion("AN not in", values, "an");
            return (Criteria) this;
        }

        public Criteria andAnBetween(Float value1, Float value2) {
            addCriterion("AN between", value1, value2, "an");
            return (Criteria) this;
        }

        public Criteria andAnNotBetween(Float value1, Float value2) {
            addCriterion("AN not between", value1, value2, "an");
            return (Criteria) this;
        }

        public Criteria andChlIsNull() {
            addCriterion("CHL is null");
            return (Criteria) this;
        }

        public Criteria andChlIsNotNull() {
            addCriterion("CHL is not null");
            return (Criteria) this;
        }

        public Criteria andChlEqualTo(Float value) {
            addCriterion("CHL =", value, "chl");
            return (Criteria) this;
        }

        public Criteria andChlNotEqualTo(Float value) {
            addCriterion("CHL <>", value, "chl");
            return (Criteria) this;
        }

        public Criteria andChlGreaterThan(Float value) {
            addCriterion("CHL >", value, "chl");
            return (Criteria) this;
        }

        public Criteria andChlGreaterThanOrEqualTo(Float value) {
            addCriterion("CHL >=", value, "chl");
            return (Criteria) this;
        }

        public Criteria andChlLessThan(Float value) {
            addCriterion("CHL <", value, "chl");
            return (Criteria) this;
        }

        public Criteria andChlLessThanOrEqualTo(Float value) {
            addCriterion("CHL <=", value, "chl");
            return (Criteria) this;
        }

        public Criteria andChlIn(List<Float> values) {
            addCriterion("CHL in", values, "chl");
            return (Criteria) this;
        }

        public Criteria andChlNotIn(List<Float> values) {
            addCriterion("CHL not in", values, "chl");
            return (Criteria) this;
        }

        public Criteria andChlBetween(Float value1, Float value2) {
            addCriterion("CHL between", value1, value2, "chl");
            return (Criteria) this;
        }

        public Criteria andChlNotBetween(Float value1, Float value2) {
            addCriterion("CHL not between", value1, value2, "chl");
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