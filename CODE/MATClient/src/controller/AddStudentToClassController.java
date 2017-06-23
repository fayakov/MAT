package controller;

import java.net.URL;
import java.util.ResourceBundle;

import entities.CClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddStudentToClassController {
	
	int sid, cid;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnClose;

    @FXML
    private TextField ClassID;

    @FXML
    private TextField StudentID;

    @FXML
    void sendAddStudent(ActionEvent event) {
    /*
    	try {
    	sid = Integer.parseInt(StudentID.getText());
    	cid = Integer.parseInt(ClassID.getText());
    	} catch NumberFormatException();
    */	
    	if(ClassID.getText().isEmpty() || StudentID.getText().isEmpty()) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setHeaderText("one or more of the fields is empty");
    		alert.show();
    	}
    	else { // if succeeded
    		
	    	/* add student to class */
    		sid = Integer.parseInt(StudentID.getText());
        	cid = Integer.parseInt(ClassID.getText());
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("student " + sid + " added successfully to class " + cid);
    		alert.show();
    	}
    }
    
    @FXML
    void closeAddStodent(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

    @FXML
    void initialize() {
        assert ClassID != null : "fx:id=\"ClassID\" was not injected: check your FXML file 'AddStudentToClass.fxml'.";
        assert StudentID != null : "fx:id=\"StudentID\" was not injected: check your FXML file 'AddStudentToClass.fxml'.";

    }
}
