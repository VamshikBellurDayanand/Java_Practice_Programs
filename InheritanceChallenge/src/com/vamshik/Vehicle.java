package com.vamshik;

public class Vehicle {
    int wheels;
    int gear;

    public Vehicle(int wheels, int gear) {
        this.wheels = wheels;
        this.gear = gear;
    }

    public void moving(int speed) {
        System.out.println("Vehicle is moving at " + speed);
    }

    public void changingGear() {
        System.out.println("Changing Gear is called in Vehicle class");
    }

    public int getWheels() {
        return wheels;
    }

    public int getGear() {
        return gear;
    }
}
