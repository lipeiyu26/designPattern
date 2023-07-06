package com.lpy.design.desigenpattern.pattern23.observerPattern.event;

import com.google.common.eventbus.Subscribe;

/**
 * guava的注解
 */
public class LPYEvent {
    @Subscribe
    public void observer(String str){
        System.out.println("执行observer方法，传参为："+str);
    }
}
