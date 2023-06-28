package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;


/**
 * 懒汉式单例
 * 静态内部类，调用内部类的时候，内部类才会被加载
 * 避免单例被反射破坏
 */
public class LazyStaticInnerClassSecuritySingleton {

    private LazyStaticInnerClassSecuritySingleton(){
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyStaticInnerClassSecuritySingleton getInstance(){

        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final LazyStaticInnerClassSecuritySingleton INSTANCE = new LazyStaticInnerClassSecuritySingleton();
    }
}
