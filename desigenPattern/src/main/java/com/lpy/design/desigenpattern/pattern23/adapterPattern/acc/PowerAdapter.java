package com.lpy.design.desigenpattern.pattern23.adapterPattern.acc;

/**
 * 适配器模式：违背了最小知道原则
 */
public class PowerAdapter extends AC220 implements DC5{
    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC " + adapterInput + "V,输出DC " + adapterOutput +"V");
        return adapterOutput;
    }
}
