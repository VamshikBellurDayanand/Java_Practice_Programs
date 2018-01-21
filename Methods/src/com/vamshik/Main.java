package com.vamshik;

public class Main {

    public static void main(String[] args) {

        calculateFinalScore(true, 5, 800, 100);
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Vamshik", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Trupthi", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Vachan", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Spoorthi", position);
    }

    public static void calculateFinalScore(boolean gameOver, int levelCompleted, int score, int bonus) {
        int finalScore = -1;

        if(gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final Score is " + finalScore);
        }

        //return finalScore;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " in the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000)
            return 1;
        else if ((score >= 500) && (score < 1000))
            return 2;
        else if ((score >= 100) && (score < 500))
            return 3;
        else
            return 4;
    }
}
