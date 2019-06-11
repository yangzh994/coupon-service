package com.github.coupon.sendcoupon.handler;

import com.github.coupon.entity.SendCouponTask;

public class SendCouponHandle implements Runnable {

    private SendCouponTask couponTask;
    private SendCouponService sendCouponService;

    public SendCouponHandle(SendCouponTask couponTask,SendCouponService sendCouponService){
        this.couponTask = couponTask;
        this.sendCouponService = sendCouponService;
    }

    @Override
    public void run() {
        //获取处理类
        sendCouponService.execute(couponTask);
    }

}
