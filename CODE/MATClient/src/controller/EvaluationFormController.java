package controller;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import communication.AddCheckAssignmentRequest;
import communication.AddEvaluationFormRequest;
import communication.AddEvaluationFormResponse;
import communication.Dispatcher;
import communication.GetAssignmentDataRequest;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import utils.Handler;

public class EvaluationFormController implements Initializable, Handler
{

	public EvaluationFormController()
	{
		Dispatcher.addHandler(AddCheckAssignmentRequest.class.getCanonicalName(), this);
	}
	
	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField textFieldGrade;

	    @FXML
	    private Label labelFinalGrade;

	    @FXML
	    private Label labelStep2;

	    @FXML
	    private TextArea textAreaComment;

	    @FXML
	    private Button buttonSendForm;

	    @FXML
	    private Label labelComment;

	    
	    @FXML
	    void sendEvaluationForm(ActionEvent event) 
	    {
	    	
	    	if(textFieldGrade.getText().isEmpty() || textAreaComment.getText().isEmpty()) 
	    		Prompt.alert(3,"one or more of the fields is empty");
	    	
	    	else { // add 
	    		try {
	    			int grade = Integer.parseInt(textFieldGrade.getText()); //need to save the grade...
	    	    	} catch(NumberFormatException e){
	    	    	Prompt.alert(3,"please enter numerical value");
	    	    	return;
	    	    	}  		
	    	}
	    	
	    	AddEvaluationFormRequest addReq = new AddEvaluationFormRequest(grade, textFieldGrade.getText()......);
	    	MATClientController.getInstance().sendRequestToServer(addReq);
	    }

	  


	   /* private int grade;
		private String comment;
		private Date date;
		private int submissionNumber; //-- output
		private String fileName;
		private byte[] file;
		private int teacherId;*/
	    
	    
		public void handle(Message msg, Object obj) 
		{
			// TODO Auto-generated method stub
			if (msg instanceof AddEvaluationFormResponse) 
			{
				AddEvaluationFormResponse res = (AddEvaluationFormResponse)msg;
				
				if (res.isSucceed()) 
				{
				
					Prompt.alert(1,"Checked file and evaluation form were added successfully ");
					
				} else {
					System.out.println("Server response:" + res.getErrText());
				}
				
			}
			
		}


		public void initialize(URL location, ResourceBundle resources) 
		{
			// TODO Auto-generated method stub
			
		}
		
		  
	    @FXML
	    void initialize() 
	    {
	    	
	    }
}





   
        

