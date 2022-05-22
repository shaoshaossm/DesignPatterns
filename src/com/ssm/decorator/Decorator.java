package com.ssm.decorator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 15:59
 */
public class Decorator extends Drink{
    private Drink object;

    public Decorator(Drink object) {
        this.object = object;
    }

    @Override
    public float cost() {
        //getPrice：自己的价格
        return super.getPrice()+ object.cost();
    }

    public String getDescription() {
        //       object.getDescription() 被装饰者的描述
        return description + " " + getPrice() + "&&" + object.getDescription();
    }

}
