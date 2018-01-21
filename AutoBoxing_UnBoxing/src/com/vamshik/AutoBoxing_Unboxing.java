package com.vamshik;

import java.util.ArrayList;

public class AutoBoxing_Unboxing {
    /*
        AutoBoxing: Converting primitive types to corresponding object wrapper Class.
                    ex: int to Integer. using 'valueOf'
        UnBoxing: Converting wrapper class object to the primitive type.
                    ex: Integer to int. Using 'intValue'
     */

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
        }

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for(double dbl = 0; dbl < 10; dbl+=0.5) {
            doubleArrayList.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(i + " -> " + doubleArrayList.get(i).doubleValue());
        }
    }
}
