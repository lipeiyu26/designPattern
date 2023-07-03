package com.lpy.design.desigenpattern.pattern23.flyweightPattern.ticket;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TicketFactory {

    private static Map<String,ITicket> pool = new ConcurrentHashMap<String,ITicket>();

    public static ITicket queryTicket(String from,String to){
        String key = from + "->" + to;
        if(pool.containsKey(key)){
            System.out.println("使用缓存："+key);
            return pool.get(key);
        }
        System.out.println("首次查询，创建对象："+key);
        ITicket ticket = new TrainTicket(from,to);
        pool.put(key,ticket);
        return ticket;
    }
}
