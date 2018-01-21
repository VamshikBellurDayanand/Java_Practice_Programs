package com.vamshik;

public class Wall {
    private String type;
    private String color;
    private Dimensions dimensions;

    public Wall(String type, String color, Dimensions dimensions) {
        this.type = type;
        this.color = color;
        this.dimensions = dimensions;

    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setWindowsToWalls(int number) {
        System.out.println("the number of windows is set to " + number);
    }
}
