package com.lpy.design.desigenpattern.pattern23.interpreterPattern;

/**
 * 减法
 */
public class SubInterpreter extends Interpreter{
    public SubInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
