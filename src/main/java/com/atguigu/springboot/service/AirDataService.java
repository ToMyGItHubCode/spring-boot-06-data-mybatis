package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.AirData;
import com.atguigu.springboot.bean.PageResult;
import com.atguigu.springboot.mapper.AirDataMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dell
 * @create 2019-10-25 20:50
 */
@Service
public class AirDataService {

    @Autowired
    AirDataMapper dataMapper;

    //分页查询空气质量数据
    public PageResult<AirData> getDataList(Integer currentPage, Integer limit){
        PageHelper.startPage(currentPage,limit);
        List<AirData> dataList = dataMapper.getDataList();
        PageInfo<AirData> pageInfo = new PageInfo<>(dataList);
        PageResult<AirData> result = new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
        result.setTotalPage((pageInfo.getTotal()+limit-1)/limit);
        return result;
    }

    //获取空气质量数据总记录数
    public Integer getCount(){
        return dataMapper.countAll();
    }


    public void insertAirData(AirData data) {

        try {

            dataMapper.insertSelective(data);
        } catch (Exception e){

            e.printStackTrace();

        }
    }

    public Integer addAir(AirData data) {
        return dataMapper.insertSelective(data);
    }
}
