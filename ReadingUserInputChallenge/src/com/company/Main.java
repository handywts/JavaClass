package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        while(counter <= 10) {
            System.out.println("Enter Number #" +counter + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                number = number + scanner.nextInt();

                counter++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println(number);
        scanner.close();
    }
}
