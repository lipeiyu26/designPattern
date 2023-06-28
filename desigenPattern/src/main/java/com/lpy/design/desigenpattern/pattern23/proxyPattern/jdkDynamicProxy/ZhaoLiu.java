package com.lpy.design.desigenpattern.pattern23.proxyPattern.jdkDynamicProxy;

import com.lpy.design.desigenpattern.pattern23.proxyPattern.staticProxy.IPerson;

public class ZhaoLiu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("赵六要求：有房有车学历高");
    }
}
