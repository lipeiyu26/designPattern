package com.lpy.design.desigenpattern.pattern23.chainOfResponsibilityPattern;

import org.apache.commons.lang.StringUtils;

public class ValidateHandler extends Handler{
    @Override
    public void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getLoginName())
        || StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名或密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        next.doHandler(member);
    }
}
