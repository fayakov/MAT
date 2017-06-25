package controller;

 import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class StatisticTeacherAndClassesController {
	
		private int tid;

	    @FXML
	    private TextField TeacherID;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticTeacherAndClasses(ActionEvent event) {
	    	
	    	 if(TeacherID.getText().isEmpty()) 
				 	Prompt.alert(3,"please enter teacher Id");		    	
		     else {  	
		    		
		    	 try {
					    tid = Integer.parseInt(TeacherID.getText());
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		     }	    			 
	    }
	    
	    @FXML
	    void closeStatisticTeacherAndClasses(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}
	
	
	
	
	

