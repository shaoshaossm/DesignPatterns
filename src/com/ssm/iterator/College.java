package com.ssm.iterator;

import java.util.Iterator;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/29 13:29
 */
public interface College {
     String getName();

    //增加系的方法
     void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
     Iterator createIterator();
}
