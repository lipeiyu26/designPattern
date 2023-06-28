package com.lpy.design.desigenpattern.pattern23.prototypePattern;

import java.io.*;
import java.util.Date;

/**
 * 深克隆
 * 深克隆会克隆对象的属性信息
 *
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable{
    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        //只是初始化
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 克隆方法，采用的是深克隆
     * 可能会出现单例被破坏的问题
     * 和单例模式冲突了，单例模式不能克隆，因为只有一个对象
     * 内存中完成操作，对象读写，是通过字节码直接操作
     * 序列化操作类似
     * @return
     */
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            //克隆的新的对象
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 浅克隆只会克隆对象的引用
     * @param target
     * @return
     */
    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;
    }
}
