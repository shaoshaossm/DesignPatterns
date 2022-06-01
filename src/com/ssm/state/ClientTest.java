package com.ssm.state;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/6/1 14:35
 * 状态模拟测试类
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建活动对象，奖品有1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }
}
