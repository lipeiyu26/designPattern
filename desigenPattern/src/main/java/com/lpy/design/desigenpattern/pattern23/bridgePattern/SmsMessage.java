package com.lpy.design.desigenpattern.pattern23.bridgePattern;

public class SmsMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信发送"+message);
    }
}
