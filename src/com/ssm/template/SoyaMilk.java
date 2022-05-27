package com.ssm.template;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 14:21
 */
public abstract class SoyaMilk {
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("第一步：选择材料");
    }

    // 添加不同配料 子类具体实现
    abstract void addCondiments();

    void soak() {
        System.out.println("第三步：浸泡");
    }

    void beat() {
        System.out.println("第四步：搅拌");
    }
}
