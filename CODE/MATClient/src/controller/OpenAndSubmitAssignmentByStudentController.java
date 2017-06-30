package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import communication.AddAssignmentForResponse;
import communication.Dispatcher;
import communication.GetAssignmentDataRequest;
import communication.GetAssignmentDataResponse;
import communication.GetAssignmentsOfStudentResponse;
import communication.MATClientController;
import communication.Message;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import utils.Handler;

public class OpenAndSubmitAssignmentByStudentController implements Initializable, Handler
{
	
	public OpenAndSubmitAssignmentByStudentController()
	{
		Dispatcher.addHandler(AddAssignmentForResponse.class.getCanonicalName(), this);
		Dispatcher.addHandler(GetAssignmentDataResponse.class.getCanonicalName(), this);
	}
	
	 @FXML
	    private Label labelCourseName;

	    @FXML
	    private TextField textFieldCourseName;

	    @FXML
	    private Button buttonDownload;

	    @FXML
	    private TextField textFieldLastDate;

	    @FXML
	    private Label labelLastDate;

	    @FXML
	    private TextField textFieldTeacherName;

	    @FXML
	    private Label labelDownload;

	    @FXML
	    private Button buttonSendSub;

	    @FXML
	    private Label labelTeacherName;

	    @FXML
	    private TextField textFieldAssNum;

	    @FXML
	    private Label labelUpload;

	    @FXML
	    private Label labelAssNum;

	    @FXML
	    private Button buttonUpload;

	    
	    
	    @FXML
	    void pressDownload(ActionEvent event) 
	    {
	    	//File file = new File("file.txt");
	    }

	    
	    @FXML
	    void pressUpload(ActionEvent event) 
	    {
			//chooseFile();
	    }
    
	    
	    
	    
    @FXML
    void sendSubmission(ActionEvent event) 
    {
    	//get date of today:
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2017/06/29
		
		
    	
    	
    	//AddAssignmentForResponse addAssignmentForReq = new AddAssignmentForResponse(file, teacher, course, localDate);
    	//MATClientController.getInstance().sendRequestToServer(addAssignmentForReq);
    	
    	//need to check validation of format.....

    }
    
    
    
    @FXML
    void initialize() {
         
    }


	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof AddAssignmentForResponse) 
		{
			AddAssignmentForResponse res = (AddAssignmentForResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				System.out.println("Server response: Success");
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
		}
		
		
		if (msg instanceof GetAssignmentDataResponse) 
		{
			GetAssignmentDataResponse res = (GetAssignmentDataResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				String strAssNum = Integer.toString(AssignmentStudent.getChoosenAss());
				
				textFieldAssNum.setText(strAssNum);
				textFieldTeacherName.setText(res.getTeacherName());
				textFieldCourseName.setText(res.getCourseName());
				textFieldLastDate.setText(res.getLastDate());
				//get file....
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
		
	}



	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		GetAssignmentDataRequest GetAssignmentsOfDataReq = new GetAssignmentDataRequest(AssignmentStudent.getChoosenAss());
    	MATClientController.getInstance().sendRequestToServer(GetAssignmentsOfDataReq);
		
	}
    
   
}





    








    

