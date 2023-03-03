module com.example.wehaveapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.web;

    opens com.example.wehaveapp to javafx.fxml;
    exports com.example.wehaveapp;
    exports com.example.wehaveapp.controllers;
    opens com.example.wehaveapp.controllers to javafx.fxml;
}