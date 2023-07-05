package com.lpy.design.desigenpattern.pattern23.mediatouPattern;

public class TestMediatou {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User tom = new User("Tom",chatRoom);
        User jerry = new User("Jerry",chatRoom);

        tom.sendMessage("Hi,I am Tom.");
        jerry.sendMessage("Hello! My name is Jerry.");
    }
}
