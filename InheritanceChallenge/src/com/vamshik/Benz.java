package com.vamshik;

public class Benz extends Car{

    int suspension;

    public Benz(int wheels, int gear, int doors, int windows, int steering, String name, int suspension) {
        super(wheels, gear, doors, windows, steering, name);
        this.suspension = suspension;
    }

    public int getSuspension() {
        return suspension;
    }
}
