package com.ssm.adapter.interfaceadapter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/19 20:08
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter(){
            // 只需要覆盖我们需要使用的方法即可
            @Override
            public void m1() {
                System.out.println("this is m1()");
            }
        };
        adapter.m1();
    }
}
