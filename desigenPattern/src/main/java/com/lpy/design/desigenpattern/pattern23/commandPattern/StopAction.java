package com.lpy.design.desigenpattern.pattern23.commandPattern;

public class StopAction implements IAction{
    private GPlayer gPlayer;

    public StopAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.stop();
    }
}
