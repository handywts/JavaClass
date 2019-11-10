package com.company;

//To be used with the Contacts class

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);


    private Contacts contacts;


//    public MobilePhone(String name, String number) {
//        contacts.setContact(name, number);
//    }


    public void startMenu() {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContacts();
                    break;
                case 2:
                    setItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print Start Menu.");
        System.out.println("\t 1 - To print Contact List.");
        System.out.println("\t 2 - To add a person to Contacts.");
        System.out.println("\t 3 - To modify a person in Contacts.");
        System.out.println("\t 4 - To remove a person from Contacts.");
        System.out.println("\t 5 - To search for a person in Contacts.");
        System.out.println("\t 6 - To quit the application.");
    }

    private void modifyItem() {
        System.out.println("1 to change the name of the contact\n2 to change the number of the contact");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("What is the contact name you want to change?");
            String original = scanner.nextLine();
            System.out.println("What do you want to change the name to?");
            String changed = scanner.nextLine();
            contacts.modifyName(original,changed);
        }
        if (choice == 2) {
            System.out.println("Who's number do you want to change?");
            String name = scanner.nextLine();
            System.out.println("What do you want to change the number to?");
            String number = scanner.nextLine();
            contacts.modifyNumber(name,number);
        }
        System.out.println("The number you entered is not a choice.");
    }

    private void setItem() {
        System.out.println("Enter the name of the contact.");
        String name = scanner.nextLine();
        System.out.println("Enter the number of the contact.");
        String number = scanner.nextLine();
        contacts.setContact(name, number);
    }

    private void removeItem() {
        System.out.println("Enter the name of the contact to be removed.");
        String name = scanner.nextLine();
        contacts.removeContact(name);
    }

    private void searchForItem() {
        System.out.println("Enter the name or number that you want to search for.");
        String item = scanner.nextLine();
        contacts.findContact(item);
    }

}
