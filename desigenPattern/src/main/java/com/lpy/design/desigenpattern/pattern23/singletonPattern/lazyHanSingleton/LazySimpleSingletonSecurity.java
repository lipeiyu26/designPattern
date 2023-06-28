package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

/**
 * 懒汉式单例
 * 解决现成不安全问题
 * 优点：节省了内存，线程安全
 * 缺点：性能低
 */
public class LazySimpleSingletonSecurity {

    private static LazySimpleSingletonSecurity instance;

    private LazySimpleSingletonSecurity(){}

    public synchronized static LazySimpleSingletonSecurity getInstance(){
        if(instance == null){
            instance = new LazySimpleSingletonSecurity();
        }
        return instance;
    }
}
