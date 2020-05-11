package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

public class Controller {

    @FXML
    private FlowPane fruits;
    @FXML
    private ChoiceBox fruitBox;
    @FXML
    private FlowPane veggies;
    @FXML
    private ListView veggieList;
    @FXML
    private Label choice;
    private ObservableList<Vegetable> vegetables = FXCollections.observableArrayList();

    public void initialize() {
        fruits.setVisible(true);
        veggies.setVisible(false);

        vegetables.add(new Vegetable("Brocolli"));
        vegetables.add(new Vegetable("Califlower"));

        veggieList.setItems(vegetables);

        veggieList.setCellFactory(param -> new ListCell<Vegetable>() {
            @Override
            protected void updateItem(Vegetable v, boolean empty) {
                super.updateItem(v, empty);
                if (empty || v == null || v.getName() == null) {
                    setText("");
                }else {
                    setText(v.getName());
                }
            }
        });

    }

    public void handleSwitch() {
        fruits.setVisible(!fruits.isVisible());
        veggies.setVisible(!veggies.isVisible());
    }

    public void handleChoice() {
        if (fruits.isVisible()) {
            String temp = (String) fruitBox.getValue();
            choice.setText(temp);
        }else{
            vegetables = veggieList.getSelectionModel().getSelectedItems();
            Vegetable v = vegetables.get(0);
            choice.setText(v.getName());
        }


    }

    public void handleOkButton() {
        if (choice.getText().equals("Your choice will show here.") || choice.getText().equals("Please choose a fruit.")) {
            choice.setText("Please choose a fruit.");
        }else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure " + choice.getText() + " is correct?");
            alert.showAndWait();

            ImageView img = new ImageView();
            img.setFitWidth(100.0);
            img.setPreserveRatio(true);

            if (alert.getResult() == ButtonType.OK && choice.getText().equals("Apple")) {
                String path = "picture/apple.jpg";
                Image image = new Image(getClass().getResourceAsStream(path));
                img.setImage(image);
                choice.setGraphic(img);

            }else if(choice.getText().equals("Apricot")) {
                Image image2 = new Image(getClass().getResourceAsStream("picture/apricot.jpg"));
                img.setImage(image2);
                choice.setGraphic(img);

            }else if(choice.getText().equals("Brocolli")) {
                Image image2 = new Image(getClass().getResourceAsStream("picture/apricot.jpg"));
                img.setImage(image2);
                choice.setGraphic(img);
            }else{
                choice.setGraphic(null);
            }

        }
    }

    

}
