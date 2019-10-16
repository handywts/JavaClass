package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        String finishedNumber = "";
        number = reversed(number);
        while(number > 0) {
            int lastDigit = number % 10;

            switch (lastDigit) {
                case 1:
                    finishedNumber = finishedNumber + "One ";
                    break;
                case 2:
                    finishedNumber = finishedNumber + "Two ";
                    break;
                case 3:
                    finishedNumber = finishedNumber + "Three ";
                    break;
                case 4:
                    finishedNumber = finishedNumber + "Four ";
                    break;
                case 5:
                    finishedNumber = finishedNumber + "Five ";
                    break;
                case 6:
                    finishedNumber = finishedNumber + "Six ";
                    break;
                case 7:
                    finishedNumber = finishedNumber + "Seven ";
                    break;
                case 8:
                    finishedNumber = finishedNumber + "Eight ";
                    break;
                case 9:
                    finishedNumber = finishedNumber + "Nine ";
                    break;
                case 0:
                    finishedNumber = finishedNumber + "Zero ";
                    break;
            }

            number /= 10;
        }
        System.out.println(finishedNumber);
    }

    public static int reversed(int x) {
        int reversedNumber = 0;
        while(x > 0) {
            int lastDigit = x%10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            x /= 10;
        }
        return reversedNumber;
    }

}
