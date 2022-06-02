package com.ssm.strategy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/2 12:22
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println(" 不会飞翔  ");
    }

}
