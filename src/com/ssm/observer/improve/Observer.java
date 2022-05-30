package com.ssm.observer.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/30 11:24
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
