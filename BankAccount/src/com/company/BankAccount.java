package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //Constructor Method to avoid having to set fields individually
    public BankAccount() {
        //This this() is a very special method just for empty constructors and is different from this.
        this(98766, 2.78, "Default name", "Default email", "Default phone");
        System.out.println("Empty Constructor called, with a this()");
    }

    //Constructor can be overloaded by adding different parameters
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters created");
        //We can set fields just like a setter, like below
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        //Though not advisable in most situations, we can also just call our setters from with this method, like so
        setAccountNumber(accountNumber);
        //This allows for more complex creations of constructors than just setting fields and uses code that you would have already written.
    }

    //Create pre-formed constructors by going to Code->Generate->Constructors then pick the parameters to add to the pre-formed constructor
    public BankAccount(String customerName, String email, String phoneNumber) {
        //This this() is now calling the 5 parameter constructor to get the name, email, and phone, but adding its own account number and balance.
        this(3333, 100.99, customerName, email, phoneNumber);

    }

    //Setters
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
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    //functional methods
    public void depositFunds(double money) {
        if(money>0) {
            balance = balance + money;
            System.out.println("The available balance is " + balance);
        }else {
            System.out.println("Please insert currency or transaction will be cancelled.");
        }
    }

    public void withdrawFunds(double money) {
        if(balance-money < 0){
            System.out.println("Insufficient funds, can not complete transaction.");
        }else{
            balance=balance-money;
            System.out.println("The available balance is now " + balance);
        }
    }
}
