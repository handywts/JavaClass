package sample;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import java.io.*;
import java.util.Optional;

public class Controller {

    @FXML
    private BorderPane mainPane;
    @FXML
    private ListView<Contact> contactList;
    @FXML
    private MenuBar fileMenu;
    @FXML
    private ImageView contactImageView;
    private ContextMenu listViewMenu;

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


    //private ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void initialize() {

        try {
            AllData.getInstance().loadData();
        }catch (IOException e) {
            e.printStackTrace();
        }

        //Contact item1 = new Contact("dan", "eric", "soelnad", "123234", "high drive", "234", "high", "AK", "939393", "pictures/person-placeholder.jpg", "hihih");
        //Contact item2 = new Contact("fran", "deric", "sokjslkdfelnad", "123234", "high drive", "234", "high", "AK", "939393", "pictures/person-placeholder.jpg", "hihih");
        //Contact item3 = new Contact("stan", "leric", "soelnakjsfd", "123234", "high drive", "234", "high", "AK", "939393", "pictures/person-placeholder.jpg", "hihih");

        //contacts.add(item1);
        //contacts.add(item2);
        //contacts.add(item3);

        //AllData.getInstance().setContacts(contacts);


        listViewMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Contact item = contactList.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });

        contactList.setItems(AllData.getInstance().getContacts());

        //contactList.setCellFactory(param -> new ListCell<Contact>(){
        contactList.setCellFactory(new Callback<ListView<Contact>, ListCell<Contact>>() {
            @Override
            public ListCell<Contact> call(ListView<Contact> contactListView) {
                ListCell<Contact> cell = new ListCell<Contact>() {

                    @Override
                    protected void updateItem(Contact c, boolean empty) {
                        super.updateItem(c, empty);
                        if(empty || c == null || c.getFirstName() == null) {
                            setText("");
                        }else{
                            setText(c.getName());
                        }
                    }

                };

                cell.emptyProperty().addListener(
                        (obs, wasEmpty, isNowEmpty) -> {
                            if (isNowEmpty) {
                                cell.setContextMenu(null);
                            } else {
                                cell.setContextMenu(listViewMenu);
                            }
                        }
                );

                return cell;
            }
        });

        listViewMenu.getItems().addAll(deleteMenuItem);

        //saveData();

    }

    public void populateInfo() {
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
    }

    public Image contactImage(Contact c) {
        String path = c.getPicturePath();
        Image img = new Image(getClass().getResourceAsStream(path));
        return img;
    }

    @FXML
    public void addNewContact() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPane.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        dialog.setHeaderText("Enter information in the spaces provided to create a new contact");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("addNew.fxml"));
        try{
            dialog.getDialogPane().setContent(loader.load());
        }catch (IOException e) {
            e.printStackTrace();
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

    @FXML
    public void editContact() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPane.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        dialog.setHeaderText("Edit information in spaces provided to change a contact");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AddNew.fxml"));
        try{
            dialog.getDialogPane().setContent(loader.load());
        }catch (IOException e) {
            e.printStackTrace();
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

    @FXML
    public void quitProgram() {
        Platform.exit();
    }

    public void deleteItem(Contact item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Contact");
        alert.setHeaderText("Delete " + item.getFirstName() + "?");
        alert.setContentText("Are you sure you want to delete " + item.getFirstName() + "\n This can't be undone!");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            AllData.getInstance().removeData(item);
        }
    }

}
