package com.example.wehaveapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WeHaveApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Load the login screen FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/static/fxml/home-view.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/static/css/fxml-css/app.css").toExternalForm());

        // Set up the primary stage with the login screen
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("WeHaveApp");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}