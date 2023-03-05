package com.example.wehaveapp.controllers;

import com.example.wehaveapp.WeHaveApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegisterController {

    private WeHaveApplication app;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button registerButton;

    @FXML
    private Hyperlink loginLink;

    @FXML
    private Label errorMessageLabel;

    @FXML
    private void initialize() {
        // initialize the controller
    }

    @FXML
    private void handleRegisterButtonAction(ActionEvent event) {
        // handle register button action
    }

    @FXML
    private void handleLoginLinkAction(ActionEvent event) {
        // handle login link action
    }

    private void showErrorMessage(String message) {
        // show error message
    }


    // Getters setters


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

    public PasswordField getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public void setConfirmPasswordField(PasswordField confirmPasswordField) {
        this.confirmPasswordField = confirmPasswordField;
    }

    public Button getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(Button registerButton) {
        this.registerButton = registerButton;
    }

    public Hyperlink getLoginLink() {
        return loginLink;
    }

    public void setLoginLink(Hyperlink loginLink) {
        this.loginLink = loginLink;
    }

    public Label getErrorMessageLabel() {
        return errorMessageLabel;
    }

    public void setErrorMessageLabel(Label errorMessageLabel) {
        this.errorMessageLabel = errorMessageLabel;
    }
}

