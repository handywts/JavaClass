package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;

        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while(number>0) {
            firstDigit = number % 10;
            number /= 10;
//            if (number <= 0) {
//                return firstDigit + lastDigit;
//            } else {
//                return -1;
//            }
        }
        sum = firstDigit + lastDigit;
        return sum;

    }

}
