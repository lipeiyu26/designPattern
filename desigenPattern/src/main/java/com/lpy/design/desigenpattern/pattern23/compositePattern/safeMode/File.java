package com.lpy.design.desigenpattern.pattern23.compositePattern.safeMode;

public class File extends Direcotry{

    public File(String name) {
        super(name);
    }


    public void show() {
        System.out.println(this.name);
    }
}
