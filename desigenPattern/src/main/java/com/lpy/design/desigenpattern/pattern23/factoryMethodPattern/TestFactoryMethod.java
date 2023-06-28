package com.lpy.design.desigenpattern.pattern23.factoryMethodPattern;

import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.ICourse;

public class TestFactoryMethod {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFacory();
        ICourse course = factory.create();
        course.study();
    }
}
