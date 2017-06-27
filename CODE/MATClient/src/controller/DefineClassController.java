package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DefineClassController {
	
	int clid;
	
	@FXML
    private TextField classId;

    @FXML
    private TextField className;
    
    @FXML
    private Button btnClose;

    @FXML
    void createClass(ActionEvent event) {
    	
    	String cName = className.getText().toString();
    	
    	if(className.getText().isEmpty() || classId.getText().isEmpty()) 
    		Prompt.alert(3,  "one or more of the fields is empty");    
    	
    	else {  
    		try {
			    clid = Integer.parseInt(classId.getText());   	
		    	} catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return;
		    	}  	
    		Prompt.alert(1, "class " + cName + " was added succesfully");
    		
    	}
    }
    
    @FXML
    void closeDefineClass(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }
}
