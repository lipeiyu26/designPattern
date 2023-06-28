package com.lpy.design.desigenpattern.pattern23.builderPattern;

public class TestBuilderPattern {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addName("设计模式");
        builder.addPpt("【PPT课件】");
        builder.addVideo("【录播视频】");
        System.out.println(builder.builder());
    }
}
