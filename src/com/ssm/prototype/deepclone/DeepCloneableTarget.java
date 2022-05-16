package com.ssm.prototype.deepclone;

import java.io.Serializable;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/16 16:13
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = -8684989788996635L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
    //因为该类的属性都是String，因此我们这里使用默认的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
