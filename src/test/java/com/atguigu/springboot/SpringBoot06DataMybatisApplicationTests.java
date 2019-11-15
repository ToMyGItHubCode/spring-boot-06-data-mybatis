package com.atguigu.springboot;

import com.atguigu.springboot.mapper.AirDataMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot06DataMybatisApplicationTests {

    @Autowired
    AirDataMapper mapper;

    @Test
    public void test(){
        int i = mapper.countAll();
        System.out.print(i);
    }

}
