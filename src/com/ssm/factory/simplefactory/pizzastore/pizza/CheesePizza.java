package com.ssm.factory.simplefactory.pizzastore.pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 15:00
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare cheese pizza");
    }
}
