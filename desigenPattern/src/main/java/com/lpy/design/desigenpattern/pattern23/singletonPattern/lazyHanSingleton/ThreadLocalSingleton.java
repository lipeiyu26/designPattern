package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

/**
 * 保证线程内部的全局唯一，且天生线程安全
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLoaclInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static  ThreadLocalSingleton getInstance(){
        return threadLoaclInstance.get();
    }
}
