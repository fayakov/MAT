package controller;

import java.io.File;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import communication.AddAssignmentForResponse;
import communication.CreateAssignmentRequest;
import communication.CreateAssignmentResponse;
import communication.Dispatcher;
import communication.GetAssignmentDataResponse;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import utils.Handler;
import javafx.scene.control.Button;

public class DefineAssignment implements Initializable, Handler
{
	String formatFile; //save format file
	
	public DefineAssignment()
	{
		Dispatcher.addHandler(CreateAssignmentResponse.class.getCanonicalName(), this);
	}
	
	
	
	int clid, coid;  // class id, course id
	
	 @FXML
	    private Label labelDefineAss;
	    @FXML
	    private Label labelUpload;
	    @FXML
	    private Label labelInsertClass;
	    @FXML
	    private Label labelInsertCourse;
	    @FXML
	    private DatePicker datePickerDefineDate;
	    @FXML
	    private TextField textFieldInsertClass;
	    @FXML
	    private TextField textFieldInsertCouse;
	    @FXML
	    private Button buttonSendDefineAss;
	    @FXML
	    private Label labelDefineDate;
	    @FXML
	    private Button buttonUpload;

	    
	    
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
	    }
	    
	    
	    @FXML
	    void sendDefineAssignment(ActionEvent event) 
	    {
	    	
	    	LocalDate date = datePickerDefineDate.getValue();
	         //System.err.println("Selected date: " + date); //2017-07-04
	    	
	    	//check if date is in semester
	    	
	    	
	    	 if(textFieldInsertClass.getText().isEmpty() || textFieldInsertCouse.getText().isEmpty()) 
				 	Prompt.alert(3,"one or more of the fields is empty");		    	
		     else {  	
		    		//add
		    	 try {
					    clid = Integer.parseInt(textFieldInsertClass.getText());
				    	coid = Integer.parseInt(textFieldInsertCouse.getText());
				    	} 
		    	 catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		    	  //Prompt.alert(1, "Assignment added successfully to class:" + clid + ",course:" +coid);		    			 
		    	  }
	    	 
	    	 /*
	    	 //check format file:
	    	 String fileName= selectedFile.getName();
	    	    int dotIndex = fileName.lastIndexOf('.');
	    	    String format= (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
	    	 if ((Objects.equals(format, new String("word")))) formatFile= "word";
	    	   else if (Objects.equals(format, new String("PDF"))) formatFile= "PDF";
	    		    else if (Objects.equals(format, new String("Excel")))  formatFile= "Excel";
	    		        else  Prompt.alert(3,"please upload a file with valid format"); */
	    	 
	    	 
	    	 //CreateAssignmentRequest createAssignmentReq = new CreateAssignmentRequest(selectedFile, filename, date, clid, coid );
	 		//MATClientController.getInstance().sendRequestToServer(createAssignmentReq);
	    }

   


	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof CreateAssignmentResponse) 
		{
			CreateAssignmentResponse res = (CreateAssignmentResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				System.out.println("Server response: Success");
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
	}


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	 
    @FXML
    void initialize() 
    {
       
    }
	
}

















    

