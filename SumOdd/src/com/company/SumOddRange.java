package com.company;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }

        if(number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd (int start, int end) {
        int sumNumber = 0;
        if(start > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumNumber = sumNumber + i;
                }
            }
            return sumNumber;
        } else {
            return -1;
        }
    }

}
