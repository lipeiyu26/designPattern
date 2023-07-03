package com.lpy.design.desigenpattern.pattern23.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String,IFlyWeight> pool = new HashMap<String,IFlyWeight>();

    public static IFlyWeight getFlyweight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            IFlyWeight flyWeight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState,flyWeight);
        }
        return pool.get(intrinsicState);
    }
}
