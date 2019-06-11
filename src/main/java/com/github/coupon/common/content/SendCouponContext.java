package com.github.coupon.common.content;

import com.github.coupon.sendcoupon.handler.SendCouponService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class SendCouponContext implements ApplicationContextAware{

    private static final String PRE_FIX = "sendCoupon";

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public SendCouponService getProcessor(String useType){
        SendCouponService sendCouponService = (SendCouponService)applicationContext.getBean(PRE_FIX + useType);
        return sendCouponService;
    }

    public ApplicationContext getApplicationContext(){
        return this.applicationContext;
    }
}
