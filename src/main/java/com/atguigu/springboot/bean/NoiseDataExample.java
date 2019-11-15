package com.atguigu.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class NoiseDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoiseDataExample() {
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

        public Criteria andNoiseIdIsNull() {
            addCriterion("NOISE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoiseIdIsNotNull() {
            addCriterion("NOISE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseIdEqualTo(Long value) {
            addCriterion("NOISE_ID =", value, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdNotEqualTo(Long value) {
            addCriterion("NOISE_ID <>", value, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdGreaterThan(Long value) {
            addCriterion("NOISE_ID >", value, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NOISE_ID >=", value, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdLessThan(Long value) {
            addCriterion("NOISE_ID <", value, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdLessThanOrEqualTo(Long value) {
            addCriterion("NOISE_ID <=", value, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdIn(List<Long> values) {
            addCriterion("NOISE_ID in", values, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdNotIn(List<Long> values) {
            addCriterion("NOISE_ID not in", values, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdBetween(Long value1, Long value2) {
            addCriterion("NOISE_ID between", value1, value2, "noiseId");
            return (Criteria) this;
        }

        public Criteria andNoiseIdNotBetween(Long value1, Long value2) {
            addCriterion("NOISE_ID not between", value1, value2, "noiseId");
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

        public Criteria andSounthIsNull() {
            addCriterion("SOUNTH is null");
            return (Criteria) this;
        }

        public Criteria andSounthIsNotNull() {
            addCriterion("SOUNTH is not null");
            return (Criteria) this;
        }

        public Criteria andSounthEqualTo(Float value) {
            addCriterion("SOUNTH =", value, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthNotEqualTo(Float value) {
            addCriterion("SOUNTH <>", value, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthGreaterThan(Float value) {
            addCriterion("SOUNTH >", value, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthGreaterThanOrEqualTo(Float value) {
            addCriterion("SOUNTH >=", value, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthLessThan(Float value) {
            addCriterion("SOUNTH <", value, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthLessThanOrEqualTo(Float value) {
            addCriterion("SOUNTH <=", value, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthIn(List<Float> values) {
            addCriterion("SOUNTH in", values, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthNotIn(List<Float> values) {
            addCriterion("SOUNTH not in", values, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthBetween(Float value1, Float value2) {
            addCriterion("SOUNTH between", value1, value2, "sounth");
            return (Criteria) this;
        }

        public Criteria andSounthNotBetween(Float value1, Float value2) {
            addCriterion("SOUNTH not between", value1, value2, "sounth");
            return (Criteria) this;
        }

        public Criteria andGroundIsNull() {
            addCriterion("GROUND is null");
            return (Criteria) this;
        }

        public Criteria andGroundIsNotNull() {
            addCriterion("GROUND is not null");
            return (Criteria) this;
        }

        public Criteria andGroundEqualTo(Float value) {
            addCriterion("GROUND =", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotEqualTo(Float value) {
            addCriterion("GROUND <>", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundGreaterThan(Float value) {
            addCriterion("GROUND >", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundGreaterThanOrEqualTo(Float value) {
            addCriterion("GROUND >=", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundLessThan(Float value) {
            addCriterion("GROUND <", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundLessThanOrEqualTo(Float value) {
            addCriterion("GROUND <=", value, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundIn(List<Float> values) {
            addCriterion("GROUND in", values, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotIn(List<Float> values) {
            addCriterion("GROUND not in", values, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundBetween(Float value1, Float value2) {
            addCriterion("GROUND between", value1, value2, "ground");
            return (Criteria) this;
        }

        public Criteria andGroundNotBetween(Float value1, Float value2) {
            addCriterion("GROUND not between", value1, value2, "ground");
            return (Criteria) this;
        }

        public Criteria andLibraryIsNull() {
            addCriterion("LIBRARY is null");
            return (Criteria) this;
        }

        public Criteria andLibraryIsNotNull() {
            addCriterion("LIBRARY is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryEqualTo(Float value) {
            addCriterion("LIBRARY =", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotEqualTo(Float value) {
            addCriterion("LIBRARY <>", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryGreaterThan(Float value) {
            addCriterion("LIBRARY >", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryGreaterThanOrEqualTo(Float value) {
            addCriterion("LIBRARY >=", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLessThan(Float value) {
            addCriterion("LIBRARY <", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLessThanOrEqualTo(Float value) {
            addCriterion("LIBRARY <=", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryIn(List<Float> values) {
            addCriterion("LIBRARY in", values, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotIn(List<Float> values) {
            addCriterion("LIBRARY not in", values, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryBetween(Float value1, Float value2) {
            addCriterion("LIBRARY between", value1, value2, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotBetween(Float value1, Float value2) {
            addCriterion("LIBRARY not between", value1, value2, "library");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomIsNull() {
            addCriterion("TEACHING_ROOM is null");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomIsNotNull() {
            addCriterion("TEACHING_ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomEqualTo(Float value) {
            addCriterion("TEACHING_ROOM =", value, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomNotEqualTo(Float value) {
            addCriterion("TEACHING_ROOM <>", value, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomGreaterThan(Float value) {
            addCriterion("TEACHING_ROOM >", value, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomGreaterThanOrEqualTo(Float value) {
            addCriterion("TEACHING_ROOM >=", value, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomLessThan(Float value) {
            addCriterion("TEACHING_ROOM <", value, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomLessThanOrEqualTo(Float value) {
            addCriterion("TEACHING_ROOM <=", value, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomIn(List<Float> values) {
            addCriterion("TEACHING_ROOM in", values, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomNotIn(List<Float> values) {
            addCriterion("TEACHING_ROOM not in", values, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomBetween(Float value1, Float value2) {
            addCriterion("TEACHING_ROOM between", value1, value2, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andTeachingRoomNotBetween(Float value1, Float value2) {
            addCriterion("TEACHING_ROOM not between", value1, value2, "teachingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomIsNull() {
            addCriterion("SLEEPPING_ROOM is null");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomIsNotNull() {
            addCriterion("SLEEPPING_ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomEqualTo(Float value) {
            addCriterion("SLEEPPING_ROOM =", value, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomNotEqualTo(Float value) {
            addCriterion("SLEEPPING_ROOM <>", value, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomGreaterThan(Float value) {
            addCriterion("SLEEPPING_ROOM >", value, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomGreaterThanOrEqualTo(Float value) {
            addCriterion("SLEEPPING_ROOM >=", value, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomLessThan(Float value) {
            addCriterion("SLEEPPING_ROOM <", value, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomLessThanOrEqualTo(Float value) {
            addCriterion("SLEEPPING_ROOM <=", value, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomIn(List<Float> values) {
            addCriterion("SLEEPPING_ROOM in", values, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomNotIn(List<Float> values) {
            addCriterion("SLEEPPING_ROOM not in", values, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomBetween(Float value1, Float value2) {
            addCriterion("SLEEPPING_ROOM between", value1, value2, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andSleeppingRoomNotBetween(Float value1, Float value2) {
            addCriterion("SLEEPPING_ROOM not between", value1, value2, "sleeppingRoom");
            return (Criteria) this;
        }

        public Criteria andNorthIsNull() {
            addCriterion("NORTH is null");
            return (Criteria) this;
        }

        public Criteria andNorthIsNotNull() {
            addCriterion("NORTH is not null");
            return (Criteria) this;
        }

        public Criteria andNorthEqualTo(Float value) {
            addCriterion("NORTH =", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotEqualTo(Float value) {
            addCriterion("NORTH <>", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthGreaterThan(Float value) {
            addCriterion("NORTH >", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthGreaterThanOrEqualTo(Float value) {
            addCriterion("NORTH >=", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthLessThan(Float value) {
            addCriterion("NORTH <", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthLessThanOrEqualTo(Float value) {
            addCriterion("NORTH <=", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthIn(List<Float> values) {
            addCriterion("NORTH in", values, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotIn(List<Float> values) {
            addCriterion("NORTH not in", values, "north");
            return (Criteria) this;
        }

        public Criteria andNorthBetween(Float value1, Float value2) {
            addCriterion("NORTH between", value1, value2, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotBetween(Float value1, Float value2) {
            addCriterion("NORTH not between", value1, value2, "north");
            return (Criteria) this;
        }

        public Criteria andEatingOneIsNull() {
            addCriterion("EATING_ONE is null");
            return (Criteria) this;
        }

        public Criteria andEatingOneIsNotNull() {
            addCriterion("EATING_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andEatingOneEqualTo(Float value) {
            addCriterion("EATING_ONE =", value, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneNotEqualTo(Float value) {
            addCriterion("EATING_ONE <>", value, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneGreaterThan(Float value) {
            addCriterion("EATING_ONE >", value, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneGreaterThanOrEqualTo(Float value) {
            addCriterion("EATING_ONE >=", value, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneLessThan(Float value) {
            addCriterion("EATING_ONE <", value, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneLessThanOrEqualTo(Float value) {
            addCriterion("EATING_ONE <=", value, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneIn(List<Float> values) {
            addCriterion("EATING_ONE in", values, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneNotIn(List<Float> values) {
            addCriterion("EATING_ONE not in", values, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneBetween(Float value1, Float value2) {
            addCriterion("EATING_ONE between", value1, value2, "eatingOne");
            return (Criteria) this;
        }

        public Criteria andEatingOneNotBetween(Float value1, Float value2) {
            addCriterion("EATING_ONE not between", value1, value2, "eatingOne");
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