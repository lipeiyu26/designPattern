package com.lpy.design.desigenpattern.sevenPrinciples.openClosedPrinciple;

/**
 *  ** 一个软件实体如类，模块和函数应该对扩展开放，对修改关闭 **
 *  ** 用抽象构建框架，用实现扩展细节 **
 *  ** 优点：提高软件系统的可复用性及可维护性 **
 */
public class TestOpenClosed {

    public static void main(String[] args) {
        Course course = new JavaCourse(1,"java设计模式",11800D);

        System.out.println("课程ID: " + course.getId() +
                "\n课程名称 《" + course.getName() + "》" +
                "\n原价: " + course.getPrice() +
                "\n售价: " + ((JavaCourse)course).getJavaPrice());
    }
}
