package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class CalculadoraController implements Initializable {
	// Atributos graficos FXML
	@FXML
	private Button boton_0;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		
		// Evento botones, apertura de ventanas
		boton_0.setOnMouseClicked((event) -> pulsarNumero(0));
	}

	private  void pulsarNumero(int i) {
	}
}