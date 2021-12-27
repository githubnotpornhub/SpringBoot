package com.my.beginspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.beginspringboot.dao")//mapper注解
public class BeginspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginspringbootApplication.class, args);
    }

}
