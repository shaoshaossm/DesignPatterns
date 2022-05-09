package com.ssm.principle.segregation;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 17:51
 */
//接口隔离原则
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
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

    @Override
    public void operation4() {
        System.out.println("B.operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B.operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D.operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D.operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D.operation3");
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

class A { //A类通过接口Interface1依赖（使用）B类的方法，但是只会用到1,2,3方法
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }
    public void operation2(Interface1 interface1) {
        interface1.operation2();
    }
    public void operation3(Interface1 interface1) {
        interface1.operation3();
    }
}
class C { //A类通过接口Interface1依赖（使用）B类的方法，但是只会用到1,4,5方法
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }
    public void operation4(Interface1 interface1) {
        interface1.operation4();
    }
    public void operation5(Interface1 interface1) {
        interface1.operation5();
    }
}