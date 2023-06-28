package com.lpy.design.desigenpattern.pattern23.proxyPattern.staticProxy;

public class TestStaticPattern {

    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new Zhangsan());
        zhangLaosan.findLove();
    }
}
