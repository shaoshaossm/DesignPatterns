package com.ssm.builder;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 14:17
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse commonHouse = new CommonHouse();
        commonHouse.buildHouse();
    }
}
