package com.vamshik;

public class Main {

    public static void main(String[] args) {
        int score = 800;
        boolean gameover = true;
        int bonus = 100;
        int levelCompleted = 5;

        int secondScore = 10000;
        int secondBonus = 200;
        int secondLevelCompleted = 8;

        if (gameover) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("Final Score is : " + finalScore);

            int secondFinalScore = secondScore + (secondBonus * secondLevelCompleted);
            System.out.println("Second Final Score is " + secondFinalScore);
        }
    }
}
