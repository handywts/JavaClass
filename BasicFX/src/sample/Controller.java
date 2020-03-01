package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class Controller {

    @FXML
    private BorderPane mainPane;

    @FXML
    private FlowPane fruits;

    @FXML
    private FlowPane veggies;

    @FXML
    private Button switchButton;

    @FXML
    private Label choice;

    @FXML
    private ChoiceBox fruitBox;

    @FXML
    private Button okButton;

    public void initialize() {
        veggies.setVisible(false);
    }

    @FXML
    public void handleChoice() {
        String plant = (String) fruitBox.getValue();
        choice.setText(plant);
    }

    @FXML
    public void handleSwitchButtonAction() {
        fruits.setVisible(!fruits.isVisible());
        veggies.setVisible(!veggies.isVisible());
    }

    @FXML
    public void handleOkButton(ActionEvent e) {
        if (choice == null) {
            choice.setText("Please chose a fruit");
        }else{

        }
    }
}
