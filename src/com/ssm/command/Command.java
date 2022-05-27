package com.ssm.command;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 17:49
 */
public interface Command {
    //执行动作(操作)
    void execute();

    //撤销动作(操作)
    void undo();
}
