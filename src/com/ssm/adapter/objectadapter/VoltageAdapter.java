package com.ssm.adapter.objectadapter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/19 11:15
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    //通过构造器传入
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        return dst;
    }


}
