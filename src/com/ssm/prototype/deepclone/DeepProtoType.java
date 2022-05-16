package com.ssm.prototype.deepclone;

import com.sun.istack.internal.localization.NullLocalizable;

import java.io.*;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/16 16:18
 */
public class DeepProtoType implements Cloneable, Serializable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }
    // 深拷贝方式一
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对属性为基本数据类型和String的克隆
        deep = super.clone();
        //对属性为引用类型的单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;

    }
    // 深拷贝方式二
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //把当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

}
