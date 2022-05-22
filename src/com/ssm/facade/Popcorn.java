package com.ssm.facade;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 15:02
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn off ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }
}
