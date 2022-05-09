package com.ssm.principle.singleersponsibility;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 12:58
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("汽车");
        vehicle.runAir("飞机");
    }
}
class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在空中上行驶");
    }
}