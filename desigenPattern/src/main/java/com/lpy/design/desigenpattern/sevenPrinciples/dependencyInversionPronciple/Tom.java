package com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple;

public class Tom {
    private ICourse course;

    public Tom() {
    }

    public Tom(ICourse course) {
        this.course = course;
    }
    public void study(ICourse course){
        course.study();
    }
    public void study(){
        this.course.study();
    }
}
