package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int common = 0;
        for(int i = 1; i < first+1; i++) {
            if(first%i == 0 && second%i == 0) {
                common = i;
            }
        }
        return common;
    }

}
