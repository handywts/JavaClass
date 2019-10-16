package com.company;

public class NumberToWords {

    public static void numberTwoWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);
        int counted = getDigitCount(number);

        String finishedNumber = "";

        for(int i = 0; i < counted; i++) {
            int lastDigit = reversed % 10;

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

            reversed /= 10;
        }
        System.out.println(finishedNumber);

    }

    public static int reverse(int x) {
        int neg = x;
        int reversedNumber = 0;
        while(x > 0) {
            int lastDigit = x % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            x /= 10;
        }
        if(neg < 0) {
            return reversedNumber * -1;
        }else{
            return reversedNumber;
        }
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        int numberOfDigits = 0;
        if(number == 0) {
            numberOfDigits = 1;
        }
        while(number > 0) {
            numberOfDigits ++;
            number /= 10;
        }
        return numberOfDigits;
    }


}
