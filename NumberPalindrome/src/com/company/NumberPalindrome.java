package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        number = Math.abs(number);  //negative numbers will not run, so this ensures there are none
        int check = number;  //number changes to zero as the while loop runs, so this preserves the original number
        while (number > 0) {
            int lastDigit = number % 10;  //creates a remained, that is the last digit of number
            reversed = reversed * 10;  //creates a new digit place for the last digit of number
            reversed += lastDigit;  //the last digit is added to the last position of reversed

            number /= 10;
        }

        if(reversed == check) {
            return true;
        }else{
            return false;
        }
    }

}
