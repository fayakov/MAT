package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
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
	}
	
	 @FXML
	    private TextField textFieldAssNum;

	    @FXML
	    private Button buttonDownload;

	    @FXML
	    private Label labelUpload;

	    @FXML
	    private Label labelAssNum;

	    @FXML
	    private Button buttonUpload;

	    @FXML
	    private Label labelDownload;

	    @FXML
	    private Button buttonSendSub;


	    
	    @FXML
	    void pressDownload(ActionEvent event) throws Exception 
	    {
	    	 String line;
	         BufferedReader in;

	         in = new BufferedReader(new FileReader("testFile"));
	         line = in.readLine();

	         while(line != null)
	         {
	                System.out.println(line);
	                line = in.readLine();
	         }

	         System.out.println(line);
	    	
	    	
	    }

	    
	    @FXML
	    void pressUpload(ActionEvent event) 
	    {
	    	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

			int returnValue = jfc.showOpenDialog(null);
			// int returnValue = jfc.showSaveDialog(null);

			if (returnValue == JFileChooser.APPROVE_OPTION) {
				File selectedFile = jfc.getSelectedFile();
				System.out.println(selectedFile.getAbsolutePath());
				
			}
	    	//need to check validation of format.....
	    }
    

	    
    @FXML
    void sendSubmission(ActionEvent event) 
    {
    	//get date of today:
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate todayDate = LocalDate.now();
		System.out.println(dtf.format(todayDate)); //2017/06/29
		
		
    	AddAssignmentForResponse addAssignmentForReq = new AddAssignmentForResponse(fileName, file, teacher, course, todayDate,assignmentNumber, studentId);
    	MATClientController.getInstance().sendRequestToServer(addAssignmentForReq);
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
		
		}




	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		textFieldAssNum.setText(assignmentNumber);
		
	}
	
 
    @FXML
    void initialize() {
         
    }
    
   
}





    








    

