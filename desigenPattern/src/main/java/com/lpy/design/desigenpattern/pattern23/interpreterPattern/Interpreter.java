package com.lpy.design.desigenpattern.pattern23.interpreterPattern;

public abstract class Interpreter implements IArithmeticInterpreter{
    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
