package com.ssm.facade;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 15:05
 */
public class Client {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
