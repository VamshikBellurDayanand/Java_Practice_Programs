package com.vamshik;

/*
    Access Modifiers:
    1. Private - Accessible within the class only.
    2. Protected - Accessible withing the same package only.
    3. Public - Accessible from anywhere outside the class.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;
    private String engine;

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        if(validModel.equals("carrera")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}
