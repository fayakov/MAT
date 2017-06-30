package controller;



import java.sql.Date;

import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import communication.OpenSemesterRequest;
import communication.OpenSemesterResponse;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

public class OpenSemesterController implements Handler {
	
	public OpenSemesterController(){
		Dispatcher.addHandler(OpenSemesterResponse.class.getCanonicalName(), this);
	}
	
		//ArrayList<Semester> semester = new ArrayList<Semester>();
		ObservableList<String> list;
		private int sid;
		private String semName;
		private Date sDate, eDate;
		
		@FXML
	    private TextField semesterName;
	    
		@FXML
		private DatePicker endDate;

		@FXML
		private DatePicker startDate;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void createSemester(ActionEvent event)	{
	    	
	    	semName = semesterName.getText().toString();
	    	
	    	if(semName == "") // + date check
	    		Prompt.alert(3, "one or more of the fields is empty");    	    	
	    	else { 
	    		try {
	    		 }
	    		catch(NumberFormatException e){
	    			Prompt.alert(3,"please enter numerical value");
			    	return;
	    			}
	    		OpenSemesterRequest openSemesterReq = new OpenSemesterRequest(sDate, eDate);
		        MATClientController.getInstance().sendRequestToServer(openSemesterReq);
	    		}    	
	    }	    		    		
	    		    
	  	    
	    @FXML
	    void closeSemester(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }


		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			if (msg instanceof OpenSemesterRequest) {
				OpenSemesterResponse res = (OpenSemesterResponse)msg;
				if (res.isSucceeded()) {
					Prompt.alert(1, "semester " +  semName + " was added succesfully");
				} else {
					Prompt.alert(3, res.getErrText());	
				}
				
			}
			
		}    
}
