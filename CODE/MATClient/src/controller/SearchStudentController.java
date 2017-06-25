package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SearchStudentController {
	
	private int sid;

    @FXML
    private Button closebtn;
    
    @FXML
    private TextField studentId;

    @FXML
    void send(ActionEvent event) throws Exception {
    	
    	if(studentId.getText().isEmpty()) 
		 	Prompt.alert(3,"please enter class number");		    	
    	else {  		    		
    		try {
			    sid = Integer.parseInt(studentId.getText());
		    	
		    	} catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return;
		    	}  	
    		}	    	

    }

    @FXML
    void close(ActionEvent event) {
    	 Stage stage = (Stage) closebtn.getScene().getWindow();
 	    stage.close();

    }

}
