package com.lpy.design.desigenpattern.pattern23.proxyPattern;

public class TestProxy {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
