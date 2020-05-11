package sample;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;


public class Controller {

    @FXML
    private ListView<Contact> contactList;
    @FXML
    private MenuBar fileMenu;
    @FXML
    private ImageView contactImageView;
    @FXML
    private BorderPane mainPane;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label middleNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label phoneNumberLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label stateLabel;
    @FXML
    private Label zipCodeLabel;
    @FXML
    private Label notesLabel;

    @FXML
    private ContextMenu listVeiwMenu;



    //private ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void initialize() {

//        Contact item1 = new Contact("dan", "eric", "soelnad", "123234", "high drive", "234", "high", "AK", "939393", "pictures/spongebob.png", "hihih");
//        Contact item2 = new Contact("fran", "deric", "sokjslkdfelnad", "123234", "high drive", "234", "high", "AK", "939393", "pictures/spongebob.png", "hihih");
//        Contact item3 = new Contact("stan", "leric", "soelnakjsfd", "123234", "high drive", "234", "high", "AK", "939393", "pictures/spongebob.png", "hihih");
//
//        contacts.add(item1);
//        contacts.add(item2);
//        contacts.add(item3);
//
//        AllData.getInstance().setContacts(contacts);

        SortedList<Contact> sortedList = new SortedList<Contact>(AllData.getInstance().getContacts());
        sortedList.setComparator(new Comparator<Contact>() {
            @Override
            public int compare(Contact contact, Contact t1) {
                return contact.getFirstName().compareToIgnoreCase(t1.getFirstName());
            }
        });

        contactList.setItems(sortedList);

        //contactList.setCellFactory(param -> new ListCell<Contact>() {            //Might have to move this code, to update list when a new contact is added
        contactList.setCellFactory(new Callback<ListView<Contact>, ListCell<Contact>>() {
            @Override
            public ListCell<Contact> call(ListView<Contact> contactListView) {
                ListCell<Contact> cell = new ListCell<Contact>() {

                    @Override
                    protected void updateItem(Contact c, boolean empty) {
                        super.updateItem(c, empty);
                        if (empty || c == null || c.getFirstName() == null) {
                            setText("");
                        } else {
                            setText(c.getFirstName());
                        }
                    }
                };

                cell.emptyProperty().addListener(
                        (obs, wasEmpty, isNowEmpty) -> {
                            if(isNowEmpty) {
                                cell.setContextMenu(null);
                            }else{
                                cell.setContextMenu(listVeiwMenu);
                            }
                        }
                );
                return cell;
            }

        });



        listVeiwMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Contact item = contactList.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });

        listVeiwMenu.getItems().addAll(deleteMenuItem);

    }

    public void infoPopulate() {
        try {
            ObservableList<Contact> singleContact;
            singleContact = contactList.getSelectionModel().getSelectedItems();
            Contact c = singleContact.get(0);
            firstNameLabel.setText(c.getFirstName());
            lastNameLabel.setText(c.getLastName());
            middleNameLabel.setText(c.getMiddleName());
            phoneNumberLabel.setText(c.getPhoneNumber());
            addressLabel.setText(c.getAddress());
            cityLabel.setText(c.getCity());
            stateLabel.setText(c.getState());
            zipCodeLabel.setText(c.getZipCode());
            notesLabel.setText(c.getNote());


            contactImageView.setImage(contactImage(c));
            contactImageView.setFitHeight(100.0);
            contactImageView.setPreserveRatio(true);
        }catch (Exception e){
            System.out.println("Waiting for something better.");
        }
    }

    public void rightClick(KeyEvent keyEvent) {
        Contact c = contactList.getSelectionModel().getSelectedItem();
        if(c != null) {
            if(keyEvent.getCode().equals(KeyCode.DELETE)) {
                deleteItem(c);
            }
        }
    }

    public Image contactImage(Contact c) {
        Image img = null;
        try {
            FileInputStream file = new FileInputStream(c.getPicturePath());
            img = new Image(file);

        }catch (Exception e) {
            System.out.println("picture pather is messed up");
        }
        return img;
    }

    @FXML
    public void addNewContact() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPane.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        dialog.setHeaderText("Enter information in spaces provided to create a new contact");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("addNew.fxml"));
        try {
            dialog.getDialogPane().setContent(loader.load());
        }
        catch (IOException e) {
            System.out.println("Can't load this thing");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            AddNew controller = loader.getController();
            Contact newContact = controller.newContact();
            contactList.getSelectionModel().select(newContact);
        }
    }


    public void editContact() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPane.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        dialog.setHeaderText("Edit information in spaces provided to change a contact");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("editContact.fxml"));
        try {
            dialog.getDialogPane().setContent(loader.load());
        }
        catch (IOException e) {
            System.out.println("Can't load this thing");
            e.printStackTrace();
            return;
        }

        AddNew controller = loader.getController();
        Contact c = contactList.getSelectionModel().getSelectedItem();
        controller.getFirstName().setText(c.getFirstName());
        controller.getMiddleName().setText(c.getMiddleName());
        controller.getLastName().setText(c.getLastName());
        controller.getPhoneNumber().setText(c.getPhoneNumber());
        controller.getStreet1().setText(c.getStreet1());
        controller.getStreet2().setText(c.getStreet2());
        controller.getCity().setText(c.getCity());
        controller.getState().setText(c.getState());
        controller.getZip().setText(c.getZipCode());
        controller.getPicturePath().setText(c.getPicturePath());
        controller.getNote().setText(c.getNote());


        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            Contact newContact = controller.editContact(c);
            contactList.getSelectionModel().select(newContact);
        }
    }

    public void deleteItem(Contact item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Contact");
        alert.setHeaderText("Delete " + item.getFirstName());
        alert.setContentText("Are you sure you want to delete " + item.getFirstName() + "\nThis can't be undone.");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && result.get() == ButtonType.OK) {
            AllData.getInstance().removeData(item);
        }
    }

    public void exiting() {
        Platform.exit();
    }

}

//Create try/catch to default to a placeholder picture if picture path isn't real.