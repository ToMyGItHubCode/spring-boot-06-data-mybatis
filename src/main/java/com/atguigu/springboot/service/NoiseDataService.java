package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.NoiseData;
import com.atguigu.springboot.bean.PageResult;
import com.atguigu.springboot.bean.WaterData;
import com.atguigu.springboot.mapper.NoiseDataMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dell
 * @create 2019-10-27 16:55
 */
@Service
public class NoiseDataService {

    @Autowired
    private NoiseDataMapper noiseDataMapper;

    //分页查询
    public PageResult<NoiseData> getNoiseData(Integer page,Integer rows){
        PageHelper.startPage(page,rows);
        List<NoiseData> noiseData = noiseDataMapper.getNoiseData();
        PageInfo<NoiseData> pageInfo = new PageInfo<>(noiseData);
        PageResult<NoiseData> result = new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
        result.setTotalPage((pageInfo.getTotal()+rows-1)/rows);
        return result;
    }

    //获取噪声数据总记录数
    public Integer countAll(){
       return noiseDataMapper.countAll();
    }

    public void insertNoiseData(NoiseData data) {
        try {
            noiseDataMapper.insertSelective(data);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer addAir(NoiseData data) {
       return noiseDataMapper.insertSelective(data);
    }
}
