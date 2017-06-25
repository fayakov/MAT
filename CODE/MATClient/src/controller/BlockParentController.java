package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class BlockParentController {
	
	private int pid;

    @FXML
    private TextField ParentID;

    @FXML
    private Button btnClose;

	    @FXML
	    void BlockParent(ActionEvent event) {
	    	
	    	if(ParentID.getText().isEmpty()) 
			 	Prompt.alert(3,"please enter class number");		    	
	    	else {  		    		
	    		try {
				    pid = Integer.parseInt(ParentID.getText());
			    	
			    	} catch(NumberFormatException e){
			    	Prompt.alert(3,"please enter numerical value");
			    	return;
			    	}  	
	    		}	    			
	    }
	    
	    @FXML
	    void closeBlockParent(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}

