package com.vamshik;

/*
    Class is a blueprint of an object.
    It is kind of user defined data type.
 */
public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car hodden = new Car();

        porsche.setModel("911");
        System.out.println("The model is " + porsche.getModel());
    }
}
