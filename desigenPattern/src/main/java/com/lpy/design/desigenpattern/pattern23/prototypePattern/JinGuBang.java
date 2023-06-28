package com.lpy.design.desigenpattern.pattern23.prototypePattern;

import java.io.Serializable;

/**
 * 深克隆会克隆对象的属性信息
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d =10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }
    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
