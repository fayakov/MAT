package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.AddAssignmentForResponse;
import communication.AddCheckAssignmentRequest;
import communication.AddCheckAssignmentResponse;
import communication.AddEvaluationFormResponse;
import communication.Dispatcher;
import communication.GetAssignmentDataRequest;
import communication.GetAssignmentDataResponse;
import communication.GetAssignmentOfStudentRequest;
import communication.GetAssignmentOfStudentResponse;
import communication.GetAssignmentsOfTeacherRequest;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.Handler;

public class CheckAssignmentController implements Initializable, Handler 
{

	public CheckAssignmentController()
	{
		Dispatcher.addHandler(AddEvaluationFormResponse.class.getCanonicalName(), this);
	}
	

	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Label labelSubNum;

	    @FXML
	    private Button buttonDownload;

	    @FXML
	    private Label labelStep1;

	    @FXML
	    private Label labelUpload;

	    @FXML
	    private Button buttonNext;

	    @FXML
	    private Label labelDownload;

	    @FXML
	    private Label labelCheckAss;

	    @FXML
	    private TextField textFieldSubNum;

	    @FXML
	    private Button buttonApload;

	    
	   @FXML
	    void downloadSubmission(ActionEvent event) 
	    {

	    }

	    @FXML
	    void uploadSubmission(ActionEvent event) 
	    {

	    }

	    @FXML
	    void nextToStep2(ActionEvent event) throws Exception 
	    {
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/EvaluationForm.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			//AddCheckAssignmentRequest addReq = new AddCheckAssignmentRequest(file);
	    	//MATClientController.getInstance().sendRequestToServer(addReq);
	    }

	    
	    @FXML
	    void initialize() 
	    {
	        
	    }

		public void handle(Message msg, Object obj) 
		{
			// TODO Auto-generated method stub
			if (msg instanceof GetAssignmentOfStudentResponse) 
			{
				GetAssignmentOfStudentResponse res = (GetAssignmentOfStudentResponse)msg;
				
				if (res.isRequestSecceded()) 
				{
				String fileName= res.getFileName();
					
					
				} else {
					System.out.println("Server response:" + res.getErrText());
				}
				
			}
			
			
			if (msg instanceof AddCheckAssignmentResponse) 
			{
				AddCheckAssignmentResponse res = (AddCheckAssignmentResponse)msg;
				
				if (res.isSucceed()) 
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
			
			
			//GetAssignmentOfStudentRequest getAssignmentOfStuReq = new GetAssignmentOfStudentRequest(SubmissionStudentController.getOption());
	    	//MATClientController.getInstance().sendRequestToServer(getAssignmentOfStuReq);
			
		}

		
		/*public void func(int option)
		{
			int a=option;
		}
		*/
}






   






    


