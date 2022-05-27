package com.ssm.proxy.staticproxy;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/23 16:57
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teacher();
    }
}
