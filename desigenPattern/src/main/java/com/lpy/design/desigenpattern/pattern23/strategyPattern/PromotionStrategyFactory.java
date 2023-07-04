package com.lpy.design.desigenpattern.pattern23.strategyPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrategyFactory {

    private static final Map<String,IPromotionStrategy> PROMOTION = new HashMap<String,IPromotionStrategy>();
    static {
        PROMOTION.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTION.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }
    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public PromotionStrategyFactory() {
    }
    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTION.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }
    public static Set<String> getPromotionKeys(){
        return PROMOTION.keySet();
    }
}
