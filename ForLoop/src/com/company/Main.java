package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for(int i=3; i < 9; i++){
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, i));
        }



        int count = 0;
        for(int i = 10; i > 0; i++) {
            boolean numb = isPrime(i);
            if (numb == true) {
                System.out.println("this number is prime: " + i);
                count = count + 1;
                if(count == 10) {
                    break;
                }
            } else {
                System.out.println(i + " is not prime");
            }
        }



    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    public static boolean isPrime(int n) {

        if(n==1) {
            return false;
        }

        for(int i=2; i<=n/2; i++) {     //Can replace i<=n/2 with: (long) Math.sqrt(n);    This would be less going through the loop less time, optimizing this method.
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
