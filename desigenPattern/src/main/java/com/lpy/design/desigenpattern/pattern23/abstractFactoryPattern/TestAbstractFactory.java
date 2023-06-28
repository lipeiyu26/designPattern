package com.lpy.design.desigenpattern.pattern23.abstractFactoryPattern;

public class TestAbstractFactory {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
