package com.vamshik;

public class Printer {
    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean isDuplexPrinter;

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;

    }

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean isDuplexPrinter) {

        this.tonerLevel = tonerLevel;
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int quantity) {
        if((tonerLevel + quantity) >=100) {
            tonerLevel = 100;
        }
        else {
            tonerLevel += quantity;
        }
    }

    public void printing() {
        if(isDuplexPrinter) {
            noOfPagesPrinted  += 2;
        }
        else {
            noOfPagesPrinted++;
        }
    }
}
