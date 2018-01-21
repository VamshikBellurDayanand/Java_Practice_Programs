package com.vamshik;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Chew called in dog class");
    }

    @Override
    public void eat() {
        System.out.println("Eat called in Dog class");
        super.eat();
    }
}
