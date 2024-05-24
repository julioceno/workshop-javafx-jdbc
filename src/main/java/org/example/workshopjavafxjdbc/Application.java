package org.example.workshopjavafxjdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private static Scene mainScene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        ScrollPane scrollPane = loader.load();

        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        mainScene = new Scene(scrollPane);
        stage.setScene(mainScene);
        stage.setTitle("Sample JavaFX application");
        stage.show();
    }

    public static Scene getMainScene() {
        return mainScene;
    }

    public static void main(String[] args) {
        launch();
    }
}