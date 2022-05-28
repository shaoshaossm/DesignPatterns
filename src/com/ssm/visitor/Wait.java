package com.ssm.visitor;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/28 14:56
 */
public class Wait extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价是该歌手待定 ..");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价是该歌手待定 ..");
    }

}
