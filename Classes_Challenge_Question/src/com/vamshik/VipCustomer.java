package com.vamshik;

public class VipCustomer {
    private String name;

    public VipCustomer() {
        this("defaultName", 30, "defaultEmailID");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "defaultEmailID");
    }

    private double creditLimit;
    private String email;


    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
