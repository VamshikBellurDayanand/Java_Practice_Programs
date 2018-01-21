package com.vamshik;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        bank.addBranches("San Francisco");

        bank.addCustomer("San Francisco", "Vamshik", 20);
        bank.addCustomer("San Francisco", "Vachan", 80);
        bank.addCustomer("San Francisco", "Spoorthi", 60);

        bank.addCustomerTransaction("San Francisco", "Vamshik", 20);

        bank.listCustomers("San Francisco", true);
    }
}
