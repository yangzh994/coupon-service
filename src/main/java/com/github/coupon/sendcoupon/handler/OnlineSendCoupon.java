package com.github.coupon.sendcoupon.handler;


import com.github.coupon.common.constant.CouponState;
import com.github.coupon.common.constant.SendCoupon;
import com.github.coupon.dao.SendCouponTaskMapper;
import com.github.coupon.dao.UserCouponMapper;
import com.github.coupon.entity.SendCouponTask;
import com.github.coupon.entity.UserCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 线上发送券处理类
 */
@Service("sendCoupon" + SendCoupon.ONLINE)
public class OnlineSendCoupon implements SendCouponService{

    @Autowired
    private UserCouponMapper userCouponMapper;

    @Autowired
    private SendCouponTaskMapper sendCouponTaskMapper;
    /*
    *  需求：线上发送优惠券,根据发送的vipIds字段（会员列表字段）,发送具体的优惠券,以及具体的数量
    * */
    @Override
    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 5000l, multiplier = 1))
    public void execute(SendCouponTask task) {
        System.out.println("线上处理!!!");
        int s = 1/0;
        //获取全部会员id
        String vipIds = task.getVipIds();
        //分割会员数组
        String[] ids = vipIds.split(",");
        //发送优惠券数量
        Integer count = task.getCount();
        //需要发送的优惠券id
        Integer couponId = task.getCouponId();
        task.setState(CouponState.START);
        sendCouponTaskMapper.updateByPrimaryKey(task);
        for (int i = 0; i < count; i++) {
            List<UserCoupon> list = new ArrayList<>();
            for (int j = 0; j < ids.length; j++) {
                UserCoupon userCoupon = new UserCoupon();
                userCoupon.setIsActive("N");
                userCoupon.setCouponId(couponId);
                userCoupon.setUserId(Integer.parseInt(ids[j]));
                userCoupon.setCreateDate(new Date());
                list.add(userCoupon);
            }
            execute(list);
        }
    }


    private int execute(List<UserCoupon> list) {
        return userCouponMapper.insertBatch(list);
    }

    @Recover
    public void recover(){
        System.out.println("测试!");
    }
}
