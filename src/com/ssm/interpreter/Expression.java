package com.ssm.interpreter;

import java.util.HashMap;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/31 16:21
 *  * 抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 */
public abstract class Expression {
    // a + b - c
    // 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
