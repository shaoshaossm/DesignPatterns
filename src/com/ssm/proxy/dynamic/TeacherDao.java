package com.ssm.proxy.dynamic;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/23 20:15
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

}

