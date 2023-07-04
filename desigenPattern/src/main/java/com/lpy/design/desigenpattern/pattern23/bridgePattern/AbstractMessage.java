package com.lpy.design.desigenpattern.pattern23.bridgePattern;

public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }
    void sendMessage(String message,String toUser){
        this.message.send(message,toUser);
    }
}
