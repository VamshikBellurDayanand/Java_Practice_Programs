package com.vamshik;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();

//        places.add("Sydney");
//        places.add("Melbourne");
//        places.add("Brisbane");
//        places.add("Perth");
//        places.add("Canberra");
//        places.add("Adelaide");
//        places.add("Darwin");

        printList(places);

        addInOrder(places, "Sydney");
        addInOrder(places, "Melbourne");
        addInOrder(places, "Brisbane");
        addInOrder(places, "Perth");
        addInOrder(places, "Canberra");
        addInOrder(places, "Adelaide");
        addInOrder(places, "Darwin");

        printList(places);
    }

    private static void printList(LinkedList<String> places) {
        Iterator<String> i = places.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("*************************");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);

            if(comparison == 0) {
                System.out.println(newCity + " already exists");
                return false;
            }
            else if(comparison > 0) {
                //add new city before this one
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                //move on to next city
            }
        }
        listIterator.add(newCity);
        return true;
    }
}
