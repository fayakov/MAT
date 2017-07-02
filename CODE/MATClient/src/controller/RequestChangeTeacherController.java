package controller;


import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentToCourseRequest;
import communication.AddStudentToCourseResponse;
import communication.ChangeTeacherRequest;
import communication.ChangeTeacherResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import entities.ERequestType;
import entities.Request;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

/**
 * The Class RequestChangeTeacherController.
 */
public class RequestChangeTeacherController implements Initializable, Handler
{	
	
	/**
	 * Instantiates a new request change teacher controller.
	 */
	public RequestChangeTeacherController(){
		Dispatcher.addHandler(ChangeTeacherResponse.class.getCanonicalName(), this);
	}
	
    /** The resources. */
    @FXML
    private ResourceBundle resources;

    /** The location. */
    @FXML
    private URL location;

    /** The btn close. */
    @FXML
    private Button btnClose;
    
    /** The class number text filed. */
    @FXML
    private TextField classNumberTextFiled;

    /** The student id text filed. */
    @FXML
    private TextField studentIdTextFiled;

    /** The course id text filed. */
    @FXML
    private TextField courseIdTextFiled;

    /**
     * Send request 3.
     *
     * @param event the event
     */
    @FXML
    void SendRequest3(ActionEvent event) {
    	if(studentIdTextFiled.getText().isEmpty() || courseIdTextFiled.getText().isEmpty()|| classNumberTextFiled.getText().isEmpty()) 
    		Prompt.alert(3,"one or more of the fields is empty");
    	
    	else { 
    		try {
    			int teacherId = Integer.parseInt(studentIdTextFiled.getText());
    			int classId = Integer.parseInt(classNumberTextFiled.getText());
    			int coursId = Integer.parseInt(courseIdTextFiled.getText());
    	    	
    	    	ChangeTeacherRequest changeTeachreq= new ChangeTeacherRequest(teacherId, classId, coursId);
    			MATClientController.getInstance().sendRequestToServer(changeTeachreq);
    	    	
    	    	
    	    	} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  		
        	//Prompt.alert(1,"The request added successfully ");
    	}

    }

    /**
     * Close 3.
     *
     * @param event the event
     */
    @FXML
    void close3(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
 	    stage.close();


    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof ChangeTeacherResponse) {
			ChangeTeacherResponse res = (ChangeTeacherResponse)msg;		
			try {
				localPrompt(res.isRequestSaved());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
/**
 * Local prompt.
 *
 * @param succ the succ
 * @throws Exception the exception
 */
public void localPrompt(final boolean succ)  throws Exception {
		
		Platform.runLater(new Runnable() {
			boolean success = succ;
			
			public void run() {
				if(success)
					Prompt.alert(1, "the request has been sent");	
				else
					Prompt.alert(3, "cannot add teacher, check the details again");
			}
		} );
	}

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

 
}
