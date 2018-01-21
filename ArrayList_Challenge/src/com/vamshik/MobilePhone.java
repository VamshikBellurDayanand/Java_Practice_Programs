package com.vamshik;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private  ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts  = new ArrayList<Contacts>();
    }

    public ArrayList<Contacts> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contacts contacts) {
        if(findContact(contacts) >= 0) {
            System.out.println("The contact already exists");
            return false;
        }

        myContacts.add(contacts);
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contacts = myContacts.get(i);
            System.out.println("THe contact name is " + myContacts.get(i).getName());
            if(contacts.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts) {
        if(findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);

        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", is not found");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", is replaced with the " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts) {
        if(findContact(contacts) < 0) {
            System.out.println("The contact does not exist");
            return false;
        }

        this.myContacts.remove(findContact(contacts));
        System.out.println("THe contact is now removed");
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List: ");
        for (int i =0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> " +
                                            this.myContacts.get(i).getNumber());
        }
    }
}
