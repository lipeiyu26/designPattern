package com.lpy.design.desigenpattern.pattern23.iteratorPattern;

public class TestIterator {
    public static void main(String[] args) {
        Course java = new Course("JAVA架构");
        Course javaBase = new Course("JAVA基础");
        Course design = new Course("设计模式");
        Course ai = new Course("人工智能");

        ICourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(javaBase);
        aggregate.add(design);
        aggregate.add(ai);

        System.out.println("==============课程列表==============");
        printCourse(aggregate);
    }

    private static void printCourse(ICourseAggregate aggregate){
        Iterator<Course> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            Course course =iterator.next();
            System.out.println("《" + course.getName() + "》");
        }
    }
}
