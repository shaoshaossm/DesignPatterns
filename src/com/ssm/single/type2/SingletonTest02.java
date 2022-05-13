package com.ssm.single.type2;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/13 16:36
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
// 单例模式：饿汉式(静态代码块)
class Singleton{
    // 构造器私有化
    public Singleton() {
    }
    // 静态代码块
    private final static Singleton instance;
    static {
        instance = new Singleton();
    }
    // 提供一个公共的静态方法，返回本类的实例
    public static Singleton getInstance() {
        return instance;
    }
}