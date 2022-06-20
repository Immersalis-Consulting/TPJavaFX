package com.example.tp3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalculatriceController {

    @FXML
    private Text output;

    private float number1 = 0;
    private String operator = "";
    private boolean start = true;

    private CalculatriceModel model = new CalculatriceModel();

    @FXML
    private void processNumpad(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        //si hay un operador diferente a igual
        if (!"=".equals(value)) {
            //if (!operator.isEmpty())
               // return;

            //recibir el operador
            //recibir el numero
            //borrar el texto de la calculadora
            operator = value;
            number1 = Float.valueOf(output.getText());
            output.setText("");
        }
        else {
        	
           // if (operator.isEmpty())
               // return;

            //si hay un operador =
            output.setText(String.valueOf(model.calculate(number1, Float.valueOf(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }
}