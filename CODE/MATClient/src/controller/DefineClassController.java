package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class DefineClassController {

    @FXML
    private TextField className;
    
    @FXML
    private Button btnClose;

    @FXML
    void createClass(ActionEvent event) {
    	
    	String cName = className.getText().toString();
    	
    	if(className.getText().isEmpty()) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setHeaderText("one or more of the fields is empty");
    		alert.show();
    	}    	
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("class " + cName + " was added succesfully");
    		alert.show();
    	}
    }
    
    @FXML
    void closeDefineClass(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }
}
