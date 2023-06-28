package com.lpy.design.desigenpattern.pattern23.singletonPattern.test;

import com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton.EnumSingleton;

import java.lang.reflect.Constructor;
import java.util.Enumeration;

/**
 * 不允许用构造方法生成枚举对象，因此，无法通过反射创建枚举对象
 */
public class TestEnumSingleton {

    public static void main(String[] args) {
        Class clazz = EnumSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
