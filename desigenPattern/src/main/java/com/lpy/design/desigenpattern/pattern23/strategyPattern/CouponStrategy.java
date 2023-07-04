package com.lpy.design.desigenpattern.pattern23.strategyPattern;

public class CouponStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
