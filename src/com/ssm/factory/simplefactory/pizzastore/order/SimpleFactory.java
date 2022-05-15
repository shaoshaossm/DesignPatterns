package com.ssm.factory.simplefactory.pizzastore.order;

import com.ssm.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ssm.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.ssm.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.ssm.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 15:47
 */
// 实现简单工厂模式
public class SimpleFactory {
    public Pizza createPizza(String type) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else  if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }

        return pizza;
    }
}
