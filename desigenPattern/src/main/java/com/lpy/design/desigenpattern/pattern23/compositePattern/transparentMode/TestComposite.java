package com.lpy.design.desigenpattern.pattern23.compositePattern.transparentMode;

public class TestComposite {
    public static void main(String[] args) {
        CourseComponet javaBase = new Course("Java入门课程",8000);
        CourseComponet ai = new Course("人工智能",18000);
        CourseComponet packageCourse = new CoursePackage("JAVA架构课程",2);
        CourseComponet design = new Course("JAVA设计模式",1500);
        CourseComponet source = new Course("源码分析",1600);
        CourseComponet softSkill = new Course("软技能",1700);
        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);
    }
}
