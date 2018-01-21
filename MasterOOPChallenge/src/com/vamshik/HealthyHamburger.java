package com.vamshik;

public class HealthyHamburger extends HamBurger{
    private Addition addition5;
    private Addition addition6;
    private double totalPrice;

    public HealthyHamburger(BreadRollType breadRollType, MeatType meatType, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5, Addition addition6) {
        super(breadRollType, meatType, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    public double getTotalPrice(double priceAddition5, double priceAddition6) {
        return totalPrice = getBasePrice() + priceAddition5 + priceAddition6;
    }
}
