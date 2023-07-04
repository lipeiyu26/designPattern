package com.lpy.design.desigenpattern.pattern23.delegatePattern;

public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
    public void command(String task,LeaderNew leader){
        leader.doing(task);
    }
}
