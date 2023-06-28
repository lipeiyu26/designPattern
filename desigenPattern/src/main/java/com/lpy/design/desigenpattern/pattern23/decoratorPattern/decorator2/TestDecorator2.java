package com.lpy.design.desigenpattern.pattern23.decoratorPattern.decorator2;

public class TestDecorator2 {

    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        System.out.println(batterCake.getMsg()+",总价"+batterCake.getPrice());
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg()+",总价"+batterCake.getPrice());
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg()+",总价"+batterCake.getPrice());
        batterCake = new SauageDecorator(batterCake);
        System.out.println(batterCake.getMsg()+",总价"+batterCake.getPrice());
    }
}
