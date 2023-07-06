package com.lpy.design.desigenpattern.pattern23.visitorPattern;

import java.util.Random;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核的是每年新产品研发的数量
     * @return
     */
    public int getProducts(){
        return new Random().nextInt(10);
    }
}
