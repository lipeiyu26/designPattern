package com.lpy.design.desigenpattern.pattern23.commandPattern;

public class PauseAction implements IAction{
    private GPlayer gPlayer;

    public PauseAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.pause();
    }
}
