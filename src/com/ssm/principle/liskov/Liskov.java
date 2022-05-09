package com.ssm.principle.liskov;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 20:54
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("10 - 3 =" + a.func1(10, 3));
        B b = new B();
        System.out.println("10 - 3 =" + b.func1(10, 3)); // 13 本意是算10-3
        System.out.println("10 + 3 + 10 =" + b.func2(10, 3)); // 23
    }
}

// 两数只差
class A {
    public int func1(int a, int b) {
        return a - b;
    }
}

// B继承了A并且实现了func1方法两数相加，然后func2调用A的func1方法加10
class B extends A {
    // 重写了func1方法，可能是无意识的
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 10;
    }
}