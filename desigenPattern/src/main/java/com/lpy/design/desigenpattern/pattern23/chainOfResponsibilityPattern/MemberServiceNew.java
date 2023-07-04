package com.lpy.design.desigenpattern.pattern23.chainOfResponsibilityPattern;

public class MemberServiceNew {
    public void login(String loginName,String loginPass){
        Handler.Builder builder  = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(new Member(loginName,loginPass));
    }
}
