package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class StoreController {

    @FXML
    private void goHome() throws IOException {
        App.setRoot("home");
    }
}