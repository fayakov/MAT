package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetAssignmentsOfStudentResponse;
import communication.GetAssignmentsOfTeacherRequest;
import communication.GetAssignmentsOfTeacherResponse;
import communication.Message;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.Handler;


public class SubmissionStudentController implements Initializable, Handler
{
	ObservableList<String> list ;
	
	public SubmissionStudentController()
	{
		Dispatcher.addHandler(GetAssignmentsOfTeacherRequest.class.getCanonicalName(), this);
	}
	
	
	ObservableList<String> listAss;
	
	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Label labelListOfStuSub;

	    @FXML
	    private Button buttonNext;

	    @FXML
	    private ComboBox<String> comboChooseSub;

	    
	    @FXML
	    void nextStudentSubmission(ActionEvent event) throws Exception 
	    {
	    	String option = comboChooseSub.getValue().toString();
	    	//int assNum = Integer.parseInt(option); //save the option to next window
	    	
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/CheckAssinment.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
	    }
	    
	    
    @FXML
    void initialize() 
    {
 
    	
    	//GetAssignmentsOfTeacherRequest getAssignmentsOfTeachertReq = new GetAssignmentsOfTeacherRequest(userIdStr);//need id
    	//MATClientController.getInstance().sendRequestToServer(getAssignmentsOfTeachertReq);
        
    }

	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
ArrayList<String> assignments = new ArrayList<String>();
		
		if (msg instanceof GetAssignmentsOfTeacherResponse) 
		{
			GetAssignmentsOfTeacherResponse res = (GetAssignmentsOfTeacherResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				int len=res.getListOfStudenstSubmissions().size();
				for(int i = 0 ; i < len ; i++)
				{
				Integer intAss =(Integer) res.getListOfStudenstSubmissions().get(i);
				String strSubID = Integer.toString(intAss);
				assignments.add(strSubID);
				}
				
				list = FXCollections.observableArrayList(assignments);
				comboChooseSub.setItems(list);
				
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
		
	}

	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		
		
	}
}








   











    

