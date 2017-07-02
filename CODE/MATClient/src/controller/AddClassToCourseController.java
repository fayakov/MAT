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
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


/**
 * The Class AddClassToCourseController.
 */
public class AddClassToCourseController implements Handler {
	
	/**
	 * Instantiates a new adds the class to course controller.
	 */
	public AddClassToCourseController(){
		Dispatcher.addHandler(AddClassToCourseResponse.class.getCanonicalName(), this);
	}
	
	 /** The coid. */
 	int clid, coid;  // class id, course id
	
	 /** The resources. */
 	@FXML
     private ResourceBundle resources;

	 /** The location. */
 	@FXML
     private URL location;

	 /** The class id. */
 	@FXML
	 private TextField classId;

	 /** The course id. */
 	@FXML
	 private TextField courseId;
	 
	 /** The btn close. */
 	@FXML
	 private Button btnClose;
	 
	 /**
 	 * Send add class.
 	 *
 	 * @param event the event
 	 */
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
	 
	 /**
 	 * Close.
 	 *
 	 * @param event the event
 	 */
 	@FXML
	 void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddClassToCourseResponse) {
			AddClassToCourseResponse res = (AddClassToCourseResponse)msg;
			try {
				localPrompt(clid, coid,  res.getErrText(), res.actionSucceed());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
		
	}
	
/**
 * Local prompt.
 *
 * @param clid the clid
 * @param coid the coid
 * @param eror the eror
 * @param succ the succ
 * @throws Exception the exception
 */
public void localPrompt(final int clid, final int coid, final String eror, final boolean succ)  throws Exception {
		
		Platform.runLater(new Runnable() {
			int classId = clid;
			int courseId = coid;		
			String erorText = eror;
			boolean success = succ;
			
			public void run() {
				if(success)
					Prompt.alert(1, "class " + classId + " added successfully to course " + courseId);	
				else
					Prompt.alert(3, "cannot add class to course, check the details again");
			}
		} );
	}
	 
}
