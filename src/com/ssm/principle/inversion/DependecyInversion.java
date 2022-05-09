package com.ssm.principle.inversion;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/9 20:09
 */
// 依赖倒置原则：
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.reveiceEmail(new Email());
        person.reveiceEmail(new WeChat());
    }
}

interface IReceiver{
    public String getInfo();
}
class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "Email information :hello";
    }
}
class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "wechat information :hello";
    }
}
class Person {
    public void reveiceEmail(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
