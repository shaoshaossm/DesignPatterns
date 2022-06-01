package com.ssm.state;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/1 14:32
 * 状态抽象类
 */
public abstract class State {


    // 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();

}
