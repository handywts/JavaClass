package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int min = 0;
        int max = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);



        while(true) {
            System.out.println("Enter a number: ");
            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int number = scanner.nextInt();


                if(number < min) {
                    min = number;
                }else if(number > max) {

                    if(first && min == 0) {
                        min = number;
                        first = false;
                    }
                    max = number;
                }


            }else {
                System.out.println("Min Number: " + min + " and Max Number: " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

    }
}
