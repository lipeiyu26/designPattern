package com.lpy.design.desigenpattern.pattern23.compositePattern.safeMode;

/**
 * 组合模式之安全模式
 */
public abstract class Direcotry {
    protected String name;

    public Direcotry(String name) {
        this.name = name;
    }
    public abstract void show();
}
