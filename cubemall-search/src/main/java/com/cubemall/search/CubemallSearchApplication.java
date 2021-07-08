package com.cubemall.search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.cubemall.search.dao")
public class CubemallSearchApplication {
    public static void main(String[] args) {

        SpringApplication.run(CubemallSearchApplication.class);
    }
}
