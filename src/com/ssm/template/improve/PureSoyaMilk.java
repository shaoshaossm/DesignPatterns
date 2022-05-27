package com.ssm.template.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 17:39
 */
// 纯豆浆
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }
}
