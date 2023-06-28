package com.lpy.design.desigenpattern.pattern23.singletonPattern.test;

import com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * LazyStaticInnerClassSingleton的测试类
 * 反射破坏单例模式
 */
public class TestLazyStaticInnerClassSingleton {
    public static void main(String[] args)  {

        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance2 == instance1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
