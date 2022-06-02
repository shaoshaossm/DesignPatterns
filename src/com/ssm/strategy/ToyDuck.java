package com.ssm.strategy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/2 12:37
 */
public class ToyDuck extends Duck{


    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法

    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }


}
