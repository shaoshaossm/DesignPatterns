package com.ssm.bridge;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 14:58
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
