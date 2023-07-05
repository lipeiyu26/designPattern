package com.lpy.design.desigenpattern.pattern23.statePattern;

public class UnLoginState extends UserState{
    @Override
    public void favorite() {
        this.switch2login();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
       this.switch2login();
       this.context.getState().comment(comment);
    }
    private void switch2login(){
        System.out.println("跳转到登录页面");
        this.context.setState(this.context.STATE_LOGIN);
    }
}
