package com.lpy.design.desigenpattern.pattern23.interpreterPattern;

public class AddInterpreter extends Interpreter{
    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}
