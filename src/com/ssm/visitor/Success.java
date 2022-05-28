package com.ssm.visitor;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/28 14:37
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男生的评价是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女生的评价是成功");
    }
}
