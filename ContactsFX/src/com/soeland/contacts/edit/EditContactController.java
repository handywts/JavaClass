package com.soeland.contacts.edit;

import com.soeland.contacts.person.Contact;
import com.soeland.contacts.person.Person;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class EditContactController {

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField privateNoteField;
    @FXML
    private ComboBox<Person> editChoice;

    public void giveChoice() {
        editChoice.setItems();
    }

    public Person processResults() {
        String firstName = firstNameField.getText().trim();  //added trim to see what that does to the info.
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String privateNote = privateNoteField.getText();

        Person newPerson = new Person(firstName, lastName, phoneNumber, privateNote);
        Contact.getInstance().addPerson(newPerson);  //Trying something new here
        return newPerson;

    }

}
