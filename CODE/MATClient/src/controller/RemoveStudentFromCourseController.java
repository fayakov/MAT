package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RemoveStudentFromCourseController {

	int sid, cid, oid;
	
	String isConfirmed, isHandeled;
	
	int ERequestType;
	
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
    			sid = Integer.parseInt(studentIdTextField.getText());
    			cid = Integer.parseInt(classTextFiled.getText());
    	    	oid = Integer.parseInt(courseTextField.getText());
    	    	isConfirmed = null;
    	    	isHandeled = null;
    	    	ERequestType = 2;
    	    	
    	    	
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


}
