package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class HomeController {

    @FXML
    private void switchToStore() throws IOException {
        App.setRoot("store");
    }
}