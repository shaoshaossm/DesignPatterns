package com.ssm.factory.factorymethod.pizzastore.order;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:47
 */
//披萨店
public class PizzaStore {
    public static void main(String[] args) {
        new BJOrderPizza();//创建北京各种口味的披萨
//        new LDOrderPizza();//创建伦敦各种口味的披萨
    }
}

