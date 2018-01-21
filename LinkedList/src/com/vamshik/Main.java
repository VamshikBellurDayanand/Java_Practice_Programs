package com.vamshik;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Vamshik", 20);

        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(30);

        System.out.println(" Customer Blancne is " + customer.getBalance());


        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + "contains " + integerArrayList.get(i));
        }

        integerArrayList.add(1, 2);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + "contains " + integerArrayList.get(i));
        }
    }
}
