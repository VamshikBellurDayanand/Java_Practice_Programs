package com.vamshik;

public class Main {

    public static void main(String[] args) {
	    for(int i = 2; i <= 8; i++) {
            System.out.println("10000 at " + i + "% is " + String.format("%.2f",calculateInterest(10000.0, i)));
        }


        for(int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + "% is " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i = 2; i <= 50; i++) {
	        if(isPrime(i)) {
                System.out.println(i + " is prime");
	            count += 1;
            }
            if(count == 3)
                break;
        }

        int number = 5;
        int finishNumber = 20;
        int evenNumberCount = 0;

        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number: " + number);
            number++;
            evenNumberCount++;

            if(evenNumberCount == 5) {
                break;
            }
        }
        System.out.println("The total number of even numbers are: " + evenNumberCount);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        // Optimization: i <= Math.sqrt(n)
        for (int i = 2; i <= (n / 2); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEvenNumber(int n) {
        if((n%2) == 0) {
            return true;
        }
        return false;
    }
}
