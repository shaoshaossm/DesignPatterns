package com.ssm.facade;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 15:02
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }


}
