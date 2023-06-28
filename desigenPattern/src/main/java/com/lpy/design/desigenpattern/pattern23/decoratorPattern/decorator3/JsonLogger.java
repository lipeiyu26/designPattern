package com.lpy.design.desigenpattern.pattern23.decoratorPattern.decorator3;

import com.fasterxml.jackson.databind.util.JSONPObject;
import net.sf.json.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

public class JsonLogger extends LoggerDecorator{
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject result = new JSONObject();
        result.put("message",s);
        logger.info(result.toString());
    }


    public void error(Exception e) {
        JSONObject result = new JSONObject();
        result.put("exception",e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        result.put("starckTrace",trace);
        logger.info(result.toString());
    }
}
