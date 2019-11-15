package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.PageResult;
import com.atguigu.springboot.bean.WaterData;
import com.atguigu.springboot.service.WaterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author dell
 * @create 2019-10-28 15:31
 */
@RestController
@RequestMapping("/em")
public class WaterDataController {

    @Autowired
    private WaterDataService waterDataService;


    @PostMapping("/addWater")
    public PageResult<WaterData> addWater(@RequestBody WaterData data){
        Integer result = waterDataService.addWater(data);
        PageResult<WaterData> pageResult = new PageResult<>();
        if(result>0){
            pageResult.setStatus(1);
            return pageResult;
        }
        pageResult.setStatus(0);
        return pageResult;
    }

    //获取水质数据总条数
    @RequestMapping("/water/count")
    public ResponseEntity<PageResult<WaterData>> getWaterCount(){
        Integer waterCount = waterDataService.getWaterCount();
        PageResult<WaterData> result = new PageResult<>();
        if(waterCount>0){
            result.setStatus(1);
            result.setCount(waterCount);
            return ResponseEntity.ok(result);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @RequestMapping("/water")
    public ResponseEntity<PageResult<WaterData>> getWaterData(
            @RequestParam(value="currentPage",defaultValue = "1") Integer currentPage,
            @RequestParam(value="limit",defaultValue = "1") Integer limit
    ){
        PageResult<WaterData> waterData = this.waterDataService.getWaterData(currentPage, limit);
        if(waterData!=null){
            return ResponseEntity.ok(waterData);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    @PostMapping("/insertWater")
    public ResponseEntity<Void> insertWaterData(){
        this.waterDataService.insertWaterData(null);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
