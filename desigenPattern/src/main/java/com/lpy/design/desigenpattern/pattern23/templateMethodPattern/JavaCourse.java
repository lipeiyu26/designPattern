package com.lpy.design.desigenpattern.pattern23.templateMethodPattern;

public class JavaCourse extends AbstractCourse{
    private boolean needCheckHomework = false;

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查java作业");
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }
}
