package com.lpy.design.desigenpattern.pattern23.interpreterPattern.advance;

import com.lpy.design.desigenpattern.pattern23.interpreterPattern.IArithmeticInterpreter;
import com.lpy.design.desigenpattern.pattern23.interpreterPattern.NumInterpreter;
import com.lpy.design.desigenpattern.pattern23.interpreterPattern.OperatorUtil;

import java.util.Stack;

/**
 * 四则运算
 */
public class LPYAdvanceCalculator {
    //数字stack
    private Stack<IArithmeticInterpreter> numStack = new Stack<>();
    //操作符stack
    private Stack<String> operetorStack = new Stack<>();

    /**
     * 解析表达式
     * @param expression
     */
    public LPYAdvanceCalculator(String expression){
        this.parse(expression);
    }

    private void parse(String expression){
        //对表达式去除空字符操作
        String formula = this.transformStandardPattern(expression);
        System.out.println("标准表达式："+formula);
        for (String s:formula.split(" ")) {
            if(s.length() == 0){
                //如果是空格的话，就继续循环，什么也不做
                continue;
            }
            //如果是加减的话，因为加减的优先级最低，因此这里的只要遇到加减号，无论操作符栈中的是什么运算符都要运算
            else if(s.equals(OperatorEnum.ADD.getOperator())
            || s.equals(OperatorEnum.SUB.getOperator())){
                //当栈不是空的，并且栈中最上面的一个元素是加减乘除的任意一个
                while(!operetorStack.isEmpty()
                && (operetorStack.peek().equals(OperatorEnum.SUB.getOperator())
                || operetorStack.peek().equals(OperatorEnum.ADD.getOperator())
                || operetorStack.peek().equals(OperatorEnum.MULTI.getOperator())
                || operetorStack.peek().equals(OperatorEnum.DIV.getOperator()))){
                    //结果压入栈中
                    numStack.push(OperatorUtil.getInterpreter(numStack,operetorStack));
                }
                //运算完之后将当前的运算符入栈
                System.out.println("操作符入栈："+s);
                operetorStack.push(s);
            }

            //当前运算符是乘除的时候，因为优先级高于加减，因此要判断最上面的是否是乘除，如果是乘除就运算，否则的话就直接入栈
            else if (s.equals(OperatorEnum.MULTI.getOperator())
            || s.equals(OperatorEnum.DIV.getOperator())) {
                while (!operetorStack.isEmpty()
                && (operetorStack.peek().equals(OperatorEnum.MULTI.getOperator())
                || operetorStack.peek().equals(OperatorEnum.DIV.getOperator()))){
                    numStack.push(OperatorUtil.getInterpreter(numStack,operetorStack));
                }
                //将当前操作符入栈
                System.out.println("操作符入栈："+s);
                operetorStack.push(s);
            }
            //如果是左括号的话直接入栈，什么也不用操作，trim()函数是用来去除空格的，由于上面的分割操作符可能会令操作符有空格
            else if(s.equals(OperatorEnum.LEFT_BACKET.getOperator())){
                System.out.println("操作符入栈："+s);
                operetorStack.push(OperatorEnum.LEFT_BACKET.getOperator());
            }
            //如果是右括号的话，清除栈中的运算符直至左括号
            else if(s.equals(OperatorEnum.RIGHT_BACKET.getOperator())){
                while (!OperatorEnum.LEFT_BACKET.getOperator().equals(operetorStack.peek())){
                    //开始运算
                    numStack.push(OperatorUtil.getInterpreter(numStack,operetorStack));
                }
                //这里的是运算之后清除左括号
                String pop = operetorStack.pop();
                System.out.println("括号运算操作完成，清除栈中右括号："+pop);
            }
            //这里如果是数字的话直接入数字栈
            else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(s));
                System.out.println("数字入栈："+s);
                numStack.push(numInterpreter);
            }
        }

        //最后当栈中不是空的时候继续运算，直到栈中为空即可
        while (!operetorStack.isEmpty()){
            numStack.push(OperatorUtil.getInterpreter(numStack,operetorStack));
        }
    }

    /**
     * 计算结果出栈
     * @return
     */
    public int calculate(){
        return this.numStack.pop().interpret();
    }

    /**
     * 换成标准形式，便于切割
     * @param s
     * @return
     */
    public String transformStandardPattern(String s){
        String result ="";
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'
            || s.charAt(i) == '*' || s.charAt(i) == '/'
                    || s.charAt(i) == '+' || s.charAt(i) == '-')
                result += " " + s.charAt(i) + " ";
            else
                result += s.charAt(i);
        }
        return result;
    }
}
