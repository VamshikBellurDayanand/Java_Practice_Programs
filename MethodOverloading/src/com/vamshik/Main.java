package com.vamshik;

public class Main {

    public static void main(String[] args) {
	    double centimeter = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(10 + "feet and " + 11 + " inches is " + centimeter + " cms.");

        centimeter = calcFeetAndInchesToCentimeters(150);
        System.out.println(150 + " inches is " + centimeter + " cms.");

    }

    /*
        Function Overloading - 2 functions having same function name, but different no of parameters.
        2 functions having different return type is not function overloading.
     */
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0)
            return -1;
        else if ((inches >12) && (inches < 0))
            return -1;
        else {
            inches = inches + 12 * feet;
            return inches * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        if(inches < 0)
            return -1;
        else {
            int feet;
            feet = inches /12;
            inches = inches % feet;

            double centimeter = calcFeetAndInchesToCentimeters(feet, inches);
            return centimeter;
        }
    }
}
