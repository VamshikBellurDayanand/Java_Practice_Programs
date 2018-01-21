package com.vamshik;

public class Main {

    public static void main(String[] args) {
        char switchValue = 'F';

        switch (switchValue) {
            case 'A':
                System.out.println("Found " + switchValue);
                break;
            case 'B':
                System.out.println("Found " + switchValue);
                break;
            case 'C':
                System.out.println("Found " + switchValue);
                break;
            case 'D':
                System.out.println("Found " + switchValue);
                break;
            case 'E':
                System.out.println("Found " + switchValue);
                break;
            default:
                System.out.println("Not Found " + switchValue);
                break;
        }
    }
}
