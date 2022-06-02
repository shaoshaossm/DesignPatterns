package com.ssm.strategy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/2 12:32
 */
public class PekingDuck extends Duck {


    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();

    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }



}
