package com.vamshik;

import java.util.Scanner;

public class Main {
    private static int[] myIntArray;
    private static int number;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements \r");
        number = scanner.nextInt();

        myIntArray = new int[number];
        myIntArray = getArray(number);
        printArray(myIntArray);
        sortArray(myIntArray, 0, myIntArray.length-1);
        System.out.println("The array is now sorted in descending order");
        printArray(myIntArray);
    }

    public static int[] getArray(int number) {
        int[] values = new int[number];

        System.out.println("Enter " + number + " values \r");
        for(int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] myIntArray) {
        System.out.println("The array contains \r");
        for (int i =0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }

    public static void sortArray(int[] myIntArray, int low, int high) {
        if(low < high) {
            int mid = ((low + high)/2);
            sortArray(myIntArray, low, mid);
            sortArray(myIntArray, mid+1, high);
            merge(myIntArray, low, mid, high);
        }
    }

    public static void merge(int[] input, int p, int q, int r) {
        int length1 = q - p + 1;
        int length2 = r - q;
        int[] leftArray = new int[length1];
        int[] rightArray = new int[length2];

        for(int i = 0; i < length1; i++) {
            leftArray[i] = input[p + i];
        }

        for (int i = 0; i < length2; i++) {
            rightArray[i] = input[q + 1+ i];
        }

        int i = 0, j = 0, k = p;

        while ((i < length1) && (j < length2)) {
            if(leftArray[i] > rightArray[j]) {
                myIntArray[k] = leftArray[i];
                i++;
            }
            else {
                myIntArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < length1) {
            myIntArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < length2) {
            myIntArray[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
