package com.ssm.principle.singleersponsibility;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 12:51
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }
}