package com.example.tp2bis;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//Le modele est dans un package différent, on doit l'importer
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class PerimetreGUIController implements Initializable {


    @FXML
    private TextField textLongeur;

    @FXML
    private TextField textLargeur;

    @FXML
    private Label valResultat;

    //On crée une instance du modèle
    private PerimetreModele model;

    public PerimetreGUIController() {
        // TODO Auto-generated constructor stub
        model = new PerimetreModele();
    // Va me faire un nullException
   //textLargeur.getText();

    }

    @FXML
    private void buttonCalculer(ActionEvent event) {
        if((!textLongeur.getText().isEmpty())&&(!textLargeur.getText().isEmpty()))
        {
            float valLongueur = Float.valueOf(textLongeur.getText());
            float valLargeur= Float.valueOf(textLargeur.getText());
            float valResult = model.calculPerimetre(valLongueur, valLargeur);   //Ici on fait appel à la méthode du modèle pour calculer le périmètre.
            valResultat.setText(String.valueOf(valResult));

        }
    }

    @FXML
    private void buttonNettoyer(ActionEvent event) {
        textLongeur.setText("");
        textLargeur.setText("");
        valResultat.setText("0.0");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textLargeur.setOnMouseClicked(toto -> {
            System.out.println("plop");
            System.out.println(toto.getEventType().toString() + ":" + toto.getScreenX());
        });
    }
}
