package com.ssm.builder.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 15:12
 */
public class HouseDirector {
    // 构造器传入houseBuilder
    HouseBuilder houseBuilder = null;

    //    通过setter传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //    构造房子
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
