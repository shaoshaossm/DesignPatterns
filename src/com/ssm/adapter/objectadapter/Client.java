package com.ssm.adapter.objectadapter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/19 11:28
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
