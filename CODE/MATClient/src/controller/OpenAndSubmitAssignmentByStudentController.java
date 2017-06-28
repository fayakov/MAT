package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OpenAndSubmitAssignmentByStudentController 
{
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textFieldAssNum;

    @FXML
    private Label labelUpload;

    @FXML
    private Label labelAssNum;

    @FXML
    private Label labelDownload;
    
    @FXML
    private Button buttonSendSub;

    
    @FXML
    void sendSubmission(ActionEvent event) 
    {
    	//need to check validation of format
        	Prompt.alert(1,"Submission file was added successfully ");
    }
    
    
    

    
    @FXML
    void initialize() {
        
    
    
	    
    }
    
   
}





    








    

