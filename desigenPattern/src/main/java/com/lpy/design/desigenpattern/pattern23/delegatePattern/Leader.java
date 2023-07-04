package com.lpy.design.desigenpattern.pattern23.delegatePattern;

public class Leader implements IEmployee{
    @Override
    public void doing(String task) {
        if("爬山".equals(task)){
            new EmployeeA().doing(task);
        }else if("海报图".equals(task)){
            new EmployeeB().doing(task);
        }else{
            System.out.println("这个任务"+task+"超出了我的能力范围");
        }
    }
}
