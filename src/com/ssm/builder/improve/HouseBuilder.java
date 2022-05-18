package com.ssm.builder.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 15:03
 */
public abstract class HouseBuilder {
    protected House house = new House();
    // 建造流程 抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();
    // 建造房子好了，将房子返回
    public House buildHouse() {
        return this.house;
    }
}
