package com.vamshik;

public class MeatType {
    private String type;
    private double price;

    public MeatType(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
