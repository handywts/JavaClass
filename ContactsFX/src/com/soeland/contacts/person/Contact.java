package com.soeland.contacts.person;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Contact {

//Fields
    private static Contact instance = new Contact();
    private String filename = "Contacts.txt";


    private ObservableList<Person> persons;



//Getters and Setters
    public static Contact getInstance() {
        return instance;
    }
    public void setInstance(Contact instance) {
        Contact.instance = instance;
    }

    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ObservableList<Person> getPersons() {
        return persons;
    }
    public void setPersons(ObservableList<Person> persons) {
        this.persons = persons;
    }


//Methods
    public void addPerson(Person person) {
        persons.add(person);
    }
    public void loadContacts() throws IOException {
        persons = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        String input;

        try {
            while((input = br.readLine()) != null) {
                String[] contactInfo = input.split("\t");

                String firstName = contactInfo[0];
                String lastName = contactInfo[1];
                String phoneNumber = contactInfo[2];
                String note = contactInfo[3];

                Person person = new Person(firstName, lastName, phoneNumber, note);
                persons.add(person);
            }
        }finally {
            if (br != null) {
                br.close();
            }
        }
    }

    public void storeContacts() throws IOException {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try {
            Iterator<Person> iter = persons.iterator();
            while (iter.hasNext()) {
                Person person = iter.next();
                bw.write(String.format("%s\t%s\t%s\t%s",
                        person.getFirstName(),
                        person.getLastName(),
                        person.getPhoneNumber(),
                        person.getPrivateNote()));
                bw.newLine();
            }
        }finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    public void deleteContact(Person person) {
        persons.remove(person);
    }

}
