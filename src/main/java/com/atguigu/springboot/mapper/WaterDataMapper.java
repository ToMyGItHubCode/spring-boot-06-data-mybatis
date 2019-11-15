package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.WaterData;
import com.atguigu.springboot.bean.WaterDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WaterDataMapper {

    int countAll();

    List<WaterData> getWaterData();

    int countByExample(WaterDataExample example);

    int deleteByExample(WaterDataExample example);

    int deleteByPrimaryKey(Long waterId);

    int insert(WaterData record);

    int insertSelective(WaterData record);

    List<WaterData> selectByExample(WaterDataExample example);

    WaterData selectByPrimaryKey(Long waterId);

    int updateByExampleSelective(@Param("record") WaterData record, @Param("example") WaterDataExample example);

    int updateByExample(@Param("record") WaterData record, @Param("example") WaterDataExample example);

    int updateByPrimaryKeySelective(WaterData record);

    int updateByPrimaryKey(WaterData record);
}