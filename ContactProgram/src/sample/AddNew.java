package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.File;


public class AddNew  {

    @FXML
    private TextField firstName;
    @FXML
    private TextField middleName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField street1;
    @FXML
    private TextField street2;
    @FXML
    private TextField city;
    @FXML
    private TextField state;
    @FXML
    private TextField zip;
    @FXML
    private TextField picturePath;
    @FXML
    private TextField note;
    @FXML
    private ComboBox contactChoice;


//Constructors and Setters/Getters
    public TextField getFirstName() {
        return firstName;
    }
    public void setFirstName(TextField firstName) {
        this.firstName = firstName;
    }
    public TextField getMiddleName() {
        return middleName;
    }
    public void setMiddleName(TextField middleName) {
        this.middleName = middleName;
    }
    public TextField getLastName() {
        return lastName;
    }
    public void setLastName(TextField lastName) {
        this.lastName = lastName;
    }
    public TextField getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(TextField phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public TextField getStreet1() {
        return street1;
    }
    public void setStreet1(TextField street1) {
        this.street1 = street1;
    }
    public TextField getStreet2() {
        return street2;
    }
    public void setStreet2(TextField street2) {
        this.street2 = street2;
    }
    public TextField getCity() {
        return city;
    }
    public void setCity(TextField city) {
        this.city = city;
    }
    public TextField getState() {
        return state;
    }
    public void setState(TextField state) {
        this.state = state;
    }
    public TextField getZip() {
        return zip;
    }
    public void setZip(TextField zip) {
        this.zip = zip;
    }
    public TextField getPicturePath() {
        return picturePath;
    }
    public void setPicturePath(TextField picturePath) {
        this.picturePath = picturePath;
    }
    public TextField getNote() {
        return note;
    }
    public void setNote(TextField note) {
        this.note = note;
    }
    public ComboBox getContactChoice() {
        return contactChoice;
    }
    public void setContactChoice(ComboBox contactChoice) {
        this.contactChoice = contactChoice;
    }


//Methods

    @FXML
    public void fileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Picture");
        //FileChooser.ExtensionFilter
        File file = fileChooser.showOpenDialog(new Stage());
        picturePath.setText(file.toString());
    }

    public Contact newContact() {
        String fn = firstName.getText().trim();
        String mn = middleName.getText().trim();
        String ln = lastName.getText().trim();
        String pn = phoneNumber.getText().trim();
        String s1 = street1.getText().trim();
        String s2 = street2.getText().trim();
        String town = city.getText().trim();
        String st = state.getText().trim();
        String zc = zip.getText().trim();
        String pp = picturePath.getText().trim();
        String notes = note.getText().trim();

        Contact c = new Contact(fn,mn,ln,pn,s1,s2,town,st,zc,pp,notes);
        AllData.getInstance().setElement(new Contact(fn,mn,ln,pn,s1,s2,town,st,zc,pp,notes));

        return c;
    }

    public Contact editContact(Contact index) {
        String fn = firstName.getText().trim();
        String mn = middleName.getText().trim();
        String ln = lastName.getText().trim();
        String pn = phoneNumber.getText().trim();
        String s1 = street1.getText().trim();
        String s2 = street2.getText().trim();
        String town = city.getText().trim();
        String st = state.getText().trim();
        String zc = zip.getText().trim();
        String pp = picturePath.getText().trim();
        String notes = note.getText().trim();

        AllData.getInstance().removeData(index);
        Contact c = new Contact(fn,mn,ln,pn,s1,s2,town,st,zc,pp,notes);
        AllData.getInstance().setElement(new Contact(fn,mn,ln,pn,s1,s2,town,st,zc,pp,notes));

        return c;
    }


}

//Create interface to load certain constructors of Contact.
//Fine tune fileextension filter on upload button