package com.vamshik;

public class Floor {
    private String type;
    private Dimensions dimensions;

    public Floor(String type, Dimensions dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setFloorColor(String color) {
        System.out.println("The floor color is set to " + color + " colour.");
    }
}
