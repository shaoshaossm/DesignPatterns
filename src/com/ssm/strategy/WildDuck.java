package com.ssm.strategy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/2 12:35
 */
public class WildDuck extends Duck {


    //构造器，传入FlyBehavor 的对象
    public  WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }

}

