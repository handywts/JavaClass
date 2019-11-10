package com.company;

//To be used with the MobilePhone Class

import java.util.ArrayList;

public class Contacts {

//Fields
    private ArrayList<String> nameList = new ArrayList<String>();
    private ArrayList<String> numberList = new ArrayList<String>();



//Getters and Setters
    private ArrayList<String> getnameList() {
        return nameList;
    }
    private void setNameList (String name) {
        nameList.add(name);
    }

    private ArrayList<String> getNumberList() {
        return numberList;
    }
    private void setNumberList(String number) {
        numberList.add(number);
    }

    private void setContactList(String name, String number) {
        setNameList(name);
        setNumberList(number);
    }
    private String getContactList(int nameIndex, int numberIndex) {
        return (nameList.get(nameIndex) + numberList.get(numberIndex));
    }



//Methods
    private int findItem(String item) {
        return nameList.indexOf(item);
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i < nameList.size(); i++){
            System.out.println((i+1) + ": " + getContactList(i,i));
        }
    }

    public void modifyName(String original, String change) {
        int position = findItem(original);
        nameList.set(position,change);
        System.out.println("Contact " + original + " has been updated to " + change);
    }
    public void modifyNumber(String name, String number) {
        int position = findItem(name);
        numberList.set(position, number);
        System.out.println(name + "'s contact has been updated with " + number);
    }

    public void removeContact(String name) {
        int position = findItem(name);
        nameList.remove(position);
        numberList.remove(position);
    }

    public void setContact(String name, String number) {
        setContactList(name, number);
        System.out.println("A new contact was created:\n" +
                "Name: " + name +"\n" +
                "Number: " + number);
    }

    public void findContact(String information) {
        int position = findItem(information);
        if (nameList.contains(information)) {
            System.out.println(nameList.get(position) + " was found in your Contact List.\n" +
                    "With the following number " + numberList.get(position));
        }else if (numberList.contains(information)){
            System.out.println(numberList.get(position) + " was not found in your Contact List.\n" +
                    "With the following name" + nameList.get(position));
        }

    }
}
