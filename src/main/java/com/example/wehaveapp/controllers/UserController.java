package com.example.wehaveapp.controllers;

import com.example.wehaveapp.models.User;
import com.example.wehaveapp.repositories.UserRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import org.w3c.dom.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    public TextField emailField;
    public TextField usernameField;
    public PasswordField passwordField;
    public Button registerButton;

    @FXML
    private AnchorPane root;

    private Parent sceneRoot;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sceneRoot = root.getScene().getRoot();
    }


    @FXML
    void registerUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/create-account.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Node sceneRoot = root;
        while (sceneRoot instanceof Parent) {
            Parent parent = (Parent) sceneRoot;
            if (parent.getStylesheets() != null) {
                scene.getStylesheets().addAll(parent.getStylesheets());
            }
            sceneRoot = parent.getChildrenUnmodifiable().get(0);
        }
        window.setScene(scene);
        window.show();
    }






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

