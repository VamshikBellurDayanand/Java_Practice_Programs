package com.vamshik;

import java.util.Scanner;

/*
    Arraylist can be used to resize the arrays in efficient way.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] myIntArray;

    public static void main(String[] args) {
	    myIntArray = new int[5];
	    getInput(myIntArray);
	    printArray(myIntArray);
        resize();
	    myIntArray[5] = 6;
	    myIntArray[6] = 7;
        printArray(myIntArray);
    }

    public static void getInput(int[] myIntArray) {
        for(int i =0; i < myIntArray.length; i++) {
            myIntArray[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] newArray) {
        System.out.println("The array contains");
        for(int i = 0; i < newArray.length; i++) {
            System.out.println("Element " + i + " has value: " + newArray[i]);
        }
    }

    public static void resize() {
        int[] newArray = myIntArray;
        myIntArray = new int[7];
        for(int i = 0; i < newArray.length; i++) {
            myIntArray[i] = newArray[i];
        }
    }
}
