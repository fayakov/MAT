package controller;


import java.net.URL;
import java.util.ResourceBundle;

import communication.AddClassToCourseRequest;
import communication.AddClassToCourseResponse;
import communication.Dispatcher;
import communication.LoginResponseMsg;
import communication.MATClientController;
import communication.Message;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class AddClassToCourseController implements Handler {
	
	public AddClassToCourseController(){
		Dispatcher.addHandler(AddClassToCourseResponse.class.getCanonicalName(), this);
	}
	
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
	    	  AddClassToCourseRequest addClassReq = new AddClassToCourseRequest(clid, coid);
	    	  MATClientController.getInstance().sendRequestToServer(addClassReq);
	          
	    	 		    			 
	    	  }
	    }
	 
	 @FXML
	 void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddClassToCourseRequest) {
			AddClassToCourseResponse res = (AddClassToCourseResponse)msg;
			if (res.actionSucceed()) {
				 Prompt.alert(1, "class " + clid + " added successfully to course " + coid);
			} else {
				Prompt.alert(3, res.getErrText());	
			}
			
		}
		
	}
	 
}
