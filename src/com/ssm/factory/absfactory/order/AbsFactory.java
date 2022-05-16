package com.ssm.factory.absfactory.order;

import com.ssm.factory.absfactory.pizza.Pizza;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/15 16:41
 */
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
