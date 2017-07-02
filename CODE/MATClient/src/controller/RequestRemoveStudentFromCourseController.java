package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.DeleteStudentFromCourseRequest;
import communication.DeleteStudentFromCourseResponse;
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
 * The Class RequestRemoveStudentFromCourseController.
 */
public class RequestRemoveStudentFromCourseController implements Initializable, Handler{

	/** The course id. */
	int studentId, classId, courseId;
	
	/**
	 * Instantiates a new request remove student from course controller.
	 */
	public RequestRemoveStudentFromCourseController(){
		Dispatcher.addHandler(DeleteStudentFromCourseResponse.class.getCanonicalName(), this);
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

    /** The class text filed. */
    @FXML
    private TextField classTextFiled;

    /** The student id text field. */
    @FXML
    private TextField studentIdTextField;

    /** The course text field. */
    @FXML
    private TextField courseTextField;

    /**
     * Send request 2.
     *
     * @param event the event
     */
    @FXML
    void sendRequest2(ActionEvent event) {
    	if(studentIdTextField.getText().isEmpty() || courseTextField.getText().isEmpty()|| classTextFiled.getText().isEmpty()) 
    		Prompt.alert(3,"one or more of the fields is empty");
    	
    	else { // add request to db
    		try {
    			studentId = Integer.parseInt(studentIdTextField.getText());
    			classId = Integer.parseInt(classTextFiled.getText());
    			courseId = Integer.parseInt(courseTextField.getText());
    		} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  		
    	    	
    	    	DeleteStudentFromCourseRequest delstureq= new DeleteStudentFromCourseRequest(studentId, classId, courseId);
    			MATClientController.getInstance().sendRequestToServer(delstureq); 
    			
    	}

    }

    /**
     * Close request 2.
     *
     * @param event the event
     */
    @FXML
    void closeRequest2(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();


    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof DeleteStudentFromCourseResponse) {
			DeleteStudentFromCourseResponse res = (DeleteStudentFromCourseResponse)msg;
			
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
					Prompt.alert(1, "The request added successfully");	
				else
					Prompt.alert(3, "cannot send request, check details again");
			}
		} );
	}

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
