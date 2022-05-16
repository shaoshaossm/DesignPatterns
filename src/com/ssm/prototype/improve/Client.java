package com.ssm.prototype.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/16 12:32
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("sheep", "1", "white");
        sheep.friend = new Sheep("friend", "2", "black");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        //......
        System.out.println(sheep+"sheep.friend="+sheep.friend.hashCode());
        System.out.println(sheep2+"sheep2.friend="+sheep2.friend.hashCode());
        System.out.println(sheep3);
    }

}
