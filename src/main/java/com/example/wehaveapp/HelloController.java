package com.example.wehaveapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;


import java.io.File;
import java.io.IOException;

public class HelloController {
    @FXML
    private WebView webView;

    @FXML
    private WebEngine webEngine;

    @FXML
    private Label welcomeText;

    @FXML
    private Label newText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Let's get started");
        loadExampleURL();
    }


    @FXML
    protected void initialize() {
//        newText.setText(("See this test"));
        WebEngine webEngine1 = webView.getEngine();
        File file = new File("/static/html/webview.html");
        webEngine1.load(file.toURI().toString());

    }


    @FXML
    private void loadExampleURL() {
        webView.getEngine().load("https://www.google.com");
    }

//    private void goToNewView(ActionEvent event) throws IOException {
//        Parent newViewParent = FXMLLoader.load(getClass().getResource("NewView.fxml"));
//        Scene newViewScene = new Scene(newViewParent);
//        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        currentStage.setScene(newViewScene);
//        currentStage.show();
//    }
//
//    @FXML
//    private void goToNewView() throws IOException {
//        Parent newView = FXMLLoader.load(getClass().getResource("NewView.fxml"));
//        Scene scene = new Scene(newView);
//        Stage stage = (Stage) button.getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
//    }
}