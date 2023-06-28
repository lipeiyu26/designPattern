package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

/**
 * 懒汉式单例
 * 双重检查，指令重排序问题，是instance先创建还是new hungrySingletonStatic的实例先创建的问题
 * 优点：性能高了，线程安全了
 * 缺点：可读难度大，不够优雅
 */
public class LazyDoubleCheckSingletonVolatile {

    private volatile static LazyDoubleCheckSingletonVolatile instance;

    private LazyDoubleCheckSingletonVolatile(){}

    public static LazyDoubleCheckSingletonVolatile getInstance(){
        //检查是否要阻塞
        if(instance == null){
            synchronized (LazyDoubleCheckSingletonVolatile.class){
                //检查是否要重新创建实例
                if(instance == null){
                    instance = new LazyDoubleCheckSingletonVolatile();
                    //指令重排序的问题
                }
            }
        }
        return instance;
    }
}
