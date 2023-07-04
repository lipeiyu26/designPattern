package com.lpy.design.desigenpattern.pattern23.strategyPattern;

public class PromotionActivity {

    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        strategy.doPromotion();
    }
}
