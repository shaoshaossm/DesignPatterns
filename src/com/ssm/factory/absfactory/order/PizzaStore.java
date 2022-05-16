package com.ssm.factory.absfactory.order;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/15 16:51
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
