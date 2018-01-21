package com.vamshik;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

   public void addGroceryItem(String item) {
       groceryList.add(item);
       System.out.println("The item " + item + " is now added to the groceryList");
   }

   public void printGroceryList() {
       System.out.println("The grocery list has " + groceryList.size() + " items");
       System.out.println("The items are: ");
       for (int i = 0; i < groceryList.size(); i++) {
           System.out.println((i+1) + ". " + groceryList.get(i));
       }
   }

   public void removeGroceryItem(int position) {
       System.out.println(groceryList.get(position) + " is now removed");
       groceryList.remove(position);
   }

   public void modifyGroceryList(int position, String newItem) {
       groceryList.set(position, newItem);
       System.out.println("The new item " + newItem + " is now added to the position " + position);
   }

   public String findItem(String searchItem) {
       int position = groceryList.indexOf(searchItem);

       if(position >= 0) {
           return groceryList.get(position);
       }

       return null;
   }
}
