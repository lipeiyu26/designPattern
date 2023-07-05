package com.lpy.design.desigenpattern.pattern23.interpreterPattern.advance;

public class TestAdvance {
    public static void main(String[] args) {
        System.out.println("result："+ new LPYAdvanceCalculator("10+30/((6-4)*2-2)").calculate());//25
    }
}
