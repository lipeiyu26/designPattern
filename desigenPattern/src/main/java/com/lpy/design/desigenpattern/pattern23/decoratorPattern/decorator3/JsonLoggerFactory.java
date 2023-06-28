package com.lpy.design.desigenpattern.pattern23.decoratorPattern.decorator3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
