package com.lpy.design.desigenpattern.pattern23.strategyPattern;

public class CashbackStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
