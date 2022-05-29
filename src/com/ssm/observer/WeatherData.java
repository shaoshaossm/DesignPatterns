package com.ssm.observer;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/29 15:42
 */
public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    public void dataChange() {
        //调用 接入方的 update
        currentConditions.update(getTemperatrue(), getPressure(), getHumidity());
    }
    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }
}
