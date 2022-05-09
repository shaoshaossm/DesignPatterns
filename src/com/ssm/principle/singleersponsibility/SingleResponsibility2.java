package com.ssm.principle.singleersponsibility;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 12:55
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("路车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上行驶");
    }
}