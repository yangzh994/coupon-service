package com.github.coupon.config;

import com.github.coupon.entity.SendCouponTask;
import com.github.coupon.service.SendCouponTaskService;
import com.github.coupon.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;


@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    private SendCouponTaskService sendCouponTaskService;

    @Autowired
    private UserCouponService userCouponService;

    @Scheduled(cron = "0 */1 * * * ?")
    public void sendCouponTask(){
        List<SendCouponTask> sendCouponAll = sendCouponTaskService.getNotStartSendCouponAll();
        userCouponService.handler(sendCouponAll);
    }
}
