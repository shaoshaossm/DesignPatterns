package com.ssm.interpreter;

import java.util.HashMap;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/31 16:24
 * 加法解释器
 */
public class AddExpression extends SymbolExpression  {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    //var 仍然是 {a=10,b=20}..
    //一会我们debug 源码,就ok
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) ： 返回 left 表达式对应的值 a = 10
        //super.right.interpreter(var): 返回right 表达式对应值 b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}

