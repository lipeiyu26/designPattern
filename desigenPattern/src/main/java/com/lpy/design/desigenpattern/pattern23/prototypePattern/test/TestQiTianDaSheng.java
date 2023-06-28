package com.lpy.design.desigenpattern.pattern23.prototypePattern.test;

import com.lpy.design.desigenpattern.pattern23.prototypePattern.QiTianDaSheng;

/**
 * 浅克隆只会克隆对象的引用
 * 深克隆会克隆对象的属性信息
 */
public class TestQiTianDaSheng {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try{
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.deepClone();
            System.out.println("深克隆: "+(qiTianDaSheng.jinGuBang == clone.jinGuBang));//深克隆: false
        }catch (Exception e){
            e.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆: "+(q.jinGuBang == n.jinGuBang));//浅克隆: true
    }
}
