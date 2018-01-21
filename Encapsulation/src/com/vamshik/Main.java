package com.vamshik;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Vamshik", 80, "Sword");

        System.out.println("Player health is " + player.getHealth());
        player.loseHealth(20);
        System.out.println("Player health is " + player.getHealth());
    }
}
