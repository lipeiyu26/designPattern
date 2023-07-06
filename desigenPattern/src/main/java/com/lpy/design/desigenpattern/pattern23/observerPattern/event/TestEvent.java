package com.lpy.design.desigenpattern.pattern23.observerPattern.event;

import com.google.common.eventbus.EventBus;

public class TestEvent {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        LPYEvent event = new LPYEvent();
        eventBus.register(event);
        eventBus.post("TOM");
    }
}
