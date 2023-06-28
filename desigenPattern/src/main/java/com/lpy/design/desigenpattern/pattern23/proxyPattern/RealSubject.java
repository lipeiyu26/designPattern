package com.lpy.design.desigenpattern.pattern23.proxyPattern;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
