package com.ssm.principle.liskov.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 21:12
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        B b = new B();
        //因为B类不再继承A类，因此调用者，不会再认为func1是求减法的。
        //调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("11+3+9=" + b.func2(11, 3));
        //使用组合仍然可以使用到A类相关方法
        System.out.println("11-3=" + b.func3(11, 3));
    }
}
class Base{
    //把更加基础的方法和成员写到Base类
}

// 两数只差
class A extends Base{
    public int func1(int a, int b) {
        return a - b;
    }
}

// B继承了A并且实现了func1方法两数相加，然后func2调用A的func1方法加10
class B extends Base {
    private A a = new A();
    // 重写了func1方法，可能是无意识的
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 10;
    }
    // 仍然想使用A的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
