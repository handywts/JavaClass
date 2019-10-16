package com.company;

public class FindingPrime {

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
