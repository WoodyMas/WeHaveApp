package com.example.wehaveapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private WebView webView;

    @FXML
    private WebEngine webEngine;

    @FXML
    private Label welcomeText;

    @FXML
    private Button registerButton;

    @FXML
    private Label newText;

        @FXML
        private void handleButtonAction(ActionEvent event) throws IOException {
            if (event.getSource() == registerButton) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/static/fxml/create-account.fxml"));
                Parent root = loader.load();
                Scene scene = registerButton.getScene();
                scene.setRoot(root);
            }
        }



}