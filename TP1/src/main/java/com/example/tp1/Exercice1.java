package com.example.tp1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercice1 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        HBox hbox = new HBox();

        Label label1 = new Label("Message:");

        TextField text1 = new TextField();

        Button boutton1 = new Button("Afficher");
        boutton1.setOnAction( e -> {
            text1.setText("Hello World!");
        });

        hbox.getChildren().addAll(label1, text1, boutton1);

        Scene scene = new Scene(hbox, 300, 50);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mon première JavaFX");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
