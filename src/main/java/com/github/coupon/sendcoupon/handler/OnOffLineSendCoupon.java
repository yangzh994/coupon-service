package com.github.coupon.sendcoupon.handler;


import com.github.coupon.common.constant.SendCoupon;
import com.github.coupon.entity.SendCouponTask;
import org.springframework.stereotype.Service;

/**
 * 线上线下处理类
 */
@Service("sendCoupon" + SendCoupon.ONOFFLINE)
public class OnOffLineSendCoupon implements  SendCouponService{
    @Override
    public void execute(SendCouponTask task) {
        System.out.println("线上线下处理!!!");
    }
}
