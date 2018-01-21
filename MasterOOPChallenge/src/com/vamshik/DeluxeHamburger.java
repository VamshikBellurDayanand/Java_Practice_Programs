package com.vamshik;

public class DeluxeHamburger extends HamBurger{
    private Addition drink;
    private Addition chips;
    private double totalPrice;

    public DeluxeHamburger(BreadRollType breadRollType, MeatType meatType, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition drink, Addition chips) {
        super(breadRollType, meatType, addition1, addition2, addition3, addition4);
        this.drink = drink;
        this.chips = chips;
    }

    public Addition getDrink() {
        return drink;
    }

    public Addition getChips() {
        return chips;
    }

    public double getTotalPrice(double priceDrink, double priceChips) {
        return totalPrice = getBasePrice() + priceDrink + priceChips;
    }
}
