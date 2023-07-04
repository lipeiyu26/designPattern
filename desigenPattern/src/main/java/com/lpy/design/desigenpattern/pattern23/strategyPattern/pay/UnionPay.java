package com.lpy.design.desigenpattern.pattern23.strategyPattern.pay;

public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
