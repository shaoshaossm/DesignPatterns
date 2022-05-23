package com.ssm.flyweight;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 20:36
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
