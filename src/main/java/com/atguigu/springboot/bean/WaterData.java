package com.atguigu.springboot.bean;

import java.io.Serializable;

public class WaterData implements Serializable{
    private Long waterId;

    private Long yearMonth;

    private String place;

    private String ph;

    private Float doo;

    private Float temperature;

    private Float deep;

    private Float sd;

    private Float cod;

    private Float nn;

    private Float ynn;

    private Float tp;

    private Float tn;

    private Float an;

    private Float chl; //氨氮

    public Long getWaterId() {
        return waterId;
    }

    public void setWaterId(Long waterId) {
        this.waterId = waterId;
    }

    public Long getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(Long yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph == null ? null : ph.trim();
    }

    public Float getDoo() {
        return doo;
    }

    public void setDoo(Float doo) {
        this.doo = doo;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getDeep() {
        return deep;
    }

    public void setDeep(Float deep) {
        this.deep = deep;
    }

    public Float getSd() {
        return sd;
    }

    public void setSd(Float sd) {
        this.sd = sd;
    }

    public Float getCod() {
        return cod;
    }

    public void setCod(Float cod) {
        this.cod = cod;
    }

    public Float getNn() {
        return nn;
    }

    public void setNn(Float nn) {
        this.nn = nn;
    }

    public Float getYnn() {
        return ynn;
    }

    public void setYnn(Float ynn) {
        this.ynn = ynn;
    }

    public Float getTp() {
        return tp;
    }

    public void setTp(Float tp) {
        this.tp = tp;
    }

    public Float getTn() {
        return tn;
    }

    public void setTn(Float tn) {
        this.tn = tn;
    }

    public Float getAn() {
        return an;
    }

    public void setAn(Float an) {
        this.an = an;
    }

    public Float getChl() {
        return chl;
    }

    public void setChl(Float chl) {
        this.chl = chl;
    }
}