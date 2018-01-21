package com.vamshik;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit) {
            System.out.println("Enter the choice");
            choice = scanner.nextInt();
            //scanner.nextLine();
            switch (choice) {
                case 0: printInstructions();
                    break;
                case 1: printGroceryList();
                    break;
                case 2: addItem();
                    break;
                case 3: removeItem();
                    break;
                case 4: modifyItem();
                    break;
                case 5: findItem();
                    break;
                case 6: quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Enter 0 to see the available choices");
        System.out.println("Enter 1 to print the grocery List");
        System.out.println("Enter 2 to add an item to the grocery List");
        System.out.println("Enter 3 to remove an item from the grocery List");
        System.out.println("Enter 4 to modify an item in the grocery List");
        System.out.println("Enter 5 to search an item in the grocery list");
        System.out.println("Enter 6 to quit");
    }

    public static void printGroceryList() {
        groceryList.printGroceryList();
    }

    public static void addItem() {
        System.out.printf("Enter the item to be added");
        String item = scanner.next();
        groceryList.addGroceryItem(item);
    }

    public static void removeItem() {
        System.out.println("Enter the position from where an item needs to be removed");
        int itemPosition = scanner.nextInt();
        groceryList.removeGroceryItem(itemPosition - 1);
    }

    public static void modifyItem() {
        System.out.println("Enter the position where an item needs to be modified");
        int itemPosition = scanner.nextInt();
        System.out.println("Enter the new item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemPosition -1, newItem);
    }

    public static void findItem() {
        System.out.println("Enter the item to be Searched");
        String item = scanner.nextLine();
        if(groceryList.findItem(item)!= null) {
            System.out.println(item + " is found");
        }else {
            System.out.println("Item is not found");
        }
    }
}
