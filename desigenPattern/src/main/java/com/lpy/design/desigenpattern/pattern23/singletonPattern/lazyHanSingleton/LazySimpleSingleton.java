package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

/**
 * 懒汉式单例
 * 优点：节省了内存
 * 缺点：线程不安全
 * 运行结果：同一个实例：1：正常执行顺序。2：后者覆盖前者情况
 *         不同的实例：1：同时进入条件，按顺序返回
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if(instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
