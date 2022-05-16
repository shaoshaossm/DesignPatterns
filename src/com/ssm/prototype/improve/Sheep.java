package com.ssm.prototype.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/16 12:31
 */
public class Sheep implements Cloneable{
    private String name;
    private String age;
    private String color;
    public Sheep friend; // 默认浅拷贝

    public Sheep(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    // 克隆该实例，使用默认的clone()方法
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
