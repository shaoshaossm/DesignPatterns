package com.ssm.factory.factorymethod.pizzastore.pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:38
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦 pepper pizza prepare");
    }
}
