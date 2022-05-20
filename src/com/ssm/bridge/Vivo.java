package com.ssm.bridge;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 14:56
 */
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println("vivo open");
    }

    @Override
    public void close() {
        System.out.println("vivo close");
    }

    @Override
    public void call() {
        System.out.println("vivo call");
    }
}
