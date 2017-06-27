package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentRequest;
import communication.AddStudentResponse;
import communication.DeleteStudentRequest;
import communication.DeleteStudentResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import entities.ERequestType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

public class RequestRemoveStudentFromCourseController implements Initializable, Handler{

	int studentid, classid, courseid;
	ERequestType requestType;
	boolean isConfirmed, isHandeled;
	
	
	public RequestRemoveStudentFromCourseController(){
		Dispatcher.addHandler(DeleteStudentResponse.class.getCanonicalName(), this);
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
    			studentid = Integer.parseInt(studentIdTextField.getText());
    			classid = Integer.parseInt(classTextFiled.getText());
    	    	courseid = Integer.parseInt(courseTextField.getText());
    	    	isConfirmed = false;
    	    	isHandeled = false;
    	    	requestType = requestType.removeStudent;
    	    	
    	    	DeleteStudentRequest delstureq= new DeleteStudentRequest(studentid, classid, courseid, requestType, isConfirmed, isHandeled);
    			MATClientController.getInstance().sendRequestToServer(delstureq); 
    			
    	    	} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  		
        	Prompt.alert(1,"The request added successfully ");
    	}

    }

    @FXML
    void closeRequest2(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();


    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof DeleteStudentResponse) {
			DeleteStudentResponse res = (DeleteStudentResponse)msg;
			if (res.isRequestSaved()) {
				System.out.println("Server response: Success");
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
		}
		
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
