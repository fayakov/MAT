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

public class RequestRemoveStudentFromCourseController implements Initializable, Handler{

	int studentId, classId, courseId;
	
	public RequestRemoveStudentFromCourseController(){
		Dispatcher.addHandler(DeleteStudentFromCourseResponse.class.getCanonicalName(), this);
	}
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClose;

    @FXML
    private TextField classTextFiled;

    @FXML
    private TextField studentIdTextField;

    @FXML
    private TextField courseTextField;

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

    @FXML
    void closeRequest2(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();


    }

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

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
