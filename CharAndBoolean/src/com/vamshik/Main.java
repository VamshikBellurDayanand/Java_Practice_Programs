package com.vamshik;

public class Main {

    public static void main(String[] args) {

        //Char takes 16bits. It can print unicode characters using backslash u and unicode number of the character.
        char myChar = 'a';
        System.out.println("myChar is : " + myChar);

        char myNewChar = '\u00A7';
        System.out.println("Unicode output is : " + myNewChar);

        //Boolean takes only 2 values. True or False.
        boolean myBoolean = true;
    }
}
