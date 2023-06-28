package com.lpy.design.desigenpattern.pattern23.singletonPattern.hungerHanSingleton;

import java.io.Serializable;

/**
 * 序列化
 * 把内存中对象的状态转换为字节码的形式
 * 把字节码通过IO输出流，写到磁盘上
 * 永久保存下来，持久化
 * 反序列化
 * 将持久化的字节码内容，通过IO输入流读到内存中来，转化成一个java对象
 */
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    /**
     * 在单例类上加上这样的一个方法，底层会去判断是否写了这个方法，
     * 如果没有写这个方法，就new Instance()；生成一个新对象，
     * 如果写了这个方法，就会把INSTANCE返回出去
     * 如果没有写则序列化前后对象不一致，写了就会一致
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
