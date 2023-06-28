package com.lpy.design.desigenpattern.pattern23.facadePattern;

/**
 * 外观角色
 */
public class GiftInfo {
    private String name;

    public GiftInfo(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
