package com.ssm.factory.factorymethod.pizzastore.pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:38
 */
public class LDCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦的CheessPizza prepare");
    }
}
