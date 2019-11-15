package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.NoiseData;
import com.atguigu.springboot.bean.NoiseDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoiseDataMapper {

    int countAll();

    List<NoiseData> getNoiseData();

    int countByExample(NoiseDataExample example);

    int deleteByExample(NoiseDataExample example);

    int deleteByPrimaryKey(Long noiseId);

    int insert(NoiseData record);

    int insertSelective(NoiseData record);

    List<NoiseData> selectByExample(NoiseDataExample example);

    NoiseData selectByPrimaryKey(Long noiseId);

    int updateByExampleSelective(@Param("record") NoiseData record, @Param("example") NoiseDataExample example);

    int updateByExample(@Param("record") NoiseData record, @Param("example") NoiseDataExample example);

    int updateByPrimaryKeySelective(NoiseData record);

    int updateByPrimaryKey(NoiseData record);
}