package com.ssm.interpreter;

import java.util.HashMap;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/31 16:22
 */
public class VarExpression extends Expression {

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
