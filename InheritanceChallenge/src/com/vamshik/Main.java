package com.vamshik;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, 5);
        System.out.println(vehicle.getWheels());
        System.out.println(vehicle.getGear());

        System.out.println("************************************");
        Car car = new Car(4, 5, 4, 4, 1, "Maruthi");
        System.out.println(car.getWheels());
        System.out.println(car.getGear());
        System.out.println(car.getDoors());
        System.out.println(car.getWindows());
        System.out.println(car.getSteering());
        System.out.println(car.getName());

        car.changingGear();
        car.moving(40);
        System.out.println("************************************");

        Benz benz = new Benz(4, 6, 4, 4, 1, "Mercedes", 40);
        System.out.println(benz.getWheels());
        System.out.println(benz.getGear());
        System.out.println(benz.getDoors());
        System.out.println(benz.getWindows());
        System.out.println(benz.getSteering());
        System.out.println(benz.getName());
        System.out.println(benz.getSuspension());

        System.out.println("************************************");
    }
}
