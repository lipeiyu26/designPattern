package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

/**
 * 懒汉式单例
 * 这个样子的，影响性能，生成的对象还不是唯一的，单例的
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                instance = new LazyDoubleCheckSingleton();
            }
        }
        return instance;
    }
}
