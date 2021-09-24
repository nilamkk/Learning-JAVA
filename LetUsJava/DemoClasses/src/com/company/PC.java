package com.company;

public class PC {
    private MotherBoard theMotherBoard;
    private Case theCase;
    private Monitor monitor;

    public PC(MotherBoard theMotherBoard, Case theCase, Monitor monitor) {
        this.theMotherBoard = theMotherBoard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
