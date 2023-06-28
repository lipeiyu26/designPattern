package com.lpy.design.desigenpattern.pattern23.proxyPattern.jdkDynamicProxy;

import com.lpy.design.desigenpattern.pattern23.proxyPattern.staticProxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理需要实现一个接口InvocationHandler
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
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
