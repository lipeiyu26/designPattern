package com.lpy.design.desigenpattern.pattern23.builderPattern;

/**
 * 建造者模式是将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示
 */
public class CourseBuilderNew {
    private Course course = new Course();
    public CourseBuilderNew addName(String name){
        course.setName(name);
        return this;
    }
    public CourseBuilderNew addPpt(String ppt){
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilderNew addVideo(String video){
        course.setVideo(video);
        return this;
    }
    public CourseBuilderNew addNote(String note){
        course.setNote(note);
        return this;
    }
    public CourseBuilderNew addHomework(String homework){
        course.setHomework(homework);
        return this;
    }
    public Course builder(){
        return course;
    }
}
