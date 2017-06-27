package controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class DefineAssignment 
{
	int clid, coid;  // class id, course id
	
	 @FXML
	    private Label labelDefineAss;

	    @FXML
	    private Label labelUpload;

	    @FXML
	    private Label labelInsertClass;

	    @FXML
	    private Label labelInsertCourse;

	    @FXML
	    private DatePicker datePickerDefineDate;

	    @FXML
	    private TextField textFieldInsertClass;

	    @FXML
	    private TextField textFieldInsertCouse;

	    @FXML
	    private Button buttonSendDefineAss;

	    @FXML
	    private Label labelDefineDate;

	    @FXML
	    void sendDefineAssignment(ActionEvent event) 
	    {
	    	
	    	LocalDate date = datePickerDefineDate.getValue();
	         //System.err.println("Selected date: " + date);
	    	
	    	 if(textFieldInsertClass.getText().isEmpty() || textFieldInsertCouse.getText().isEmpty()) 
				 	Prompt.alert(3,"one or more of the fields is empty");		    	
		     else {  	
		    		//add
		    	 try {
					    clid = Integer.parseInt(textFieldInsertClass.getText());
				    	coid = Integer.parseInt(textFieldInsertCouse.getText());
				    	} 
		    	 catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		    	  Prompt.alert(1, "Assignment added successfully to class:" + clid + ",course:" +coid);		    			 
		    	  }
	    }

    
    @FXML
    void initialize() 
    {
       
    }
	
}

















    

