package com.vamshik;

public class Main {

    public static void main(String[] args) {
	    // There are 8 Primitive datatypes in Java.
        //1. Byte
        //2. Short
        //3. Int
        //4. Long
        //5. Float
        //6. Double
        //7. Char
        //8. Boolean

        String myString = "This is a string";
        System.out.println("MyString is : " + myString);

        myString = myString + ", and more to it.";
        System.out.println("MyString is : " + myString);

        String numString = "10";
        int myInt = 50;

        numString = numString + myInt;
        System.out.println("MyString is : " + numString);
    }
}
