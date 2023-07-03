package com.lpy.design.desigenpattern.pattern23.compositePattern.transparentMode;

import java.util.ArrayList;
import java.util.List;

public class CoursePackage extends CourseComponet{
    private List<CourseComponet> itmes = new ArrayList<CourseComponet>();

    private String name;
    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponet courseComponet) {
        itmes.add(courseComponet);
    }

    @Override
    public void removeChild(CourseComponet courseComponet) {
        itmes.remove(courseComponet);
    }
}
