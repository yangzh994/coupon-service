package com.github.coupon.service;

import com.github.coupon.entity.SendCouponTask;

import java.util.List;

public interface SendCouponTaskService {

    public List<SendCouponTask> getNotStartSendCouponAll();
}
