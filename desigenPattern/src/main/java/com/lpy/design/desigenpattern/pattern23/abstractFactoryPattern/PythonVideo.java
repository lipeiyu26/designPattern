package com.lpy.design.desigenpattern.pattern23.abstractFactoryPattern;

public class PythonVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("记录python视频内容");
    }
}
