package com.soeland.contacts.person;

public class Person {

//Fields
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String privateNote;


//Constructors


    public Person(String firstName, String lastName, String phoneNumber, String privateNote) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.privateNote = privateNote;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPrivateNote() {
        return privateNote;
    }
    public void setPrivateNote(String privateNote) {
        this.privateNote = privateNote;
    }


//Methods
//    public String firstNameProperty() {
//        if (firstName == null) {
//            this.firstName = "first name";
//        }
//        return firstName;
//    }
//
//    public String lastNameProperty() {
//        if (lastName == null) {
//            this.lastName = "last name";
//        }
//        return lastName;
//    }

//    @Override
//    public String toString() {
//        return firstName + " " + lastName;
//    }

}
