package com.lpy.design.desigenpattern.sevenPrinciples.singleResponsibilityPrinciple;

/**
 *  ** 不要存在多于一个导致类变更的原因
 *  ** 一个接口，类，方法只负责一项职责
 *  ** 优点：降低类的复杂度
 *  **      提高类的可读性
 *  **      提高系统的可维护性
 *  **      降低变更引起的风险
 */
public class TestSingleResponsibility {

    public static void main(String[] args) {
        CourseImpl course = new CourseImpl();
        course.showCourseInfo();
        course.managerCourse();
    }
}
