package com.ssm.builder.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 15:07
 */
public class CommonHouse  extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子建造基础5m");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子建造墙壁5m");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子建造屋顶5m");
    }
}
