package com.ssm.decorator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 16:01
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink object) {
        super(object);
        setDescription("巧克力");
        setPrice(3.0f);
    }
}
