package com.lpy.design.desigenpattern.pattern23.commandPattern;

public class TestCommand {

    public static void main(String[] args) {
        GPlayer player = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        System.out.println("===============================");

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.executes();
    }
}
