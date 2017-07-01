package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentToCourseRequest;
import communication.AddStudentToCourseResponse;
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
import entities.Request;

public class RequestAddStudentToCourseController implements Initializable, Handler {

	public RequestAddStudentToCourseController(){
		Dispatcher.addHandler(AddStudentToCourseResponse.class.getCanonicalName(), this);
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
    
    @FXML
    void closeRequest1(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();

    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddStudentToCourseResponse) {
			AddStudentToCourseResponse res = (AddStudentToCourseResponse)msg;
			if (res.isRequestSaved()) {
				System.out.println("The request added successfully");
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
		}
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
