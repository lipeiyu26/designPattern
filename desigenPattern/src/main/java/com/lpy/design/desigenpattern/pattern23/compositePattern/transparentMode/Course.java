package com.lpy.design.desigenpattern.pattern23.compositePattern.transparentMode;

public class Course extends CourseComponet{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
