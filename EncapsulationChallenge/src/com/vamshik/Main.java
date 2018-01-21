package com.vamshik;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(80, 12, true);

	    printer.fillUpToner(30);
        System.out.println("The toner level now is " + printer.getTonerLevel());

        printer.printing();
        System.out.println("The number of pages printed is " + printer.getNoOfPagesPrinted());
    }
}
