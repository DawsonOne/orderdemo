package com.gosang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 21:05
 * @Description: TODO
 */
@SpringBootApplication
@MapperScan("com.gosang.repository")
public class Applicatoin {
    public static void main(String[] args) {
        SpringApplication.run(Applicatoin.class,args);
    }
}
