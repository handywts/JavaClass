package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private TextField field;

    @FXML
    public void switchText() {
        label.setText(field.getText());
    }

}
