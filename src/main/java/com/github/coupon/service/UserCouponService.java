package com.github.coupon.service;

import com.github.coupon.entity.SendCouponTask;

import java.util.List;

public interface UserCouponService {

    public void handler(List<SendCouponTask> tasks);
}
