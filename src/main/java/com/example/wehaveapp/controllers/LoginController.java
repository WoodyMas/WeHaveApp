package com.example.wehaveapp.controllers;

import com.example.wehaveapp.WeHaveApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    private WeHaveApplication app;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink registerLink;

    @FXML
    private Label errorMessageLabel;

    @FXML
    private void initialize() {
        // initialize the controller
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        // handle login button action
    }

    @FXML
    private void handleRegisterLinkAction(ActionEvent event) {
        // handle register link action
    }

    private void showErrorMessage(String message) {
        // show error message
    }

    // Getters and Setters


    public WeHaveApplication getApp() {
        return app;
    }

    public void setApp(WeHaveApplication app) {
        this.app = app;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public Hyperlink getRegisterLink() {
        return registerLink;
    }

    public void setRegisterLink(Hyperlink registerLink) {
        this.registerLink = registerLink;
    }

    public Label getErrorMessageLabel() {
        return errorMessageLabel;
    }

    public void setErrorMessageLabel(Label errorMessageLabel) {
        this.errorMessageLabel = errorMessageLabel;
    }
}
