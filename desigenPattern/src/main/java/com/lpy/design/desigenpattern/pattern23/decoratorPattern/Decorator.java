package com.lpy.design.desigenpattern.pattern23.decoratorPattern;

public class Decorator extends Component{
    /**
     * 持有组件对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 转发请求给组件对象，可以在转发前后执行一些附加动作
     */
    @Override
    public void operation() {
        before();
        component.operation();
        after();
    }

    public void before(){
        System.out.println("---这是operation之前的动作");
    }
    public void after(){
        System.out.println("这是operation之后的动作---");
    }
}
