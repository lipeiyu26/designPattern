package com.lpy.design.desigenpattern.pattern23.proxyPattern.jdkDynamicProxy;

import com.lpy.design.desigenpattern.pattern23.proxyPattern.staticProxy.IPerson;

public class TestDynamicPattern {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
    }
}
