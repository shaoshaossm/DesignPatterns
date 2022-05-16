package com.ssm.factory.absfactory.order;

import com.ssm.factory.absfactory.pizza.LDCheessPizza;
import com.ssm.factory.absfactory.pizza.LDPepperPizza;
import com.ssm.factory.absfactory.pizza.Pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/15 16:43
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("Cheess")){
            pizza=new LDCheessPizza();
        }if (orderType.equals("Pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
