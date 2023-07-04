package com.lpy.design.desigenpattern.pattern23.delegatePattern;

import java.util.HashMap;
import java.util.Map;

public class LeaderNew implements IEmployee{
    private Map<String,IEmployee> employee = new HashMap<String,IEmployee>();

    public LeaderNew() {
       employee.put("爬虫",new EmployeeA());
       employee.put("海报图",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(!employee.containsKey(task)){
            System.out.println("这个任务"+task+"超出了我的能力范围");
        }
        employee.get(task).doing(task);
    }
}
