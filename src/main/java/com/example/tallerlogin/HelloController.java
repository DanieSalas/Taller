package com.example.tallerlogin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import  javafx.fml.FML;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}