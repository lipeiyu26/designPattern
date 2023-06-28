package com.lpy.design.desigenpattern.pattern23.decoratorPattern;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 在调用父类的operation方法之前需要执行的操作
     */
    private void operationFirst(){
        System.out.println("=========ConcreteDecoratorA+operationFirst==========");
    }

    /**
     * 在调用父类的operation方法之后需要执行的操作
     */
    private void operationLast(){
        System.out.println("=========ConcreteDecoratorA+operationLast==========");
    }

    /**
     * 调用父类的方法，可以在调用前后执行一些附加动作
     * operationFirst和operationLast是添加的功能
     *  super.operation();在这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法
     */
    public void operation(){
        operationFirst();
        super.operation();
        operationLast();
    }
}
