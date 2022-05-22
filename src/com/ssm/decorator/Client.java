package com.ssm.decorator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 16:03
 */
public class Client {
    public static void main(String[] args) {
        //装饰者模式下的订单：1份巧克力+1份牛奶的LongBlack
        //1、点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用="+order.cost());
        System.out.println("描述="+order.getDescription());

        //2、加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶  费用="+order.cost());
        System.out.println("order 加入一份牛奶  描述="+order.getDescription());
        //2、加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶  费用="+order.cost());
        System.out.println("order 加入一份牛奶  描述="+order.getDescription());
        //3、order加入一份巧克力
        order=new Chocolate(order);
        System.out.println("order 加入一份巧克力  费用="+order.cost());
        System.out.println("order 加入一份巧克力  描述="+order.getDescription());
    }
}

