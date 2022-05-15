package com.ssm.factory.factorymethod.pizzastore.pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/14 18:37
 */
public class BJCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备原材料");
    }
}
