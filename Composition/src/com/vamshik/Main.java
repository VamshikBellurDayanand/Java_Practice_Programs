package com.vamshik;


/*
    Inheritance - is a relationship
    Composition - has a relationship

    Composition can be used to create an object within another object.
    Composition can be used for inheriting from multiple classes.
 */
public class Main {

    public static void main(String[] args) {
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 2, 2, "v2.44");

        Resolution nativeResolution = new Resolution(2540, 1440);
        Monitor theMonitor = new Monitor("27 inch Beast", "Dell", 27, nativeResolution);

        Case theCase = new Case("220B", "Dell", "220", new Dimensions(20,20, 5));

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        thePC.getTheMonitor().drawPixelAt(1500,1200, "Red");
        thePC.getTheMotherboard().loadProgram("Windows");
        thePC.getTheCase().pressPowerButton();

    }
}
