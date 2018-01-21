package com.vamshik;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1, 1, 5, 20);
        System.out.println(animal.getName());
        System.out.println(animal.getBrain());
        System.out.println(animal.getBody());
        System.out.println(animal.getSize());
        System.out.println(animal.getWeight());

        System.out.println("+++++++++++++++++++++++++++++++");
        Dog dog = new Dog("Dog", 8, 40, 2, 4, 20, 1, "Silky");
        System.out.println(dog.getBody());
        System.out.println(dog.getBrain());
        System.out.println(dog.getName());
        System.out.println(dog.getSize());
        System.out.println(dog.getWeight());

        dog.eat();
    }
}
