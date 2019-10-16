package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine();  //allows user to add more information


            System.out.println("Name: ");
            String name = scanner.nextLine();


            int age = 2018 - year;
            if(age >= 0 && age <=100) {
                System.out.println("Your name is " + name);
                System.out.println("Age " + age);
            }else {
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Invalid input - put numbers");
        }

        scanner.close();

    }
}
