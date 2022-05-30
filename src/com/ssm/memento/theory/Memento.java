package com.ssm.memento.theory;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/30 17:42
 */
public class Memento {
    private String state;

    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }



}
