package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.AirData;
import com.atguigu.springboot.bean.NoiseData;
import com.atguigu.springboot.bean.PageResult;
import com.atguigu.springboot.bean.WaterData;
import com.atguigu.springboot.service.NoiseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author dell
 * @create 2019-10-27 17:02
 */
@RestController
@RequestMapping("/em")
public class NoiseDataController {

    @Autowired
    private NoiseDataService noiseDataService;


    //添加噪声质量数据
    @PostMapping("/addNoise")
    public PageResult<NoiseData> addWater(@RequestBody NoiseData data){
        Integer result = noiseDataService.addAir(data);
        PageResult<NoiseData> pageResult = new PageResult<>();
        if(result>0){
            pageResult.setStatus(1);
            return pageResult;
        }
        pageResult.setStatus(0);
        return pageResult;
    }

    @GetMapping("/noise/count")
    public ResponseEntity<PageResult<NoiseData>> getNoiseCount(){
        Integer count = noiseDataService.countAll();
        PageResult<NoiseData> result = new PageResult<>();
        if(count>0){
            result.setStatus(1);
            result.setCount(count);
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    //查询数据
    @GetMapping("/noise")
    public ResponseEntity<PageResult<NoiseData>> getNoiseData(
            @RequestParam(value="currentPage",defaultValue = "1") Integer currentPage,
            @RequestParam(value="limit",defaultValue = "1") Integer limit
    ){

        PageResult<NoiseData> noiseData = noiseDataService.getNoiseData(currentPage, limit);
        if(noiseData!=null){
            return ResponseEntity.ok(noiseData);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    //插入数据
    @PostMapping("/insertNoise")
//    @GetMapping("/insert")
    public ResponseEntity<Void> insertNoiseData(){
        NoiseData data = new NoiseData();
        data.setNoiseId(null);
        data.setEatingOne(56.7F);
        data.setGround(null);
        data.setLibrary(null);
        data.setNorth(56.7F);
        data.setSleeppingRoom(56.7F);
        data.setYearMonth(null);
        data.setNorth(56.6f);
        data.setTeachingRoom(56.6f);
        this.noiseDataService.insertNoiseData(data);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
