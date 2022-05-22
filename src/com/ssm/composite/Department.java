package com.ssm.composite;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 11:08
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
