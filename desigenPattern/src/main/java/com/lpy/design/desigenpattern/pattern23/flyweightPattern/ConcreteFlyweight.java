package com.lpy.design.desigenpattern.pattern23.flyweightPattern;

public class ConcreteFlyweight implements IFlyWeight{
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address："+ System.identityHashCode(this));
        System.out.println("intrinsicState："+ this.intrinsicState);
        System.out.println("extrinsicState："+ extrinsicState);
    }
}
