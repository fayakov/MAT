package controller;


	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Alert;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
	import javafx.scene.control.Alert.AlertType;
	import javafx.stage.Stage;

public class StatisticClassAndCoursesController {
	
		private int clid;

	    @FXML
	    private TextField classNumber;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticClassAndCourses(ActionEvent event) {
	    	
	    	 if(classNumber.getText().isEmpty()) 
				 	Prompt.alert(3,"please enter class number");		    	
		     else {  	
		    		
		    	 try {
					    clid = Integer.parseInt(classNumber.getText());
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		          		    			 
		    	  }
		    }
	    		    	
	    
	    
	    @FXML
	    void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }
	}


