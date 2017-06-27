package controller;


import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentRequest;
import communication.AddStudentResponse;
import communication.ChangeTeacherRequest;
import communication.ChangeTeacherResponse;
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

public class RequestChangeTeacherController implements Initializable, Handler
{

	int teacherid, classid, courseid;
	ERequestType requestType;
	
	boolean isConfirmed, isHandeled;
	
	
	public RequestChangeTeacherController(){
		Dispatcher.addHandler(ChangeTeacherResponse.class.getCanonicalName(), this);
	}
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClose;
    
    @FXML
    private TextField classNumberTextFiled;

    @FXML
    private TextField studentIdTextFiled;

    @FXML
    private TextField courseIdTextFiled;

    @FXML
    void SendRequest3(ActionEvent event) {
    	if(studentIdTextFiled.getText().isEmpty() || courseIdTextFiled.getText().isEmpty()|| classNumberTextFiled.getText().isEmpty()) 
    		Prompt.alert(3,"one or more of the fields is empty");
    	
    	else { // add request to db
    		try {
    			teacherid = Integer.parseInt(studentIdTextFiled.getText());
    			classid = Integer.parseInt(classNumberTextFiled.getText());
    	    	courseid = Integer.parseInt(courseIdTextFiled.getText());
    	    	isConfirmed = false;
    	    	isHandeled = false;
    	    	requestType = requestType.changeTeacher;
    	    	
    	    	ChangeTeacherRequest changeTeachreq= new ChangeTeacherRequest(teacherid, classid, courseid, requestType, isConfirmed, isHandeled);
    			MATClientController.getInstance().sendRequestToServer(changeTeachreq);
    	    	
    	    	
    	    	} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  		
        	Prompt.alert(1,"The request added successfully ");
    	}

    }

    @FXML
    void close3(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
 	    stage.close();


    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof ChangeTeacherResponse) {
			ChangeTeacherResponse res = (ChangeTeacherResponse)msg;
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
