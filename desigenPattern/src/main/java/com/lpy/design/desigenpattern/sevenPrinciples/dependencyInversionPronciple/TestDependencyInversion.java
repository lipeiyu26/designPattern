package com.lpy.design.desigenpattern.sevenPrinciples.dependencyInversionPronciple;

/**
 *  ** 高层模块不应该依赖底层模块，二者都应该依赖其抽象 **
 *  ** 抽象不应该依赖细节，细节应该依赖抽象 **
 *  ** 针对接口编程，不要针对实现编程 **
 *  ** 优点：可以减少类之间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的的风险 **
 */
public class TestDependencyInversion {

    public static void main(String[] args) {
        System.out.println("===============1==============");
        Tom tom = new Tom();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
        System.out.println("===============2==============");
        Tom tom2 = new Tom(new JavaCourse());
        tom2.study();
    }
}
