package com.lpy.design.desigenpattern.pattern23.strategyPattern;

public class TestStrategy {
    public static void main(String[] args) {
        PromotionActivity activity = null;
        String promotion = "团购";
        if("团购".equals(promotion)){
            activity= new PromotionActivity(new GroupbuyStrategy());
        }

        activity.execute();
        PromotionStrategyFactory.getPromotionKeys();
        promotion = "COUPON";
        IPromotionStrategy strategy = PromotionStrategyFactory.getPromotionStrategy(promotion);
        strategy.doPromotion();
    }

}
