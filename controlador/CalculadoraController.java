package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Calculadora;

public class CalculadoraController implements Initializable {

	String num = "";

	// Atributos graficos FXML
	@FXML
	private TextField display;
	@FXML
	private Button boton_0;
	@FXML
	private Button boton_1;
	@FXML
	private Button boton_2;
	@FXML
	private Button boton_3;
	@FXML
	private Button boton_4;
	@FXML
	private Button boton_5;
	@FXML
	private Button boton_6;
	@FXML
	private Button boton_7;
	@FXML
	private Button boton_8;
	@FXML
	private Button boton_9;

	@FXML
	private Button boton_suma;
	@FXML
	private Button boton_resta;
	@FXML
	private Button boton_por;
	@FXML
	private Button boton_div;
	@FXML
	private Button boton_igual;

	@FXML
	private Button boton_coma;
	@FXML
	private Button boton_arrere;
	@FXML
	private Button boton_supAll;
	@FXML
	private Button boton_sup;

	private Calculadora calculadora;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Evento botones, apertura de ventanas
		boton_0.setOnMouseClicked((event) -> pulsarNumero("0"));
		boton_1.setOnMouseClicked((event) -> pulsarNumero("1"));
		boton_2.setOnMouseClicked((event) -> pulsarNumero("2"));
		boton_3.setOnMouseClicked((event) -> pulsarNumero("3"));
		boton_4.setOnMouseClicked((event) -> pulsarNumero("4"));
		boton_5.setOnMouseClicked((event) -> pulsarNumero("5"));
		boton_6.setOnMouseClicked((event) -> pulsarNumero("6"));
		boton_7.setOnMouseClicked((event) -> pulsarNumero("7"));
		boton_8.setOnMouseClicked((event) -> pulsarNumero("8"));
		boton_9.setOnMouseClicked((event) -> pulsarNumero("9"));

		boton_suma.setOnMouseClicked((event) -> asignarOperacion("+"));
		boton_resta.setOnMouseClicked((event) -> asignarOperacion("-"));
		boton_por.setOnMouseClicked((event) -> asignarOperacion("x"));
		boton_div.setOnMouseClicked((event) -> asignarOperacion("/"));
		boton_igual.setOnMouseClicked((event) -> resultado("="));

		boton_arrere.setOnMouseClicked((event) -> pulsarNumero(","));
		boton_coma.setOnMouseClicked((event) -> pulsarNumero(","));
		boton_supAll.setOnMouseClicked((event) -> clear());
		boton_sup.setOnMouseClicked((event) -> clearChar());

		calculadora = new Calculadora();

	}

	// Metodos
	private void pulsarNumero(String i) {
		display.setText(display.getText() + i);
	}

	private void clear() {
		display.clear();
		display.setText("0");
	}

	private void clearChar() {
		display.setText(display.getText().substring(0, (display.getText().length() - 1))
				+ display.getText().substring((display.getText().length() - 1) + 1));
	}

	private void asignarOperacion(String opc) {
		double num1 = 0;
		double num2 = 0;

		num1 = Double.parseDouble(display.getText());
		calculadora.setNum1(num1);

		switch (opc) {
		case "+":			
			display.setText("");

			num2 = Double.parseDouble(display.getText());
			calculadora.setNum1(num2);
			break;
		case "-":

			break;
		case "x":

			break;
		case "/":

			break;
		}
	}

	private void resultado(String opc) {
		switch (opc) {
		case "=":
			display.setText(String.valueOf(calculadora.sumar()));
			break;
		case "-":
		display.setText(String.valueOf(calculadora.restar()));
		break;
		}
	}

}