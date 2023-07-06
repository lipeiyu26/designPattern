package com.lpy.design.desigenpattern.pattern23.visitorPattern;

import java.util.Random;

public abstract class Employee {
    protected String name;
    /**
     * 员工kpi
     */
    protected int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接收访问者的访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
