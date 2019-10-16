package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if(number < 2 ) {
            return -1;
        }

        int prime = 0;
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if(isNumberPrime(i)) {
                    prime = i;
                }
            }
        }
        if(prime < 0) {
            return -1;
        }else{
            return prime;
        }
    }

    public static boolean isNumberPrime(int number) {
        if(number == 0 || number == 1 || number < 0) {
            return false;
        }else if(number == 2) {
            return true;
        }

        boolean prime = true;
        for(int i = 2; i < number; i++) {
            if(number%i == 0) {
                prime = false;
            }
        }
        return prime;
    }

}
