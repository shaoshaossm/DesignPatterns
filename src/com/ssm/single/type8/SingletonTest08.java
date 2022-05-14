package com.ssm.single.type8;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/13 16:36
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        instance.sayOK();
    }
}

// 单例模式：枚举
enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("OK");
    }
}
