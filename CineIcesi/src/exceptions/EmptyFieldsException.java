package exceptions;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class EmptyFieldsException extends Exception{

	public EmptyFieldsException() {
		super();
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error al a�adir!");
        alert.setContentText("Ha ocurido un error al momento de a�adir al usuario");
        Optional<ButtonType> result = alert.showAndWait();
	}

	
}