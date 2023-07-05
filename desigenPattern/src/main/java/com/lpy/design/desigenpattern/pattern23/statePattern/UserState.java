package com.lpy.design.desigenpattern.pattern23.statePattern;

public abstract class UserState {
    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }
    public abstract void favorite();
    public abstract void comment(String comment);
}
