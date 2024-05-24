package org.example.workshopjavafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        Parent parent = loader.load();
        Scene mainScene = new Scene(parent);
        stage.setTitle("Sample JavaFX application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}