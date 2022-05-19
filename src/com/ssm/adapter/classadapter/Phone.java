package com.ssm.adapter.classadapter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/19 11:22
 */
public class Phone {

    public void charging(IVoltage5V ivoltage5V) {
        if (ivoltage5V.output5V() == 5) {
            System.out.println("电压正常，可以充电");
        } else {
            System.out.println("电压不正常，不能充电");
        }
    }
}
