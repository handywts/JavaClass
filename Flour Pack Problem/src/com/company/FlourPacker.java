package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigKilo = 5*bigCount;

        int totalWeight = 0;

        if(bigKilo == goal) {
            return true;
        } else {
            if(bigKilo < goal) {
                int difference = goal - bigKilo;
                if(difference <= smallCount) {
                    return true;
                }else {
                    return false;
                }
            }else {
                int newBig = bigKilo - 5;
                int difference = goal - newBig;
                if(difference <= smallCount) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

}
