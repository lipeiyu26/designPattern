package com.lpy.design.desigenpattern.pattern23.chainOfResponsibilityPattern;

public class TestChain {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        MemberServiceNew memberServiceNew = new MemberServiceNew();
        memberService.login("Tom","666");
        memberServiceNew.login("Tom","666");
    }
}
