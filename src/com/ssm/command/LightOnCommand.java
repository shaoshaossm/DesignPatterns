package com.ssm.command;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 17:50
 */
public class LightOnCommand implements Command {
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
