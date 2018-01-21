package com.vamshik;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if((health > 0) && (health <= 100)) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        System.out.println("Player has lost some health due to damage.");
    }
}
