package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Contacts");
        primaryStage.setScene(new Scene(root, 900, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        try {
            AllData.getInstance().loadData();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stop() throws Exception {
        try {

           AllData.getInstance().saveData();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

//Look into error trapping for ListView clicking outside existing contacts.
//Read Write to file for long term storage



