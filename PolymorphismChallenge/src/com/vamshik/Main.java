package com.vamshik;

class Car {
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
       return "The engine in Car class is started";
    }

    public String accelerate(int speed) {
       return "The car is accelerated to speed " + speed;
    }

    public String brake() {
        return "The brake is applied in Car class";
    }
}

class Mercedes extends Car{
    public Mercedes() {
        super(4, "Mercedes");
    }

    @Override
    public String startEngine() {
        return "Engine of Mercedes is started";
    }

    @Override
    public String accelerate(int speed) {
        return "Mercedes is accelerated at speed " + speed;
    }

    @Override
    public String brake() {
        return "Brake is applied in Mercedes";
    }
}

class Jaguar extends Car {
    public Jaguar() {
        super(5, "Jaguar");
    }

    @Override
    public String startEngine() {
        return "Engine of Jaguar is started";
    }

    @Override
    public String accelerate(int speed) {
        return "Jaguar is accelerated at speed " + speed;
    }

    @Override
    public String brake() {
        return "Brake is applied in Jaguar";
    }
}


class Audi extends Car {
    public Audi() {
        super(6, "Audi");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i=1; i <= 10; i++) {
            Car car = randomCar();
            System.out.println("The car# is " + i + " and car name is " + car.getName());
            System.out.println(car.startEngine());
            System.out.println(car.accelerate((int)Math.random()*100));
            System.out.println(car.brake());
            System.out.println("\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("The random number is " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Mercedes();
            case 2:
                return new Jaguar();
            case 3:
                return new Audi();
            default:
                return null;
        }
    }
}
