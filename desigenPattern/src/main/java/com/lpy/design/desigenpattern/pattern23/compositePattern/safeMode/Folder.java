package com.lpy.design.desigenpattern.pattern23.compositePattern.safeMode;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Direcotry{
    private List<Direcotry> dirs;
    private Integer level;

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<Direcotry>();
    }

    @Override
    public void show() {
        System.out.println(dirs.size());
    }
    public boolean add(Direcotry dir){
        return this.dirs.add(dir);
    }
    public boolean remove(Direcotry dir){
        return this.dirs.remove(dir);
    }
    public Direcotry get(int index){
        return this.dirs.get(index);
    }
}
