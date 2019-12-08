package mpg;

import java.net.URL;

import java.text.DecimalFormat;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

  

@FXML

private Label label;

@FXML

private Button button;

@FXML

private TextField mileTextField;

@FXML

private TextField gallonsTextField;

@FXML

private Label gpm;

  

@FXML

private void handleButtonAction(ActionEvent event) {

  

double miles;

double gallons;

double mpg;

miles = Double.parseDouble(mileTextField.getText());

gallons = Double.parseDouble(gallonsTextField.getText());

DecimalFormat formatter = new DecimalFormat("#0.00");

mpg = miles/gallons;

gpm.setText("Miles Per Gallon:"+formatter.format(mpg));

}

  

@Override

public void initialize(URL url, ResourceBundle rb) {

// TODO

}

}  