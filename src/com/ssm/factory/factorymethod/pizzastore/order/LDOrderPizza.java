package com.ssm.factory.factorymethod.pizzastore.order;

import com.ssm.factory.factorymethod.pizzastore.pizza.LDCheessPizza;
import com.ssm.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.ssm.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:45
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheess")) {
            pizza = new LDCheessPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        } else {
            System.out.println("没有这种类型的披萨");
        }
        return pizza;
    }
}