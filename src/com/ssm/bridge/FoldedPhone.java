package com.ssm.bridge;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/20 14:59
 */
//折叠式手机类
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("打开手机");
    }

    public void close() {
        super.close();
        System.out.println("关闭手机");
    }

    public void call() {
        super.call();
        System.out.println("放电话");
    }
}
