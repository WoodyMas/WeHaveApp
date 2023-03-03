package com.example.wehaveapp.controllers;

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
import java.net.URL;

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
    private void handleButtonAction(ActionEvent event) {
        // Load the HTML file
        try {
            URL url = getClass().getResource("/static/html/webview.html");
//            webView.getEngine().load(url.toString());
            openWebview();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openWebview() {
        WebView webView = new WebView();
        webView.getEngine().load(getClass().getResource("/static/html/webview.html").toString());

        Stage stage = new Stage();
        stage.setScene(new Scene(webView));
        stage.show();
    }


//    @FXML
//    protected void onHelloButtonClick() {
//        String googleUrl = "https://www.google.com";
//        welcomeText.setText("Let's get started");
//        loadExampleURL(googleUrl);
//    }


//    @FXML
//    protected void initialize() {
//
//        File file = new File("/static/html/webview.html");
//        webEngine = webView.getEngine();
//        webEngine.load(file.toURI().toString());
//
//    }

//    public void onHelloButtonClick(ActionEvent event) {
//        // Create a new WebView and load the HTML file
//        WebView webView = new WebView();
//        webView.getEngine().load(getClass().getResource("/static/html/webview.html").toExternalForm());
//
//        // Create a new Stage to display the WebView
//        Stage stage = new Stage();
//        stage.setScene(new Scene(webView, 800, 600));
//        stage.show();
//    }


//    @FXML
//        public void initialize() {
//            webView.getEngine().load(getClass().getResource("/static/html/webview.html").toExternalForm());
//        }




//    @FXML
//    public void loadExampleURL(String url) {
//
//        webView.getEngine().load(url);
//    }

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