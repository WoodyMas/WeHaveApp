package com.example.wehaveapp.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Button registerButton;

    @FXML
    private void userRegistration(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/static/fxml/create-account.fxml"));
        loader.setController(new UserController());
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.setScene(scene);
    }
}

