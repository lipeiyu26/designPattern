package com.lpy.design.desigenpattern.pattern23.singletonPattern.lazyHanSingleton;

/**
 * 懒汉式单例之注册式单例
 * 将每一个实例都缓存到统一的容器中，使用唯一标识获取实例
 * 不允许用构造方法生成枚举对象，因此，无法通过反射创建枚举对象
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
