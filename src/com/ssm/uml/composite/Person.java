package com.ssm.uml.composite;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/12 22:57
 */
public class Person {
    private IDCard card; //聚合关系
    private Head head = new Head(); //组合关系
}
