package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class AddClassToCourseController {
	
	 @FXML
     private ResourceBundle resources;

	 @FXML
     private URL location;

	 @FXML
	 private TextField classId;

	 @FXML
	 private TextField courseId;
	 
	 @FXML
	 void sendAddClass(ActionEvent event) {
	    		    	
	    	String clid = classId.getText().toString();
	    	String coid = courseId.getText().toString();
	    	/* send request to server
	    	*  add student to class
	    	*/
	    	
	    	// if succeeded   	
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("class " + clid + " added successfully to course " + coid);
	    	alert.show();
	    }
	 
	 @FXML
	 void initialize() {
	     assert classId != null : "fx:id=\"classId\" was not injected: check your FXML file 'AddClassToCourse.fxml'.";
	     assert courseId != null : "fx:id=\"courseId\" was not injected: check your FXML file 'AddClassToCourse.fxml'.";

	    }
}
