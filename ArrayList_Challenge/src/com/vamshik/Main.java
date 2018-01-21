package com.vamshik;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");


    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter 6 to show all the actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting Down");
                    quit = true;
                    break;
                case 1: mobilePhone.printContacts();
                    break;
                case 2:  addNewContact();
                    break;
                case 3: updateContact();
                    break;
                case 4: removeContact();
                    break;
                case 5: queryContact();
                    break;
                case 6: printActions();
                    break;

            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter a name");
        String name = scanner.nextLine();

        System.out.println("Enter a phone number");
        String number = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact is added. \n" + name + ", phone is : "+ number);
        } else  {
            System.out.println("Cannont add name. It is already on phone");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the contact name to be updated");
        String name = scanner.nextLine();

        Contacts existingRecord = mobilePhone.queryContact(name);
        if (existingRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingRecord, newContact)) {
            System.out.println("Updated successfully");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter the contact name to be updated");
        String name = scanner.nextLine();

        Contacts existingRecord = mobilePhone.queryContact(name);
        if (existingRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingRecord)) {
            System.out.println("Record removed successfully");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter the contact name to be updated");
        String name = scanner.nextLine();

        Contacts existingRecord = mobilePhone.queryContact(name);
        if (existingRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingRecord.getName() + " and phone number is " + existingRecord.getNumber());
    }

    private static void startPhone() {
        System.out.println("Starting a phone...");
    }

    private static void printActions() {
        System.out.println("\n Available Actions: \npress");
        System.out.println( "0 - to shutdown\n" +
                            "1 - to print contacts\n" +
                            "2 - to add contacts\n"+
                            "3 - to update a contact\n"+
                            "4 - to remove a contact\n" +
                            "5 - Query a contact\n" +
                            "6 - Print Actions");
        System.out.println("Choose an action");
    }
}
