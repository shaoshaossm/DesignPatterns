package com.ssm.factory.factorymethod.pizzastore.order;

import com.ssm.factory.factorymethod.pizzastore.pizza.BJCheessPizza;
import com.ssm.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.ssm.factory.factorymethod.pizzastore.pizza.Pizza;
import sun.misc.GC;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:42
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheessPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
