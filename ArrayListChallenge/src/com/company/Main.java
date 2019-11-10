package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private  static MobilePhones billsPhone = new MobilePhones("4 564 564 5646");

    public static void main(String[] args) {

       boolean quit = false;
       startPhone();
       printActions();
       while(!quit) {
           System.out.println("Enter your choice: ");
           int choice = scanner.nextInt();
           scanner.nextLine();

           switch (choice) {
               case 0:
                   printActions();
                   break;
               case 1:
                   billsPhone.printContacts();
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
                   System.out.println("Shutting Down");
                   quit = true;
                   break;
           }
       }


    }



    private static void startPhone() {
        System.out.println("Starting Phone....");
    }

    private static void printActions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print Start Menu.");
        System.out.println("\t 1 - To print Contact List.");
        System.out.println("\t 2 - To add a person to Contacts.");
        System.out.println("\t 3 - To modify a person in Contacts.");
        System.out.println("\t 4 - To remove a person from Contacts.");
        System.out.println("\t 5 - To search for a person in Contacts.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void setItem() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (billsPhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone: " + phone);

        }else{
            System.out.println("Cannot add contact.");
        }
    }

    private static void modifyItem() {
        System.out.println("Enter name to be changed.");
        String name = scanner.nextLine();
        Contact existingContact = billsPhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter corrected version of name: ");
        String changed = scanner.nextLine();

        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(changed, newNumber);
        if (billsPhone.updateContact(existingContact,newContact)) {
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error");
        }

    }

    private static void removeItem() {
        System.out.println("Enter name to be removed.");
        String name = scanner.nextLine();
        Contact existingContact = billsPhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(billsPhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }

    private static void searchForItem() {
        System.out.println("What are you searching for?");
        String name = scanner.nextLine();
        Contact existingContact = billsPhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getNumber());

    }
}
