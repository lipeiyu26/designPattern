package com.lpy.design.desigenpattern.pattern23.strategyPattern;

public class GroupbuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
