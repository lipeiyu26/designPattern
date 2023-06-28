package com.lpy.design.desigenpattern.pattern23.proxyPattern.jdkDynamicProxy;

import com.lpy.design.desigenpattern.pattern23.proxyPattern.staticProxy.IPerson;

public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }
}
