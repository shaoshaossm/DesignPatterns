package com.ssm.factory.simplefactory.pizzastore.order;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 15:22
 */
public class PizzaStore {
    public static void main(String[] args) {
        // 传统方式
        //new OrderPizza();
        // 使用简单工厂模式
        new OrderPizza2(new SimpleFactory());
        System.out.println("退出程序");
    }
}
