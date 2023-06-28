package com.lpy.design.desigenpattern.pattern23.decoratorPattern.decorator2;

public class EggDecorator extends BatterCakeDecorator{
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }
    protected String getMsg(){
        return super.getMsg()+" 1个鸡蛋";
    }
    public int getPrice(){
        return super.getPrice()+1;
    }
}
