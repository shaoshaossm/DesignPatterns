package com.ssm.builder.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 15:10
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基10m");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20m");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶30m");
    }
}
