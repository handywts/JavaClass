package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int currentDigit = number % 10;
            if(currentDigit%2 == 0) {
                sum += currentDigit;
                number /= 10;
            }else {
                number /= 10;
            }
        }

        return sum;

    }

}
