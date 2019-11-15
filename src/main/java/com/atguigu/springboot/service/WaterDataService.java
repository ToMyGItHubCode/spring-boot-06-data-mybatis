package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.AirData;
import com.atguigu.springboot.bean.PageResult;
import com.atguigu.springboot.bean.WaterData;
import com.atguigu.springboot.mapper.WaterDataMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dell
 * @create 2019-10-28 15:29
 */
@Service
public class WaterDataService {

    @Autowired
    private WaterDataMapper waterDataMapper;

    public PageResult<WaterData> getWaterData(Integer currentPage, Integer limit){

        PageHelper.startPage(currentPage,limit);

        List<WaterData> waterData = this.waterDataMapper.getWaterData();

        PageInfo<WaterData> pageInfo = new PageInfo<>(waterData);

        PageResult<WaterData> result = new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
        result.setTotalPage((pageInfo.getTotal()+limit-1)/limit);
        return result;
    }

    public void insertWaterData(WaterData data) {
        try {
            waterDataMapper.insertSelective(data);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getWaterCount() {
        return waterDataMapper.countAll();
    }

    public Integer addWater(WaterData data) {
        return waterDataMapper.insertSelective(data);
    }
}
