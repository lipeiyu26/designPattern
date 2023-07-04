package com.lpy.design.desigenpattern.pattern23.bridgePattern;

/**
 * 桥接模式
 */
public interface IMessage {
    /**
     * @param message 发送消息的内容
     * @param toUser  接收人
     */
    void send (String message,String toUser);
}
