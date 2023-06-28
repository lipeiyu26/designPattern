package com.lpy.design.desigenpattern.pattern23.singletonPattern.hungerHanSingleton;

/**
 * 饿汉式单例
 * 在单例类首次加载的时候就创建实例
 * 优点：执行效率高，性能高，没有任何锁
 * 缺点：某些情况下，可能会造成内存浪费
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
