package com.ssm.single.type6;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/13 16:36
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

// 单例模式：双重检查（线程安全，同步方法）
class Singleton {
    // 构造器私有化
    public Singleton() {
    }

    // 本类内部创建一个对象实例
    private static volatile Singleton instance;

    // 提供一个公共的静态方法，加入双重检查代码，解决线程安全问题，同时也解决了懒加载问题,也保证了效率
    public static synchronized Singleton getInstance() {
        if (instance == null) {

            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}