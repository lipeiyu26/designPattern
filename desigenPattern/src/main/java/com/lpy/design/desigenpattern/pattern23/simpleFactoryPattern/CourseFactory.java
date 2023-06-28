package com.lpy.design.desigenpattern.pattern23.simpleFactoryPattern;

import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.ICourse;
import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.JavaCourse;
import com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple.PythonCourse;

import java.util.Objects;

/**
 *  ** 简单工厂模式是指由一个工厂对象决定创建出哪一种产品类的实例
 *  ** 属于创建型模式，单他不属于GOF-23种设计模式
 *  ** 适用场景：工厂类负责创建的对象较少，客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 *  ** 优点：只需要传入一个正确的参数，就可以获取你所需要的对象，无需知道其创建的细节
 *  ** 缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则，不易于扩展过于复杂的产品结构
 */
public class CourseFactory {

    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else{
            return null;
        }
    }

    public ICourse createByReflex(String className ){
        try{
            if(!Objects.isNull(className)){
                return (ICourse) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public ICourse createByReflex( Class< ? extends ICourse> clazz ){
        try{
            if(!Objects.isNull(clazz)){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
