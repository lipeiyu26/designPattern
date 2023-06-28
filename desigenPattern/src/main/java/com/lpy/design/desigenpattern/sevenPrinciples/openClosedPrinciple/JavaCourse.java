package com.lpy.design.desigenpattern.sevenPrinciples.openClosedPrinciple;

public class JavaCourse extends Course{
    public JavaCourse(int id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * java课程的费用是基础课程的5倍，
     * 对扩展开放，对修改关闭，不修改父类的价格，扩展子类的价格
     * @return
     */
    public Double getJavaPrice() {
        return super.getPrice()*5;
    }
}
