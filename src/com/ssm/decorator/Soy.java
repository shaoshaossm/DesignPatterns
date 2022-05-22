package com.ssm.decorator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 16:02
 */
public class Soy extends Decorator {

    public Soy(Drink object) {
        super(object);
        setDescription("豆浆");
        setPrice(1.5f);
    }
}
