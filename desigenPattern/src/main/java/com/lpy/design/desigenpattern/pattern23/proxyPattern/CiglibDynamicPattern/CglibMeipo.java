package com.lpy.design.desigenpattern.pattern23.proxyPattern.CiglibDynamicPattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理需要实现接口MethodInterceptor
 */
public class CglibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }
    public void after(){
        System.out.println("双方同意，开始交往");
    }
    public void before(){
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
