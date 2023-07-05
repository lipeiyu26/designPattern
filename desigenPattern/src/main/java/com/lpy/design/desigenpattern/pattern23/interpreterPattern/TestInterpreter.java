package com.lpy.design.desigenpattern.pattern23.interpreterPattern;

public class TestInterpreter {

    public static void main(String[] args) {
        System.out.println("result: " + new LPYCalculator("10 + 30").calulate());
        System.out.println("result: " + new LPYCalculator("10 + 30 - 20").calulate());
    }
}
