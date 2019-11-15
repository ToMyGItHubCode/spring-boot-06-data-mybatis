package com.atguigu.springboot.bean;

import java.io.Serializable;

public class NoiseData implements Serializable{
    private Long noiseId; //id

    private Long yearMonth; //年月

    private Float sounth; //南大门

    private Float ground;//田径场

    private Float library;// 新图书管

    private Float teachingRoom; //九栋教学楼

    private Float sleeppingRoom; //28栋宿舍楼

    private Float north; //北大门

    private Float eatingOne;//一食堂

    public Long getNoiseId() {
        return noiseId;
    }

    public void setNoiseId(Long noiseId) {
        this.noiseId = noiseId;
    }

    public Long getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(Long yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Float getSounth() {
        return sounth;
    }

    public void setSounth(Float sounth) {
        this.sounth = sounth;
    }

    public Float getGround() {
        return ground;
    }

    public void setGround(Float ground) {
        this.ground = ground;
    }

    public Float getLibrary() {
        return library;
    }

    public void setLibrary(Float library) {
        this.library = library;
    }

    public Float getTeachingRoom() {
        return teachingRoom;
    }

    public void setTeachingRoom(Float teachingRoom) {
        this.teachingRoom = teachingRoom;
    }

    public Float getSleeppingRoom() {
        return sleeppingRoom;
    }

    public void setSleeppingRoom(Float sleeppingRoom) {
        this.sleeppingRoom = sleeppingRoom;
    }

    public Float getNorth() {
        return north;
    }

    public void setNorth(Float north) {
        this.north = north;
    }

    public Float getEatingOne() {
        return eatingOne;
    }

    public void setEatingOne(Float eatingOne) {
        this.eatingOne = eatingOne;
    }
}