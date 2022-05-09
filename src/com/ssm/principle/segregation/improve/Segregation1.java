package com.ssm.principle.segregation.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 17:51
 */
// 单一职责：一个类只负责一项职责
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.operation1(new B()); // A类通过接口去依赖B类.
        a.operation2(new B());
        a.operation3(new B());

        C c = new C();
        c.operation1(new B()); // A类通过接口去依赖D类.
        c.operation2(new D());
        c.operation3(new D());
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {

    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("B.operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B.operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B.operation3");
    }
}

class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("D.operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D.operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D.operation5");
    }
}

class A { //A类通过接口Interface1,Interface2依赖（使用）B类的方法，但是只会用到1,2,3方法
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation2(Interface2 interface2) {
        interface2.operation2();
    }

    public void operation3(Interface2 interface2) {
        interface2.operation3();
    }
}

class C { //A类通过接口Interface1,Interface3依赖（使用）B类的方法，但是只会用到1,4,5方法
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation2(Interface3 interface3) {
        interface3.operation4();
    }

    public void operation3(Interface3 interface3) {
        interface3.operation5();
    }
}
