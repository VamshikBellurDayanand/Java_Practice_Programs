package com.vamshik;

import java.util.Scanner;

public class Main {
    /*
        Arrays is the data structure to store the values of similar type.
        Indexing starts from 0 in Java.
     */
    private static int[] myIntArray = new int[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        myIntArray = getArray(5);
        printArray(myIntArray);
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ", Value is " + myArray[i]);
        }
    }

    public static int[] getArray(int number) {
        System.out.println("Enter " + number + " values \r");
        int[] values = new int[number];

        for(int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
