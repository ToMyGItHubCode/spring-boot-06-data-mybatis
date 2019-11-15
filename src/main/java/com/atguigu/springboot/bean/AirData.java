package com.atguigu.springboot.bean;

import java.io.Serializable;

public class AirData implements Serializable {
    private Long airId;

    private Integer aqi;

    private Long yearMonth;

    private String scope;

    private String qualityLevel;

    private Integer pm25;

    private Integer pm10;

    private Integer so2;

    private Float co;

    private Integer no2;

    private Integer o3;

    public Long getAirId() {
        return airId;
    }

    public void setAirId(Long airId) {
        this.airId = airId;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public Long getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(Long yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel == null ? null : qualityLevel.trim();
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getSo2() {
        return so2;
    }

    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    public Float getCo() {
        return co;
    }

    public void setCo(Float co) {
        this.co = co;
    }

    public Integer getNo2() {
        return no2;
    }

    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    public Integer getO3() {
        return o3;
    }

    public void setO3(Integer o3) {
        this.o3 = o3;
    }
}