package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;


/**
 * 懒汉式单例
 * 静态内部类，调用内部类的时候，内部类才会被加载
 * 优点：写法优雅，利用了java本身语法特点，性能高，避免了内存浪费
 * 缺点：能够被反射破坏
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){}

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
