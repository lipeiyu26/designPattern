package com.lpy.design.desigenpattern.pattern23.bridgePattern;

public class TestBridge {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请","王总");
    }
}
