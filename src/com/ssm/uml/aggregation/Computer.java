package com.ssm.uml.aggregation;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/12 22:51
 */
public class Computer {
    private Mouse mouse; //鼠标可以和Computer分离
    private Moniter moniter;//显示器可以和Computer分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}

