package com.vamshik;

public class Main {

    public static void main(String[] args) {
        //byte is 8bits. It takes 2^7 values.
	    byte myByteValue = -64;

	    //int is 32bits. It takes 2^31 values.
        int myIntValue = 150;

        //short is 16bits. It takes 2^15 values.
        short myShortValue = 120;

        //long is 64bits. It takes 2^63 values. Append L or l to be more specific while addressing the long integers.
        long myLongValue = 50000L + 10 * (myByteValue + myShortValue + myIntValue);

        System.out.println("myLongValue is : " + myLongValue);
    }
}
