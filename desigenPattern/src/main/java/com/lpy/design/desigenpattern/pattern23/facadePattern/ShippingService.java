package com.lpy.design.desigenpattern.pattern23.facadePattern;

public class ShippingService {
    public String delivery(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + " 进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
