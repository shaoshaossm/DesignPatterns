package com.ssm.observer.improve;


/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/30 11:21
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
