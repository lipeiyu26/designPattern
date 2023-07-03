package com.lpy.design.desigenpattern.pattern23.adapterPattern.dc;

import com.lpy.design.desigenpattern.pattern23.adapterPattern.acc.AC220;

public class PowerAdapter implements DC{
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC "+ adapterInput);
        return adapterOutput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
