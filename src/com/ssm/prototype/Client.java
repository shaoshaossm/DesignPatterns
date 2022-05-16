package com.ssm.prototype;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/16 12:32
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("sheep", "1", "white");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }

}
