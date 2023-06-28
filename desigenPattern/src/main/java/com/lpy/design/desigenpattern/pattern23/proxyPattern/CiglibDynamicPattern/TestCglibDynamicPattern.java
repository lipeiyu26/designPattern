package com.lpy.design.desigenpattern.pattern23.proxyPattern.CiglibDynamicPattern;

public class TestCglibDynamicPattern {

    public static void main(String[] args) {
        Zhangsan zhangsan = (Zhangsan) new CglibMeipo().getInstance(Zhangsan.class);
        zhangsan.findLove();
        zhangsan.buyInsure();
    }
}
