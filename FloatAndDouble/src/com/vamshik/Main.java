package com.vamshik;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5/3;

        //Float takes 32 bits. Need to append f or F to be more specific. It displays 7 digits of Precision.
	    float myFloatValue = 5f / 3F;

	    //Double takes 64 bits. Need to append d or D to be more specific. It displays 16 digits of precision.
	    double myDoubleValue = 5d / 3D;

        System.out.println("myIntValue is : " + myIntValue);
        System.out.println("myFloatValue is : " + myFloatValue);
        System.out.println("myDoubleValue is : " + myDoubleValue);

        //Task to convert the pound to kilo. 1 pound = 0.45359237 kilograms.
        //Underscores can be used to make the number more readable.
        //Ex: 0.45359237 can be written as 0.453_592_37
        float pounds = 200F;
        double kilograms = pounds * 0.45359237D;

        System.out.println("kilograms is : " + kilograms);
    }
}
