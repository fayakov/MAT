package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentRequest;
import communication.AddStudentResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import utils.Handler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import entities.ERequestType;

public class RequestAddStudentToCourseController implements Initializable, Handler {
	
	int studentid, classid, courseid;
	ERequestType requestType;
	
	boolean isConfirmed, isHandeled;
	
	
	
	public RequestAddStudentToCourseController(){
		Dispatcher.addHandler(AddStudentResponse.class.getCanonicalName(), this);
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnClose;

    @FXML
    private TextField studentIdTextField;

    @FXML
    private TextField courseTextField;

    @FXML
    private TextField classTextField;

    @FXML
    void sendRequest1(ActionEvent event) {

    	if(studentIdTextField.getText().isEmpty() || courseTextField.getText().isEmpty()|| classTextField.getText().isEmpty()) 
    		Prompt.alert(3,"one or more of the fields is empty");
    	
    	else { // add request to db
    		try {
    			studentid = Integer.parseInt(studentIdTextField.getText());
    			classid = Integer.parseInt(classTextField.getText());
    	    	courseid = Integer.parseInt(courseTextField.getText());
    	    	isConfirmed = false;
    	    	isHandeled = false;
    	    	requestType = requestType.addStudent;
    	    	
    	    	AddStudentRequest addstureq= new AddStudentRequest(studentid, classid, courseid, requestType, isConfirmed, isHandeled);
    			MATClientController.getInstance().sendRequestToServer(addstureq);
    	    	
    	    	
    	    	} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  		
        	Prompt.alert(1,"The request added successfully ");
    	}
    }
    
    @FXML
    void closeRequest1(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();

    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddStudentResponse) {
			AddStudentResponse res = (AddStudentResponse)msg;
			if (res.isRequestSaved()) {
				System.out.println("Server response: Success");
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
		}
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
