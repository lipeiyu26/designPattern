package com.lpy.design.desigenpattern.pattern23.strategyPattern.pay;

public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 263;
    }
}
