package com.lpy.design.desigenpattern.pattern23.visitorPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 访问者模式
 */
public class BusinessReport {
    private List<Employee> employees = new LinkedList<Employee>();
    public BusinessReport(){
        employees.add(new Manager("产品经理A"));
        employees.add(new Engineer("程序员A"));
        employees.add(new Engineer("程序员B"));
        employees.add(new Engineer("程序员C"));
        employees.add(new Engineer("程序员D"));
        employees.add(new Manager("产品经理"));
        employees.add(new Manager("产品经理B"));
    }
    public void showReport(IVisitor visitor){
        for (Employee employee:employees) {
                employee.accept(visitor);
        }
    }
}
