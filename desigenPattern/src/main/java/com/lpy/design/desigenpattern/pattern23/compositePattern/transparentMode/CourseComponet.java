package com.lpy.design.desigenpattern.pattern23.compositePattern.transparentMode;

/**
 * 组合模式之透明模式
 */
public abstract class CourseComponet {

    public void addChild(CourseComponet courseComponet){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void removeChild(CourseComponet courseComponet){
        throw new UnsupportedOperationException("不支持删除操作");
    }
}
