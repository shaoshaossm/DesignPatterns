package com.ssm.decorator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 16:02
 */
public class Milk extends Decorator {

    public Milk(Drink object) {
        super(object);
        setDescription("Milk");
        setPrice(2.0f);
    }
}
