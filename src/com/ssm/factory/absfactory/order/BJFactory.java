package com.ssm.factory.absfactory.order;

import com.ssm.factory.absfactory.pizza.BJCheessPizza;
import com.ssm.factory.absfactory.pizza.BJPepperPizza;
import com.ssm.factory.absfactory.pizza.Pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/15 16:42
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("Cheess")) {
            pizza = new BJCheessPizza();
        }
        if (orderType.equals("Pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
