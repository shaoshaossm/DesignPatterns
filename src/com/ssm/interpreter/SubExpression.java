package com.ssm.interpreter;

import java.util.HashMap;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/31 16:25
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}

