package com.lpy.design.desigenpattern.pattern23.statePattern;

public class TestState {

    public static void main(String[] args) {
        AppContext appContext = new AppContext();

        appContext.favorite();
        appContext.comment("评论：好文章，360个赞");
    }
}
