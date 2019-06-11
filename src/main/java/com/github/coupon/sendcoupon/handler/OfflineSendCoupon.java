package com.github.coupon.sendcoupon.handler;

import com.github.coupon.common.constant.SendCoupon;
import com.github.coupon.entity.SendCouponTask;
import org.springframework.stereotype.Service;

/**
 * 线下发送券处理类
 */
@Service("sendCoupon" + SendCoupon.OFFLINE)
public class OfflineSendCoupon implements SendCouponService{
    @Override
    public void execute(SendCouponTask task) {
        System.out.println("线下处理!!!");
    }
}
