package com.lpy.design.desigenpattern.pattern23.interpreterPattern;

/**
 * 终结表达式
 */
public class NumInterpreter implements IArithmeticInterpreter{
    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
