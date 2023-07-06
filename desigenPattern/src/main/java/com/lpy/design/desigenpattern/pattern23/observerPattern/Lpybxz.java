package com.lpy.design.desigenpattern.pattern23.observerPattern;


import java.util.Observable;

/**
 * 观察折模式
 */
public class Lpybxz extends Observable {
    private String name = "LPY生态圈";
    private static final Lpybxz lp = new Lpybxz();

    public Lpybxz() {
    }
    public static Lpybxz getInstance(){
        return  lp;
    }
    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name + "上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
