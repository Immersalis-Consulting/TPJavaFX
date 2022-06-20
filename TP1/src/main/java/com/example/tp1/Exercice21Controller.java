package com.example.tp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Exercice21Controller {
    @FXML
    private TextField resultCalcul;
    @FXML
    private TextField valueA;
    @FXML
    private TextField valueB;
    @FXML
    protected void onCalculButtonClick() {
        resultCalcul.setText(String.valueOf(Float.parseFloat(valueA.getText()) + Float.parseFloat(valueB.getText())).toString());
    }
}
