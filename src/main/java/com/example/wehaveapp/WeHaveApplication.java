package com.example.wehaveapp;

import com.example.wehaveapp.controllers.HomeController;
import com.example.wehaveapp.controllers.LoginController;
import com.example.wehaveapp.controllers.RegisterController;
import com.example.wehaveapp.controllers.UserController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WeHaveApplication extends Application {

    private Stage primaryStage; // The main stage for the application

    // These are the different scenes for the application
    private Scene loginScene;
    private Scene registerScene;
    private Scene homeScene;

    // These are the AnchorPanes that are reused in different scenes
    private AnchorPane loginPane;
    private AnchorPane registerPane;
    private AnchorPane homePane;

    private UserController userController;
    private LoginController loginController;
    private RegisterController registerController;
    private HomeController homeController;

    @FXML
    private Button loginButton;


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        setLoginScene();
//        setHomeScene();
        primaryStage.show();
    }

    public void setApp(UserController userController) {
        this.userController = userController;
        this.loginController.setApp(this);
        this.registerController.setApp(this);
        this.homeController.setApp(this);
    }

    public void setLoginScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/static/fxml/login.fxml"));
        Parent root = loader.load();
        loginController = loader.getController();
        loginController.setApp(this);
        primaryStage.setScene(new Scene(root));
    }

    public void setRegistrationScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/static/fxml/create-account.fxml"));
        Parent root = loader.load();
        registerController = loader.getController();
        registerController.setApp(this);
        primaryStage.setScene(new Scene(root));
    }

    public void setHomeScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/static/fxml/home-view.fxml"));
        Parent root = loader.load();
        homeController = loader.getController();
        homeController.setApp(this);
        primaryStage.setScene(new Scene(root));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
