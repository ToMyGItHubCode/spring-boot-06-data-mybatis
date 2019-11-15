package com.atguigu.springboot.mapper;

import java.util.List;

import com.atguigu.springboot.bean.AirData;
import com.atguigu.springboot.bean.AirDataExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface AirDataMapper extends Mapper{

    int countAll();

    List<AirData> getDataList();

    int countByExample(AirDataExample example);

    int deleteByExample(AirDataExample example);

    int deleteByPrimaryKey(Long airId);

    int insert(AirData record);

    int insertSelective(AirData record);

    List<AirData> selectByExample(AirDataExample example);

    AirData selectByPrimaryKey(Long airId);

    int updateByExampleSelective(@Param("record") AirData record, @Param("example") AirDataExample example);

    int updateByExample(@Param("record") AirData record, @Param("example") AirDataExample example);

    int updateByPrimaryKeySelective(AirData record);

    int updateByPrimaryKey(AirData record);

}