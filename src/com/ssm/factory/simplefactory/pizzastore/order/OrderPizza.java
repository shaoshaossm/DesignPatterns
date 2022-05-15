package com.ssm.factory.simplefactory.pizzastore.order;

import com.ssm.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ssm.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.ssm.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 15:08
 */
public class OrderPizza  {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购的类型
        do {
            orderType = getType();
            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese");
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek");
            } else if (orderType.equals("pepper")) {
                pizza = new GreekPizza();
                pizza.setName("pepper");
            }
            else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);

    }


    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
