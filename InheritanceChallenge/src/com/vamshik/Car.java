package com.vamshik;

public class Car extends Vehicle{
    int doors;
    int windows;
    int steering;

    public String getName() {
        return name;
    }

    String name;

    public Car(int wheels, int gear, int doors, int windows, int steering, String name) {
        super(wheels, gear);
        this.doors = doors;
        this.windows = windows;
        this.steering = steering;
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getSteering() {
        return steering;
    }
}
