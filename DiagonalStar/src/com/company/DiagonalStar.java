package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {


        for(int row = 1; row <= number; row++) {
            for(int column = 1; column <= number; column++) {
                if(row == 1 || row == number) {
                    System.out.print("*");
                }
                if(column == 1 || column == number) {
                    System.out.print("*");
                }
                if(row == column) {
                    System.out.print("*");
                }
                if(column == (row))
            }
        }
    }

}
