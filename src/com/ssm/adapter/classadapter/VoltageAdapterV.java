package com.ssm.adapter.classadapter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/19 11:15
 */
public class VoltageAdapterV extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }


}
