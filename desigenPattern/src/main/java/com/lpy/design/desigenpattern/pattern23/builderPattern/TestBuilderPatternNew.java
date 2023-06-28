package com.lpy.design.desigenpattern.pattern23.builderPattern;

public class TestBuilderPatternNew {

    public static void main(String[] args) {
        CourseBuilderNew builder = new CourseBuilderNew()
        .addName("设计模式")
        .addPpt("【PPT课件】")
        .addVideo("【录播视频】");
        System.out.println(builder.builder());
    }
}
