package com.ssm.decorator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 15:56
 */
public class Espresso extends Coffee {
    public Espresso() {
        super.setDescription("意大利咖啡");
        super.setPrice(3.0f);
    }
}
