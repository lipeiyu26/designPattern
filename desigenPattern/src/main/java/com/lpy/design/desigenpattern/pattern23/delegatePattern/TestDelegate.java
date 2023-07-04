package com.lpy.design.desigenpattern.pattern23.delegatePattern;

public class TestDelegate {

    public static void main(String[] args) {
        new Boss().command("海报图",new Leader());
        new Boss().command("海报图",new LeaderNew());
    }
}
