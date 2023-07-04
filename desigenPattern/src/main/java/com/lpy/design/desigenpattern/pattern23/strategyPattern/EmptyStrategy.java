package com.lpy.design.desigenpattern.pattern23.strategyPattern;

public class EmptyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
