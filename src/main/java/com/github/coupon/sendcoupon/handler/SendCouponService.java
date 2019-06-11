package com.github.coupon.sendcoupon.handler;

import com.github.coupon.entity.SendCouponTask;

public interface SendCouponService {

    public void execute(SendCouponTask task);
}
