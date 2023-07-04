package com.lpy.design.desigenpattern.pattern23.chainOfResponsibilityPattern;

/**
 * 责任链模式
 */
public abstract class Handler {
    protected  Handler next;
    public void next(Handler next){
        this.next = next;
    }
    public abstract void doHandler(Member member);

    public static class Builder<T>{
        private Handler head;
        private Handler tail;

        public Builder<T> addHandler(Handler handler){
            if(this.head == null){
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }
        public Handler build(){
            return this.head;
        }
    }

}
