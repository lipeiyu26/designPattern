package com.lpy.design.desigenpattern.pattern23.bridgePattern;

public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(IMessage message) {
        super(message);
    }
    void sendMessage(String message,String toUser){
        message = "【加急】"+message;
        super.sendMessage(message,toUser);
    }
}
