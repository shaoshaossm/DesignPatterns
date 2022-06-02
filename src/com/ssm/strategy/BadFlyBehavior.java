package com.ssm.strategy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/2 12:21
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(" 飞翔技术一般 ");
    }

}
