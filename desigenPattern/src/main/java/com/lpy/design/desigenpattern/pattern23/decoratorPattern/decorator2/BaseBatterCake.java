package com.lpy.design.desigenpattern.pattern23.decoratorPattern.decorator2;

public class BaseBatterCake extends BatterCake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
