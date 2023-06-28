package com.lpy.design.desigenpattern.pattern23.factoryMethodPattern;

import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.ICourse;
import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.PythonCourse;

public class PythonCourseFacory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
