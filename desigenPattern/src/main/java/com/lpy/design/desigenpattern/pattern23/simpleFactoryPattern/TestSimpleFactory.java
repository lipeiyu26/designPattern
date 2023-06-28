package com.lpy.design.desigenpattern.pattern23.simpleFactoryPattern;

import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.ICourse;
import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.JavaCourse;
import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.PythonCourse;

public class TestSimpleFactory {

    public static void main(String[] args) {
        ICourse course = new CourseFactory().create("java");
        course.study();

        course = new CourseFactory().createByReflex("com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.JavaCourse");
        course.study();

        course = new CourseFactory().createByReflex(PythonCourse.class);
        course.study();
    }
}
