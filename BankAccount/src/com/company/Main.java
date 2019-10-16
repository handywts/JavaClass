package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create a new instance of a class the same way, with or without constructors
        BankAccount bobsAccount = new BankAccount();
        //But if you added parameters to a constructor, then the creation would look like this
        BankAccount johnsAccount = new BankAccount(12345, 50.0, "John Doe", "thisemail@gmail.com", "213545168");

        //Without contructors, this would be the code to set initial values for all the fields within the BankAccount class
//        bobsAccount.setAccountNumber(12345678);
//        Could set a number for balance if desired, otherwise it initializes at 0
//        bobsAccount.setCustomerName("Bob Doe");
//        bobsAccount.setEmail("bob@gmail.com");
//        bobsAccount.setPhoneNumber(15094892173);


        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(50.00);
        bobsAccount.depositFunds(51.0);
        bobsAccount.withdrawFunds(100.0);
        System.out.println(bobsAccount.getCustomerName());


        johnsAccount.withdrawFunds(100.0);
        johnsAccount.depositFunds(50.00);
        johnsAccount.depositFunds(51.0);
        johnsAccount.withdrawFunds(100.0);
        System.out.println(johnsAccount.getCustomerName());

        //Using the 3rd constructor that only has the last 3 parameters, must add the last 3 parameters only

        BankAccount timsAccount = new BankAccount("Tim Doe", "tim@gmail.com", "958596847");
        System.out.println(timsAccount.getEmail() + timsAccount.getBalance());

    }
}
