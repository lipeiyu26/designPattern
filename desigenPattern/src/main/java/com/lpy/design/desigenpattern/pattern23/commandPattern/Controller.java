package com.lpy.design.desigenpattern.pattern23.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式
 */
public class Controller {
    private List<IAction> actions = new ArrayList<IAction>();
    public void execute(IAction action){
        action.execute();
    }
    public void addAction(IAction action){
        actions.add(action);
    }

    public void executes(){
        for (IAction action:actions) {
            action.execute();
        }
        actions.clear();
    }
}
