package com.github.coupon.service.impl;

import com.github.coupon.common.content.SendCouponContext;
import com.github.coupon.dao.CouponMapper;
import com.github.coupon.entity.Coupon;
import com.github.coupon.entity.SendCouponTask;
import com.github.coupon.sendcoupon.handler.SendCouponHandle;
import com.github.coupon.sendcoupon.handler.SendCouponService;
import com.github.coupon.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class UserCouponServiceImpl implements UserCouponService {

    //使用线程池批量处理优惠券任务
    private static final ExecutorService SERVICE = Executors.newFixedThreadPool(20);
    @Autowired
    private CouponMapper couponMapper;
    @Autowired
    private SendCouponContext sendCouponContext;

    @Override
    public void handler(List<SendCouponTask> tasks) {
        for (SendCouponTask task : tasks) {
            //查询任务表中优惠券信息
            Coupon coupon = couponMapper.selectByPrimaryKey(task.getCouponId());
            //根据优惠券的使用类型，选择对应的发放处理器
            SendCouponService processor = sendCouponContext.getProcessor(coupon.getUseType());
            //线程池提交线程,
            SERVICE.execute(new SendCouponHandle(task,processor));
        }
    }
}
