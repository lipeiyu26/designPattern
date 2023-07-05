package com.lpy.design.desigenpattern.pattern23.commandPattern;

public class PlayAction implements IAction{
    private GPlayer gPlayer;

    public PlayAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.paly();
    }
}
