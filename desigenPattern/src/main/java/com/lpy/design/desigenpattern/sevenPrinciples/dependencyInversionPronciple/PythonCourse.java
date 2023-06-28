package com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple;

public class PythonCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习PythonCourse课程");
    }
}
