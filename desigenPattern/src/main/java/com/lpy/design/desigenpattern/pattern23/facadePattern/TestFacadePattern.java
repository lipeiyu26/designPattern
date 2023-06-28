package com.lpy.design.desigenpattern.pattern23.facadePattern;

public class TestFacadePattern {

    public static void main(String[] args) {
        FacadeService facadeService = new FacadeService();
        GiftInfo giftInfo = new GiftInfo("《设计模式》");
        facadeService.exchange(giftInfo);

    }
}
