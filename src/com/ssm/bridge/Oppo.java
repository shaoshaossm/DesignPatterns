package com.ssm.bridge;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 14:57
 */
public class Oppo implements Brand {
    @Override
    public void open() {
        System.out.println("oppo open");
    }

    @Override
    public void close() {
        System.out.println("oppo close");
    }

    @Override
    public void call() {
        System.out.println("oppo call");
    }
}


