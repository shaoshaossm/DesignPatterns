package com.ssm.facade;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 14:08
 */
public class DVDPlayer {
    // 单例模式：饿汉式
    private static DVDPlayer dvdPlayer = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return dvdPlayer;
    }
    public void on() {
        System.out.println(" dvd on ");
    }
    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

    //....
    public void pause() {
        System.out.println(" dvd pause ..");
    }
}
