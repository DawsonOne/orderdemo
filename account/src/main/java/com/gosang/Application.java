package com.gosang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: gosang
 * @DateTime: 2020/4/19 16:38
 * @Description: TODO
 */
@SpringBootApplication
@MapperScan("com.gosang.repository")
public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class,args);
        }
}
