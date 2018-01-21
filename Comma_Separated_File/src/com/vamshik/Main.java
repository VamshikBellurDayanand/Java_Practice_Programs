package com.vamshik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws FileNotFoundException {
//	 write your code here
        String filenName = "C:/Users/Vamshik B D/Desktop/database.csv.txt";
        File file = new File(filenName);
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            String newString = scanner.next();
            System.out.print(newString + "|");
        }
        scanner.close();
    }
}
