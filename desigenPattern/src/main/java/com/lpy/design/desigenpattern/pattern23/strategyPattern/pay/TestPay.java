package com.lpy.design.desigenpattern.pattern23.strategyPattern.pay;

public class TestPay {

    public static void main(String[] args) {
        Order order = new Order("1","202307042114",324.5);
        System.out.println(order.pay(PayStretegy.UNION_PAY).getData());
    }
}
