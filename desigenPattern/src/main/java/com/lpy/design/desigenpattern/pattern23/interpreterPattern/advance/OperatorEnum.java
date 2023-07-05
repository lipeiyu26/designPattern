package com.lpy.design.desigenpattern.pattern23.interpreterPattern.advance;

public enum OperatorEnum {
    ADD,
    SUB,
    MULTI,
    DIV,
    LEFT_BACKET,
    RIGHT_BACKET;
    public  String getOperator(){
        if(this == OperatorEnum.ADD){
            return "+";
        }
        if(this == OperatorEnum.SUB){
            return "-";
        }
        if(this == OperatorEnum.MULTI){
            return "*";
        }
        if(this == OperatorEnum.DIV){
            return "/";
        }
        if(this == OperatorEnum.LEFT_BACKET){
            return "(";
        }
        if(this == OperatorEnum.RIGHT_BACKET){
            return ")";
        }
        return null;
    }
}
