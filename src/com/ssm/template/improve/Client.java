package com.ssm.template.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 14:22
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyaMilk redSoyaMilk = new RedBeanSoyaMilk();
        redSoyaMilk.make();
        System.out.println("制作花生豆浆");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("制作纯豆浆");
        SoyaMilk ppureSoyaMilk = new PureSoyaMilk();
        ppureSoyaMilk.make();
    }
}
