package com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple;

public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习java课程");
    }
}
