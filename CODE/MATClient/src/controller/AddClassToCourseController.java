package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class AddClassToCourseController {
	
	 int clid, coid;
	
	 @FXML
     private ResourceBundle resources;

	 @FXML
     private URL location;

	 @FXML
	 private TextField classId;

	 @FXML
	 private TextField courseId;
	 
	 @FXML
	 private Button btnClose;
	 
	 @FXML
	 void sendAddClass(ActionEvent event) {
	    	
	    	if(classId.getText().isEmpty() || courseId.getText().isEmpty()) {
	    		
		    	Alert alert = new Alert(AlertType.ERROR);
		    	alert.setHeaderText("one or more of the fields is empty");
		    	alert.show();
		    	}
	    	else {  	
	    		clid = Integer.parseInt(classId.getText());
		    	coid = Integer.parseInt(courseId.getText());
		    	/* add class to db*/
		    	
		    	Alert alert = new Alert(AlertType.INFORMATION);
		    	alert.setHeaderText("class " + clid + " added successfully to course " + coid);
		    	alert.show();
	    	}
	    }
	 
	 @FXML
	 void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }
	 
	 @FXML
	 void initialize() {
	     assert classId != null : "fx:id=\"classId\" was not injected: check your FXML file 'AddClassToCourse.fxml'.";
	     assert courseId != null : "fx:id=\"courseId\" was not injected: check your FXML file 'AddClassToCourse.fxml'.";

	    }
}
