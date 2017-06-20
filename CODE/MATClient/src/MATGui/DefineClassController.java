package MATGui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DefineClassController {

    @FXML
    private TextField className;

    @FXML
    void createClass(ActionEvent event) {
    	
    	String cName = className.getText().toString();
    	/*
    	 * send to server
    	 * add class
    	 * */
    	
    	// if succeeded
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("class " + cName + " was added succesfully");
    	alert.show();
    }
}
