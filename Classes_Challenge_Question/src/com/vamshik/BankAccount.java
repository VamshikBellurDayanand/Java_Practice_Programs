package com.vamshik;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    /*
        Constructors have same name as the class. They don't have the return type.
        They can be used to initialize the values of the fields.
        One constructor can call another constructor, but that should be the first statement.
        Constructors can be overloaded just like other methods.
     */
    public BankAccount() {
        this(5, 20.0, "Default Name", "DefaultEmailID", "000");
        System.out.println("This is the constructor without the parameters");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            System.out.println(amount + " will be deposited to the account");
            this.balance += amount;
            System.out.println("The present balance after depositing is " + balance);
        } else {
            System.out.println("Amount should be greater than or equal to 0");
        }
    }

    public double withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + " is withdrawn");
            System.out.println("Present balance is " + balance + "$");
        } else {
            System.out.println("Insufficient fund in the account. Hence cannot withdraw money :(");
        }
        return balance;
    }
}
