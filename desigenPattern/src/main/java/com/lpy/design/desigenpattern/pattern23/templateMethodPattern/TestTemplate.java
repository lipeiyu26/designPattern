package com.lpy.design.desigenpattern.pattern23.templateMethodPattern;

public class TestTemplate {

    public static void main(String[] args) {
        System.out.println("===================架构师课程===================");
        JavaCourse java = new JavaCourse();
        java.setNeedCheckHomework(true);
        java.createCourse();
    }
}
