package com.vamshik;

public class Contacts {
    private static String name;
    private static String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static String getName() {
        return name;
    }

    public static String getNumber() {
        return number;
    }

    public static Contacts createContact(String name, String number) {
        return new Contacts(name, number);
    }
}
