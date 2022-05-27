package com.ssm.proxy.staticproxy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/23 16:55
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teacher() {
        System.out.println("老师上课了");
    }
}
