package com.ssm.command;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/27 17:50
 */
public class LightOffCommand implements Command {
    LightReceiver  lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
