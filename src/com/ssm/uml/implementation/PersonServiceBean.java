package com.ssm.uml.implementation;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/12 22:19
 */
public class PersonServiceBean implements PersonService{
    @Override
    public void delete(Integer id) {
        System.out.println("PersonServiceBean.delete");
    }
}
