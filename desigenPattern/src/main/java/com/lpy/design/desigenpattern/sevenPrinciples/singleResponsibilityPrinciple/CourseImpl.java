package com.lpy.design.desigenpattern.sevenPrinciples.singleResponsibilityPrinciple;

public class CourseImpl implements ICourseInfo,ICourseManager{
    @Override
    public void showCourseInfo() {
        System.out.println("java课程信息为: 23种设计模式");
    }

    @Override
    public void managerCourse() {
        System.out.println("该课程由23位老师教授");
    }
}
