package com.github.coupon.config;

import com.github.coupon.common.constant.HBaseTable;
import com.github.coupon.service.HbaseService;
import com.github.coupon.service.SendCouponTaskService;
import com.github.coupon.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;



@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    private SendCouponTaskService sendCouponTaskService;

    @Autowired
    private UserCouponService userCouponService;

    @Autowired
    private HbaseService hbaseService;

//    @Scheduled(cron = "0 */1 * * * ?")
//    public void sendCouponTask(){
//        List<SendCouponTask> sendCouponAll = sendCouponTaskService.getNotStartSendCouponAll();
//        userCouponService.handler(sendCouponAll);
//    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void hbaseTest(){
        System.out.println("测试Hbase查询!");
        String value = hbaseService.getValue("user", "user1", "nameinfo", "name");
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","user_id","1");
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","coupon_id","2");
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","is_active","Y");
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","is_use","N");
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","is_lock","N");
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","use_date","!@#$");//空
        hbaseService.putValue(HBaseTable.USER_COUPON,"user_coupon1","basic","create_date","2019-06-14 22:58:00");//空
        System.out.println(value);
    }
}
