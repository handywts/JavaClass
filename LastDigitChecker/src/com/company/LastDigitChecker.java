package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if(x < 10 || x > 1000) {
            return false;
        }
        if(y < 10 || y > 1000) {
            return false;
        }
        if(z < 10 || z > 1000) {
            return false;
        }

        int xLast = x % 10;
        int yLast = y % 10;
        int zLast = z % 10;

        if(xLast == yLast || xLast == zLast || yLast == zLast) {
            return true;
        }else {
            return false;
        }

    }

    public static boolean isValid (int number) {
        if(number < 10 || number > 1000) {
            return false;
        }else {
            return true;
        }
    }

}
