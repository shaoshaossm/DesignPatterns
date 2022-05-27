package com.ssm.proxy.staticproxy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/23 16:55
 */
// 静态代理 代理对象
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teacher() {
        System.out.println("before proxy");
        target.teacher();
        System.out.println("after proxy");
    }
}

