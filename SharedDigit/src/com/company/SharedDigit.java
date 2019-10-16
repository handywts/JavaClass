package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if(x < 10 || x > 99) {
            return false;
        }
        if(y < 10 || y > 99) {
            return false;
        }

        int xFirstDigit = 0;
        int xSecondDigit = 0;
        int yFirstDigit = 0;
        int ySecondDigit = 0;

        while (x > 10) {
            xSecondDigit = x % 10;
            x /= 10;
            xFirstDigit = x;
        }
        while (y > 10) {
            ySecondDigit = y % 10;
            y /= 10;
            yFirstDigit = y;
        }

        if(xFirstDigit == yFirstDigit || xFirstDigit == ySecondDigit) {
            return true;
        }else if (xSecondDigit == yFirstDigit || xSecondDigit == ySecondDigit) {
            return true;
        }else{
            return false;
        }

    }

}
