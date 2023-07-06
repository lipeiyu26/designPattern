package com.lpy.design.desigenpattern.pattern23.observerPattern;

public class TestObserver {
    public static void main(String[] args) {
        Lpybxz lp = Lpybxz.getInstance();
        Teacher tom = new Teacher("TOM");
        Teacher jerry = new Teacher("Jerry");

        lp.addObserver(tom);
        lp.addObserver(jerry);

        //用户行为
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("观察者模式适用于哪些场景？");

        lp.publishQuestion(question);
    }
}
