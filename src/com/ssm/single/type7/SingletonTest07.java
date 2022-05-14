package com.ssm.single.type7;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/13 16:36
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

// 单例模式：静态内部类
class Singleton {
    // 构造器私有化
    public Singleton() {
    }

    // 静态内部类 有静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }


    // 提供一个公共的静态方法，直接返回SingletonInstance.instance
    public static synchronized Singleton getInstance() {
        return SingletonInstance.instance;
    }
}