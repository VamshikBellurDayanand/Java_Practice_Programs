package com.vamshik;

public class Main {

    private static String[] toppings = {"Carrot", "Beans", "Tomato", "Capsicum", "Jalapeno", "Cheese"};
    private static double[] priceToppings = {3, 4, 5, 6, 7, 8 };
    private static String[] breadType = {"Wheat", "Brown", "Milk"};
    private static double[] priceBread = {2, 3, 5};
    private static String[] meatType = {"Red", "White"};
    private static double[] priceMeat = {2, 3};
    private static String[] drinks = {"Sprite", "Coca cola", "Fanta"};
    private static double[] priceDrinks = {5, 6, 7};
    private static String[] chips = {"Lays", "Kurkure", "Cheetos"};
    private static double[] priceChips = {3, 4, 5};

    public static void main(String[] args) {
        for(int i = 1; i <=5; i++) {
            int choice = (int) (Math.random() * 3) + 1;
            System.out.println("Random Number is " + choice);
            switch (choice) {
                case 1:
                    System.out.println("Ham Burger is selected");
                    HamBurger hamBurger = prepareHamBurger();
                    System.out.println("Ham Burger is prepared");
                    System.out.println("The bread type is " + hamBurger.getBreadRollType().getType() + " and its price is " + hamBurger.getBreadRollType().getPrice() + "$");
                    System.out.println("The meat type is " + hamBurger.getMeatType().getType() + " and its price is " + hamBurger.getMeatType().getPrice()+ "$");
                    System.out.println("Following are the toppings added:");
                    System.out.println("The first topping is " + hamBurger.getAddition1().getType() + " and its price is " + hamBurger.getAddition1().getPrice()+ "$");
                    System.out.println("The second topping is " + hamBurger.getAddition2().getType() + " and its price is " + hamBurger.getAddition2().getPrice()+ "$");
                    System.out.println("The third topping is " + hamBurger.getAddition3().getType() + " and its price is " + hamBurger.getAddition3().getPrice()+ "$");
                    System.out.println("The fourth topping is " + hamBurger.getAddition4().getType() + " and its price is " + hamBurger.getAddition4().getPrice()+ "$");
                    System.out.println("The price of the Ham Burger is " + hamBurger.getBasePrice()+ "$");
                    System.out.println("**************************************************");
                    break;
                case 2:
                    System.out.println("Health Ham Burger is Selected");
                    HealthyHamburger healthyHamburger = prepareHealthyHamburger();
                    System.out.println("Healthy Ham Burger is prepared");
                    System.out.println("The bread type is " + healthyHamburger.getBreadRollType().getType() + " and its price is " + healthyHamburger.getBreadRollType().getPrice()+ "$");
                    System.out.println("The meat type is " + healthyHamburger.getMeatType().getType() + " and its price is " + healthyHamburger.getMeatType().getPrice()+ "$");
                    System.out.println("Following are the toppings added:");
                    System.out.println("The first topping is " + healthyHamburger.getAddition1().getType() + " and its price is " + healthyHamburger.getAddition1().getPrice()+ "$");
                    System.out.println("The second topping is " + healthyHamburger.getAddition2().getType() + " and its price is " + healthyHamburger.getAddition2().getPrice()+ "$");
                    System.out.println("The third topping is " + healthyHamburger.getAddition3().getType() + " and its price is " + healthyHamburger.getAddition3().getPrice()+ "$");
                    System.out.println("The fourth topping is " + healthyHamburger.getAddition4().getType() + " and its price is " + healthyHamburger.getAddition4().getPrice()+ "$");
                    System.out.println("The fifth topping is " + healthyHamburger.getAddition5().getType() + " and its price is " + healthyHamburger.getAddition5().getPrice()+ "$");
                    System.out.println("The sixth topping is " + healthyHamburger.getAddition6().getType() + " and its price is " + healthyHamburger.getAddition6().getPrice()+ "$");
                    System.out.println("The price of the Healthy Ham Burger is " + (healthyHamburger.getTotalPrice(healthyHamburger.getAddition5().getPrice(), healthyHamburger.getAddition6().getPrice()))+ "$");
                    System.out.println("**************************************************");
                    break;
                case 3:
                    System.out.println("Deluxe Ham Burger is Selected");
                    DeluxeHamburger deluxeHamburger = prepareDeluxeHamburger();
                    System.out.println("Deluxe Ham Burger is prepared");
                    System.out.println("The bread type is " + deluxeHamburger.getBreadRollType().getType() + " and its price is " + deluxeHamburger.getBreadRollType().getPrice()+ "$");
                    System.out.println("The meat type is " + deluxeHamburger.getMeatType().getType() + " and its price is " + deluxeHamburger.getMeatType().getPrice()+ "$");
                    System.out.println("Following are the toppings added:");
                    System.out.println("The first topping is " + deluxeHamburger.getAddition1().getType() + " and its price is " + deluxeHamburger.getAddition1().getPrice()+ "$");
                    System.out.println("The second topping is " + deluxeHamburger.getAddition2().getType() + " and its price is " + deluxeHamburger.getAddition2().getPrice()+ "$");
                    System.out.println("The third topping is " + deluxeHamburger.getAddition3().getType() + " and its price is " + deluxeHamburger.getAddition3().getPrice()+ "$");
                    System.out.println("The fourth topping is " + deluxeHamburger.getAddition4().getType() + " and its price is " + deluxeHamburger.getAddition4().getPrice()+ "$");
                    System.out.println("The Drink selected is " + deluxeHamburger.getDrink().getType() + " and its price is " + deluxeHamburger.getDrink().getPrice()+ "$");
                    System.out.println("The Chips selected is " + deluxeHamburger.getChips().getType() + " and its price is " + deluxeHamburger.getChips().getPrice()+ "$");
                    System.out.println("The price of the Healthy Ham Burger is " + (deluxeHamburger.getTotalPrice(deluxeHamburger.getDrink().getPrice(), deluxeHamburger.getChips().getPrice()))+ "$");
                    System.out.println("**************************************************");
                    break;
                default:
                    System.out.println("Burger Not available");
                    break;
            }
        }
    }

    public static HamBurger prepareHamBurger() {
        BreadRollType breadRollType = selectBreadType();
        MeatType meatType = selectMeatType();
        Addition addition1 = selectAddition();
        Addition addition2 = selectAddition();
        Addition addition3 = selectAddition();
        Addition addition4 = selectAddition();

        return new HamBurger(breadRollType, meatType, addition1, addition2, addition3, addition4);
    }

    public static HealthyHamburger prepareHealthyHamburger() {
        HamBurger hamBurger = prepareHamBurger();
        hamBurger.getBreadRollType().setType("Brown");
        hamBurger.getBreadRollType().setPrice(3);
        Addition addition1 = selectAddition();
        Addition addition2 = selectAddition();

        return new HealthyHamburger(hamBurger.getBreadRollType(), hamBurger.getMeatType(), hamBurger.getAddition1(),
                hamBurger.getAddition2(), hamBurger.getAddition3(), hamBurger.getAddition4(), addition1, addition2);
    }

    public static DeluxeHamburger prepareDeluxeHamburger() {
        HamBurger hamBurger = prepareHamBurger();
        Addition drinks = selectDrinks();
        Addition chips = selectChips();

        return new DeluxeHamburger(hamBurger.getBreadRollType(), hamBurger.getMeatType(), hamBurger.getAddition1(), hamBurger.getAddition2(),
                hamBurger.getAddition3(), hamBurger.getAddition4(), drinks, chips);
    }

    public static Addition selectDrinks() {
        int randomNumber = (int) (Math.random()*3);
        switch (randomNumber) {
            case 0: Addition addition = new Addition(drinks[randomNumber], priceDrinks[randomNumber]);
                return addition;
            case 1: Addition addition1 = new Addition(drinks[randomNumber], priceDrinks[randomNumber]);
                return addition1;
            case 2: Addition addition2 = new Addition(drinks[randomNumber], priceDrinks[randomNumber]);
                return addition2;
            default:
                return null;
        }
    }

    public static Addition selectChips() {
        int randomNumber = (int) (Math.random()*3);
        switch (randomNumber) {
            case 0: Addition addition = new Addition(chips[randomNumber], priceChips[randomNumber]);
                return addition;
            case 1: Addition addition1 = new Addition(chips[randomNumber], priceChips[randomNumber]);
                return addition1;
            case 2: Addition addition2 = new Addition(chips[randomNumber], priceChips[randomNumber]);
                return addition2;
            default:
                return null;
        }
    }

    public static BreadRollType selectBreadType() {
        int randomNumber = (int) (Math.random()*3);
        switch (randomNumber) {
            case 0: BreadRollType breadRollType = new BreadRollType(breadType[randomNumber], priceBread[randomNumber]);
                return breadRollType;
            case 1: BreadRollType breadRollType1 = new BreadRollType(breadType[randomNumber], priceBread[randomNumber]);
                return breadRollType1;
            case 2: BreadRollType breadRollType2 = new BreadRollType(breadType[randomNumber], priceBread[randomNumber]);
                return breadRollType2;
        }
        return null;
    }

    public static MeatType selectMeatType() {
        int randomNumber = (int) (Math.random()*2);
        switch (randomNumber) {
            case 0: MeatType meatKind = new MeatType(meatType[randomNumber], priceMeat[randomNumber]);
                return meatKind;
            case 1: MeatType meatKind1 = new MeatType(meatType[randomNumber], priceMeat[randomNumber]);
                return meatKind1;
            default:
                return null;
        }
    }

    public static Addition selectAddition() {
        int randomNumber = (int) (Math.random()*6);
        switch (randomNumber) {
            case 0: Addition addition = new Addition(toppings[randomNumber], priceToppings[randomNumber]);
                return addition;
            case 1: Addition addition1 = new Addition(toppings[randomNumber], priceToppings[randomNumber]);
                return addition1;
            case 2: Addition addition2 = new Addition(toppings[randomNumber], priceToppings[randomNumber]);
                return addition2;
            case 3: Addition addition3 = new Addition(toppings[randomNumber], priceToppings[randomNumber]);
                return addition3;
            case 4: Addition addition4 = new Addition(toppings[randomNumber], priceToppings[randomNumber]);
                return addition4;
            case 5: Addition addition5 = new Addition(toppings[randomNumber], priceToppings[randomNumber]);
                return addition5;
            default:
                return null;
        }
    }

}
