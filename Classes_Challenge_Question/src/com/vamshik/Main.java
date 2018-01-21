package com.vamshik;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(1);
        account1.setBalance(100);
        account1.setCustomerName("Vamshik");
        account1.setEmail("Vamshik024@gmail.com");
        account1.setPhoneNumber("4155399493");

        System.out.println("*************************");
        System.out.println("The account number is " + account1.getAccountNumber());
        System.out.println("The balance is " + account1.getBalance());
        System.out.println("The customer name is " + account1.getCustomerName());
        System.out.println("The email is " + account1.getEmail());
        System.out.println("The phone number is " + account1.getPhoneNumber());

        account1.deposit(25);
        account1.withdraw(16);

        BankAccount account2 = new BankAccount();

        System.out.println("*************************");
        System.out.println("The account number is " + account2.getAccountNumber());
        System.out.println("The balance is " + account2.getBalance());
        System.out.println("The customer name is " + account2.getCustomerName());
        System.out.println("The email is " + account2.getEmail());
        System.out.println("The phone number is " + account2.getPhoneNumber());

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("*************************");
        System.out.println("Vip Customer name is " + vipCustomer1.getName());
        System.out.println("Vip Customer Credit limit is " + vipCustomer1.getCreditLimit());
        System.out.println("Vip Customer email id is " + vipCustomer1.getEmail());

        VipCustomer vipCustomer2 = new VipCustomer("Vamshik", 50);
        System.out.println("*************************");
        System.out.println("Vip Customer name is " + vipCustomer2.getName());
        System.out.println("Vip Customer Credit limit is " + vipCustomer2.getCreditLimit());
        System.out.println("Vip Customer email id is " + vipCustomer2.getEmail());
    }
}
