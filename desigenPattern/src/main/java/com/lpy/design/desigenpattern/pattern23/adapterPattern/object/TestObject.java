package com.lpy.design.desigenpattern.pattern23.adapterPattern.object;

import com.lpy.design.desigenpattern.pattern23.adapterPattern.acc.AC220;
import com.lpy.design.desigenpattern.pattern23.adapterPattern.acc.DC5;

public class TestObject {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
