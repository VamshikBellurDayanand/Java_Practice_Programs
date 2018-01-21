package com.vamshik;

public class HamBurger {
    private BreadRollType breadRollType;
    private MeatType meatType;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double basePrice;

    public HamBurger(BreadRollType breadRollType, MeatType meatType, Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.basePrice = addition1.getPrice() + addition2.getPrice() +
                        addition3.getPrice() + addition4.getPrice() + breadRollType.getPrice() + meatType.getPrice();
    }

    public HamBurger(BreadRollType breadRollType, MeatType meatType, Addition addition1) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.addition1 = addition1;
        this.basePrice = addition1.getPrice() + breadRollType.getPrice() + meatType.getPrice();
    }

    public HamBurger(BreadRollType breadRollType, MeatType meatType, Addition addition1, Addition addition2) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.basePrice = addition1.getPrice() + addition2.getPrice() + breadRollType.getPrice() + meatType.getPrice();
    }

    public HamBurger(BreadRollType breadRollType, MeatType meatType, Addition addition1, Addition addition2, Addition addition3) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition4 = addition3;
        this.basePrice = addition1.getPrice() + addition2.getPrice() +
                addition3.getPrice() + breadRollType.getPrice() + meatType.getPrice();
    }
    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
