package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentToCourseRequest;
import communication.AddStudentToCourseResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import utils.Handler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import entities.ERequestType;
import entities.Request;

/**
 * The Class RequestAddStudentToCourseController.
 */
public class RequestAddStudentToCourseController implements Initializable, Handler {

	/**
	 * Instantiates a new request add student to course controller.
	 */
	public RequestAddStudentToCourseController(){
		Dispatcher.addHandler(AddStudentToCourseResponse.class.getCanonicalName(), this);
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

    /** The student id text field. */
    @FXML
    private TextField studentIdTextField;

    /** The course text field. */
    @FXML
    private TextField courseTextField;

    /** The class text field. */
    @FXML
    private TextField classTextField;

    /**
     * Send request 1.
     *
     * @param event the event
     */
    @FXML
    void sendRequest1(ActionEvent event) {

    	if(studentIdTextField.getText().isEmpty() || courseTextField.getText().isEmpty()|| classTextField.getText().isEmpty()) 
    		Prompt.alert(3,"one or more of the fields is empty");
    	
    	else { // add request to db
    		try {
    			int studentId = Integer.parseInt(studentIdTextField.getText());
    			int classId = Integer.parseInt(classTextField.getText());
    			int coursId = Integer.parseInt(courseTextField.getText());
    		
    	    	AddStudentToCourseRequest addstureq= new AddStudentToCourseRequest(studentId, classId, coursId);
    			MATClientController.getInstance().sendRequestToServer(addstureq);  	    	
    	    	
    	    	} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  		
        	//Prompt.alert(1,"The request added successfully ");
    	}
    }
    
    /**
     * Close request 1.
     *
     * @param event the event
     */
    @FXML
    void closeRequest1(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();

    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddStudentToCourseResponse) {
			AddStudentToCourseResponse res = (AddStudentToCourseResponse)msg;
			try {
				localPrompt(res.getErrText(), res.isRequestSaved());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
/**
 * Local prompt.
 *
 * @param eror the eror
 * @param succ the succ
 * @throws Exception the exception
 */
public void localPrompt(final String eror, final boolean succ)  throws Exception {
		
		Platform.runLater(new Runnable() {		
			String erorText = eror;
			boolean success = succ;
			
			public void run() {
				if(success)
					Prompt.alert(1, "The request sent successfully");	
				else
					Prompt.alert(3, "cannot send request, check details again");
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
