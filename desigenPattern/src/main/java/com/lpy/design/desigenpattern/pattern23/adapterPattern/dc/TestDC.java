package com.lpy.design.desigenpattern.pattern23.adapterPattern.dc;

import com.lpy.design.desigenpattern.pattern23.adapterPattern.acc.AC220;

/**
 * 接口适配，违背了单一职责原则
 */
public class TestDC {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
