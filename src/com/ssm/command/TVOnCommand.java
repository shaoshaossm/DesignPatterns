package com.ssm.command;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 18:57
 */
public class TVOnCommand implements Command {

    // 聚合TVReceiver

    TVReceiver tv;

    // 构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}

