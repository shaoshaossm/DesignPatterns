package com.ssm.visitor;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/28 14:40
 */
public class Man  extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
