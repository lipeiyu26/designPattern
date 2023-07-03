package com.lpy.design.desigenpattern.pattern23.flyweightPattern.ticket;

public class TestTicket {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西","长沙");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("北京西","长沙");
        ticket.showInfo("软座");
    }
}
