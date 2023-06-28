package com.lpy.design.desigenpattern.pattern23.decoratorPattern.decorator2;

public class SauageDecorator extends BatterCakeDecorator{
    public SauageDecorator(BatterCake batterCake) {
        super(batterCake);
    }
    public String getMsg(){
        return super.getMsg()+" 1根香肠";
    }
    public int getPrice(){
        return super.getPrice() +2;
    }
}
