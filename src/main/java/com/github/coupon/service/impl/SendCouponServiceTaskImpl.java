package com.github.coupon.service.impl;

import com.github.coupon.common.constant.CouponState;
import com.github.coupon.dao.SendCouponTaskMapper;
import com.github.coupon.entity.SendCouponTask;
import com.github.coupon.entity.SendCouponTaskExample;
import com.github.coupon.service.SendCouponTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendCouponServiceTaskImpl implements SendCouponTaskService {

    @Autowired
    private SendCouponTaskMapper sendCouponTaskMapper;

    @Override
    public List<SendCouponTask> getNotStartSendCouponAll() {
        SendCouponTaskExample example = new SendCouponTaskExample();
        example.createCriteria().andStateEqualTo(CouponState.NOT_START);
        return sendCouponTaskMapper.selectByExample(example);
    }


}
