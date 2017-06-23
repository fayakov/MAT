package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class AddClassToCourseController {
	
	 int clid, coid;  // class id, course id
	
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
		 
		 if(classId.getText().isEmpty() || courseId.getText().isEmpty()) 
			 	Prompt.alert(3,"one or more of the fields is empty");		    	
	     else {  	
	    		//add class to db
	    	 try {
				    clid = Integer.parseInt(classId.getText());
			    	coid = Integer.parseInt(courseId.getText());
			    	} catch(NumberFormatException e){
			    	Prompt.alert(3,"please enter numerical value");
			    	return;
			    	}  	
	          Prompt.alert(1, "class " + clid + " added successfully to course " + coid);		    			 
	    	  }
	    }
	 
	 @FXML
	 void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }
	 
}
