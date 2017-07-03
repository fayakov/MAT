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

/**
 * The Class CheckAssignmentController.
 */
public class CheckAssignmentController //implements Initializable, Handler 
{

	//public CheckAssignmentController()
	//{
	//	Dispatcher.addHandler(AddEvaluationFormResponse.class.getCanonicalName(), this);
	//}
	

	 /** The resources. */
	@FXML
	    private ResourceBundle resources;

	    /** The location. */
    	@FXML
	    private URL location;

	    /** The label sub num. */
    	@FXML
	    private Label labelSubNum;

	    /** The button download. */
    	@FXML
	    private Button buttonDownload;

	    /** The label step 1. */
    	@FXML
	    private Label labelStep1;

	    /** The label upload. */
    	@FXML
	    private Label labelUpload;

	    /** The button next. */
    	@FXML
	    private Button buttonNext;

	    /** The label download. */
    	@FXML
	    private Label labelDownload;

	    /** The label check ass. */
    	@FXML
	    private Label labelCheckAss;

	    /** The text field sub num. */
    	@FXML
	    private TextField textFieldSubNum;

	    /** The button apload. */
    	@FXML
	    private Button buttonApload;
    	
    	@FXML
        private TextField textFieldChoosenFile;

	    
	   /**
   	 * Download submission.
   	 *
   	 * @param event the event
   	 */
   	@FXML
	    void downloadSubmission(ActionEvent event) 
	    {

	    }

	    /**
    	 * Upload submission.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void uploadSubmission(ActionEvent event) 
	    {

    		
    		
    		
    		textFieldChoosenFile.setText();
	    }

	    /**
    	 * Next to step 2.
    	 *
    	 * @param event the event
    	 * @throws Exception the exception
    	 */
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

	  

		/**
		 * Initialize.
		 *
		 * @param location the location
		 * @param resources the resources
		 */
		/*public void handle(Message msg, Object obj) 
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
*/
		public void initialize(URL location, ResourceBundle resources) 
		{
			// TODO Auto-generated method stub
			
			
			//GetAssignmentOfStudentRequest getAssignmentOfStuReq = new GetAssignmentOfStudentRequest(SubmissionStudentController.getOption());
	    	//MATClientController.getInstance().sendRequestToServer(getAssignmentOfStuReq);
			
		}

		
		
		
		
		  
	    /**
    	 * Initialize.
    	 */
    	@FXML
	    void initialize() 
	    {
	        
	    }
}






   






    


