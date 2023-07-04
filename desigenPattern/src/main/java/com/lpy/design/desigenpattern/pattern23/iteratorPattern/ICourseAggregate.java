package com.lpy.design.desigenpattern.pattern23.iteratorPattern;

public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
