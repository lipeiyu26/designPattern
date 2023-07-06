package com.lpy.design.desigenpattern.pattern23.visitorPattern;


public interface IVisitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
