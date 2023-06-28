package com.lpy.design.desigenpattern.pattern23.proxyPattern.staticProxy;

/**
 * 静态代理
 * 显式声明被代理对象
 */
public class Zhangsan implements IPerson{
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
