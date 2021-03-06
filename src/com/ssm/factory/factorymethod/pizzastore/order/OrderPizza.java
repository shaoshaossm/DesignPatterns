package com.ssm.factory.factorymethod.pizzastore.order;

import com.ssm.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:40
 */
public abstract class OrderPizza {
    // 构造方法
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            //调用方法
            pizza = creatPizza(orderType);
            if (pizza != null) {
                //输出pizza制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }
        while (true);


    }

    //定义一个抽象方法，让各个工厂子类自己实现
    abstract Pizza creatPizza(String orderType);

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = null;
            str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

