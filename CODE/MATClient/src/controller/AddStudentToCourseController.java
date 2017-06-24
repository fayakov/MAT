package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import entities.ERequestType;

public class AddStudentToCourseController {
	
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
    			sid = Integer.parseInt(studentIdTextField.getText());
    			cid = Integer.parseInt(classTextField.getText());
    	    	oid = Integer.parseInt(courseTextField.getText());
    	    	isConfirmed = null;
    	    	isHandeled = null;
    	    	ERequestType = 1;
    	    	
    	    	
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

}
