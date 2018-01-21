package com.vamshik;

public class Main {

    public static void main(String[] args) {

        //Following are the operators:
        //1. +
        //2. -
        //3. /
        //4. *
        //5. %
        //6. Auto Increment
        //7. Auto Decrement
        //8. +=, -=, *=, /=, %=
        //9. =, ==, !=, <=, >=, <, >
        //10. &&

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + "- 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "* 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + "/ 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println("Result is now: " + result);

        result++;
        System.out.println("Result is now: " + result);

        result--;
        System.out.println("Result is now: " + result);

        result += 10;
        System.out.println("Result is now: " + result);

        result -= 8;
        System.out.println("Result is now: " + result);

        result *= 2;
        System.out.println("Result is now: " + result);

        result /= 2;
        System.out.println("Result is now: " + result);

        //Task

        double myDouble = 20d;
        double mySecondDouble = 80d;
        double total = myDouble + mySecondDouble;
        total *= 25;

        total %= 40;

        if (total <= 20)
            System.out.println("Total was over the limit");
    }
}
