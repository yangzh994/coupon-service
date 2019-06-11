package com.github.coupon.scheduler;

import org.springframework.scheduling.annotation.Scheduled;

public class SendCouponSchedule {

    @Scheduled(cron = "0 /1 * * * ? *")
    public void printHelloWorld(){
        System.out.println(111);
    }
}
