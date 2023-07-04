package com.lpy.design.desigenpattern.pattern23.strategyPattern.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStretegy {
    public static final String AL_IPAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String UNION_PAY = "UnionPay";

    public static final String DEFAULT_PAY = AL_IPAY;
    private static Map<String,Payment> strategy = new HashMap<String,Payment>();

    static{
        strategy.put(AL_IPAY,new AliPay());
        strategy.put(JD_PAY,new JDPay());
        strategy.put(WECHAT_PAY,new WechatPay());
        strategy.put(UNION_PAY,new UnionPay());
    }

    public static Payment get(String payKey){
        if(!strategy.containsKey(payKey)){
            return strategy.get(DEFAULT_PAY);
        }else{
            return strategy.get(payKey);
        }
    }
}
