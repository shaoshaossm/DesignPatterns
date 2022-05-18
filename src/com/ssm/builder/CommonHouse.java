package com.ssm.builder;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 14:15
 */
public class CommonHouse  extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("普通房子建造基础");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子建造墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子建造屋顶");
    }
}
