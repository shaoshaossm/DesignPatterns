package com.ssm.builder;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/18 14:13
 */
public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    // 建成房子
    public void buildHouse() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
