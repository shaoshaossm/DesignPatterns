package com.ssm.prototype.deepclone;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/16 16:23
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name= "红莲";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("不闻不问","冥族大将");
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        System.out.println("p.name=" + deepProtoType.name + "p.deepCloneableTarget=" + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println("p1.name=" + deepProtoType1.name + "p2.deepCloneableTarget=" + deepProtoType1.deepCloneableTarget.hashCode());
        //测试，方式2

        DeepProtoType p2 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println("p.name=" + deepProtoType.name + "p.deepCloneableTarget=" + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }
}
