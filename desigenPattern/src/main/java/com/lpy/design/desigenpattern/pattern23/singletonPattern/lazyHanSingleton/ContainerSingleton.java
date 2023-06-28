package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 懒汉式单例之容器式单例
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className,instance);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }
}
