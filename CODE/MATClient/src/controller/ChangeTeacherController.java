package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChangeTeacherController 
{

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
    			sid = Integer.parseInt(studentIdTextFiled.getText());
    			cid = Integer.parseInt(classNumberTextFiled.getText());
    	    	oid = Integer.parseInt(courseIdTextFiled.getText());
    	    	isConfirmed = null;
    	    	isHandeled = null;
    	    	ERequestType = 3;
    	    	
    	    	
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

 
}
