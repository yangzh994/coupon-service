package com.github.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.github.coupon.dao")
@EnableRetry
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

}
