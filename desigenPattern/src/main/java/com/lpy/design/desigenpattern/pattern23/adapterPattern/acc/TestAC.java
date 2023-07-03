package com.lpy.design.desigenpattern.pattern23.adapterPattern.acc;

public class TestAC {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.output5V();
    }
}
