package controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import communication.AddAssignmentForResponse;
import communication.Dispatcher;
import communication.GetAssignmentDataResponse;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import utils.Handler;
import javafx.scene.control.Button;

public class DefineAssignment implements Initializable, Handler
{
	public OpenAndSubmitAssignmentByStudentController()
	{
		Dispatcher.addHandler(AddAssignmentForResponse.class.getCanonicalName(), this);
	}
	
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


	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		
	}


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}

















    

