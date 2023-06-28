package com.lpy.design.desigenpattern.pattern23.decoratorPattern;

public class TestDecoratorPattern {

    public static void main(String[] args) {

        // 首先创建需要被装饰的原始对象（即要被装饰的对象）
        Component c1 =new ConcreteDecorator();
        // 给对象透明的增加功能A并调用
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();
        // 给对象透明的增加功能B并调用
        Decorator decoratorB = new ConcreteDecoratorB(c1);
        decoratorB.operation();

        // 装饰器也可以装饰具体的装饰类
        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
