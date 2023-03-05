package com.example.wehaveapp.controllers;
import com.example.wehaveapp.WeHaveApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    private WeHaveApplication app;

    @FXML
    private Label welcomeMessageLabel;

    @FXML
    private Button logoutButton;

    @FXML
    private void initialize() {
        // initialize the controller
    }

    @FXML
    private void handleLogoutButtonAction(ActionEvent event) {
        // handle logout button action
    }

    public void setApp(WeHaveApplication app) {
        this.app = app;
    }
}

