package com.ssm.visitor;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/28 14:36
 */
public abstract class Action {
    //得到男性 的测评
    public abstract void getManResult(Man man);

    //得到女的 测评
    public abstract void getWomanResult(Woman woman);
}
