package com.ssm.builder.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 15:18
 */
public class Client {
    public static void main(String[] args) {
        //        盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();
        //盖高楼
        HighBuilding highHouse = new HighBuilding();
        houseDirector.setHouseBuilder(highHouse);
        houseDirector.constructHouse();
    }
}
