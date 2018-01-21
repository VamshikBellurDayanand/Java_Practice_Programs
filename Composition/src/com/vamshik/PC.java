package com.vamshik;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, MotherBoard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public MotherBoard getTheMotherboard() {
        return theMotherboard;
    }
}
