package com.ssm.single.type3;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/13 16:36
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

// 单例模式：懒汉式(线程不安全)
class Singleton {
    // 构造器私有化
    public Singleton() {
    }

    // 本类内部创建一个对象实例
    private static Singleton instance;

    // 提供一个公共的静态方法，加入synchronized关键字，保证线程安全
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}