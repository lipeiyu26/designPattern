package com.lpy.design.desigenpattern.pattern23.singletonPattern.hungerHanSingleton;

/**
 * 饿汉式单例
 * 类加载的时候就初始化了类
 */
public class HungrySingletonStatic {

    private static final HungrySingletonStatic hungrySingletonStatic;

    static {
        hungrySingletonStatic = new HungrySingletonStatic();
    }

    private HungrySingletonStatic(){}

    public static HungrySingletonStatic getInstance() {
        return hungrySingletonStatic;
    }
}
