package com.soeland.contacts;

import com.soeland.contacts.edit.EditContactController;
import com.soeland.contacts.person.Contact;
import com.soeland.contacts.person.Person;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private TableView<Person> contactTableView;





//Methods
    public void initialize() {
//        contactTableView = new TableView<Person>();
//        contactTableView.setItems(Contact.getInstance().getPersons());
//
//        TableColumn<Person,String> firstNameCol = new TableColumn<>("First Name");
//        //firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
//        TableColumn<Person,String> lastNameCol = new TableColumn<>("Last Name");
//        //lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
//        TableColumn<Person,String> phoneNumberCol = new TableColumn<>("Phone Number");
//        //phoneNumberCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
//        TableColumn<Person,String> privateNoteCol = new TableColumn<>("Private Note");
//        //privateNoteCol.setCellValueFactory(new PropertyValueFactory<>("privatenote"));
//
//        contactTableView.getColumns().addAll(firstNameCol,lastNameCol,phoneNumberCol,privateNoteCol);

        //SortedList<Person> sortedList = new SortedList<Person>(Contact.getInstance().getPersons());

        contactTableView.setItems(Contact.getInstance().getPersons());
        //contactTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //contactTableView.getSelectionModel().selectFirst();




    }

    @FXML
    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("newContact.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            NewContactController contactController = fxmlLoader.getController();
            Person newPerson = contactController.processResults();
            //didn't copy one line of code here, do so if something doesn't work right.
        }
    }

    @FXML
    public void showEditItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Edit Existing Contact");
        FXMLLoader fxmlLoaderEdit = new FXMLLoader();
        fxmlLoaderEdit.setLocation(getClass().getResource("../contacts/edit/editContact.fxml"));
        try{
            dialog.getDialogPane().setContent(fxmlLoaderEdit.load());
        }catch (IOException e) {
            System.out.println("Couldn't Load Edit Dialog");
            e.printStackTrace();
        }
        //will load selected contact using a drop down/search of existing contacts
        //allow changes to be made
        //save changes, overwriting the previous information

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            EditContactController editContactController = fxmlLoaderEdit.getController();
            Person newPerson = editContactController.processResults();     //need to research best way of avoiding extra code here.
        }
    }

    @FXML
    public void showDeleteDialog() {

    }

}
