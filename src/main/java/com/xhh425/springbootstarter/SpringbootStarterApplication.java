package com.xhh425.springbootstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xhh425.springbootstarter.mapper")
public class SpringbootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterApplication.class, args);
    }

}
