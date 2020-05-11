package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private FlowPane fruits;
    @FXML
    private FlowPane veggies;
    @FXML
    private Label choice;
    @FXML
    private ChoiceBox fruitBox;
    @FXML
    private ListView veggieList;
    @FXML
    private ImageView imageSpot;
    @FXML
    private TextField addition;

    private ObservableList<Vegetables> vegetables = FXCollections.observableArrayList();

    public void initialize() {
        fruits.setVisible(true);
        veggies.setVisible(false);

        vegetables.add(new Vegetables("Brocolli"));
        vegetables.add(new Vegetables("Califlower"));

        veggieList.setItems(vegetables);

        veggieList.setCellFactory(param -> new ListCell<Vegetables>() {           // Add ability to add to list in real time.
            @Override
            protected void updateItem(Vegetables v, boolean empty) {
                super.updateItem(v, empty);
                if(empty || v == null || v.getName() == null) {
                    setText("");
                }else{
                    setText(v.getName());
                }
            }
        });
    }

    @FXML
    public void handleChoice() {
        String plant = "";
        if (fruits.isVisible()) {
            plant = (String) fruitBox.getValue();
            choice.setText(plant);
        }else{
            vegetables = veggieList.getSelectionModel().getSelectedItems();

            Vegetables v = vegetables.get(0);
            //
                choice.setText(v.getName());
            //}






//            veggieList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
//                @Override
//                public void changed(ObservableValue observableValue, Object o, Object t1) {
//                    String name =
//                    choice.setText(name);
//                }
//            });



//            veggieList.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//                @Override
//                public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                    int thing = (int) t1;
//                    choice.setText(veggieList.getSelectionModel().getSelectedItem(thing));
//
//                }
//            });



        }

    }

    @FXML
    public void handleSwitchButtonAction() {
        fruits.setVisible(!fruits.isVisible());
        veggies.setVisible(!veggies.isVisible());
    }

    @FXML
    public void handleOkButton() {
        if (choice.getText().equals("Your choice will show here.") || choice.getText().equals("Please choose a fruit")) {
            choice.setText("Please choose a fruit");
        }else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure " + choice.getText() + " is what you want?", ButtonType.YES, ButtonType.NO);
            alert.showAndWait();
            if (alert.getResult() == ButtonType.YES && choice.getText().equals("Apple")) {
                String path = "file:pics/apple.jpg";
                Image image = new Image(getClass().getResourceAsStream("pics/apple.jpg"));
                ImageView img = new ImageView(image);
                img.setFitWidth(100.0);
                img.setPreserveRatio(true);
                choice.setGraphic(img);
            }else if(alert.getResult()==ButtonType.YES && choice.getText().equals("Brocolli")) {
                Image image = new Image(getClass().getResourceAsStream("pics/broc.jpg"));
                ImageView img = new ImageView(image);
                img.setFitWidth(100.0);
                img.setPreserveRatio(true);
                choice.setGraphic(img);
            }else {
                choice.setText("Picture could not be shown, please pick again.");
                Vegetables stuff = vegetables.get(0);
                System.out.println(stuff.getName());
            }
        }
    }

    public void addThing() {
        String thingToAdd = addition.getText();
        vegetables.add(new Vegetables(thingToAdd));
    }
}
