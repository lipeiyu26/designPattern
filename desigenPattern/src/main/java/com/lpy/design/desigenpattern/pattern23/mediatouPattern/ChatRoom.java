package com.lpy.design.desigenpattern.pattern23.mediatouPattern;

/**
 * 中介者模式
 */
public class ChatRoom {
    public void showMsg(User user,String msg){
        System.out.println("["+user.getName() +"]: " + msg);
    }
}
