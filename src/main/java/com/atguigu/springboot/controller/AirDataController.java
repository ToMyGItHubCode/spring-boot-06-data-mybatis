package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.AirData;
import com.atguigu.springboot.bean.PageResult;
import com.atguigu.springboot.bean.WaterData;
import com.atguigu.springboot.mapper.AirDataMapper;
import com.atguigu.springboot.service.AirDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dell
 * @create 2019-10-25 20:31
 */
@RestController
@RequestMapping("/em")
public class AirDataController {

    @Autowired
    private AirDataService airDataService;

    //添加空气质量数据
    @PostMapping("/addAir")
    public PageResult<AirData> addWater(@RequestBody AirData data){
        Integer result = airDataService.addAir(data);
        PageResult<AirData> pageResult = new PageResult<>();
        if(result>0){
            pageResult.setStatus(1);
            return pageResult;
        }
        pageResult.setStatus(0);
        return pageResult;
    }

    @RequestMapping("/air/count")
    public ResponseEntity<PageResult<WaterData>> getWaterCount(){
        Integer count = airDataService.getCount();
        PageResult<WaterData> result = new PageResult<>();
        if(count>0){
            result.setStatus(1);
            result.setCount(count);
            return ResponseEntity.ok(result);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    //查询数据
    @GetMapping("/air")
    public ResponseEntity<PageResult<AirData>> getData(@RequestParam(value="currentPage",defaultValue = "1") Integer currentPage,
                                  @RequestParam(value="limit",defaultValue = "1") Integer limit){
        PageResult<AirData> result = this.airDataService.getDataList(currentPage, limit);
        if(result!=null){
            result.setCurrentPage(currentPage);
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    //插入数据
    @PostMapping("/insertAir")
    public ResponseEntity<Void> insertAirData(){
        this.airDataService.insertAirData(null);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
