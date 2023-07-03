package com.lpy.design.desigenpattern.pattern23.flyweightPattern;

public class TestFlyWeight {
    public static void main(String[] args) {
        IFlyWeight fly = FlyweightFactory.getFlyweight("111");
        fly.operation("111");
    }
}
