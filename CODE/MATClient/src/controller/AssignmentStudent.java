package controller;

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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetAssignmentsOfStudentRequest;
import communication.GetAssignmentsOfStudentResponse;
import communication.GetStudentDataResponse;
import communication.LoginResponseMsg;
import communication.MATClientController;
import communication.Message;
import entities.Assignment;
import entities.Student;


public class AssignmentStudent implements Initializable, Handler
{
	ObservableList<String> list ;
	
	
	public AssignmentStudent()
	{
		Dispatcher.addHandler(GetAssignmentsOfStudentResponse.class.getCanonicalName(), this);
	}
	
	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
	
	@FXML
    private Label labelMyAssignment;

    @FXML
    private ComboBox<String> comboChooseAssignment;

    @FXML
    private Button ButtonAssignmentNext;

    
    @FXML
    void AssignmentNext(ActionEvent event) throws IOException 
    {
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/OpenAndSubmitAssigmentByStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    @FXML 
    void initialize() 
    {
    	//GetAssignmentsOfStudentRequest GetAssignmentsOfStudentReq = new GetAssignmentsOfStudentRequest(userIdStr);//need id
    	//MATClientController.getInstance().sendRequestToServer(GetAssignmentsOfStudentReq);
    
    }


	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
	/*	if (msg instanceof GetStudentDataResponse) 
		{
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			if (res.isRequestSecceded()) 
			{
				
				String strStudentID = Integer.toString(res.getStudentData().getId());
				textStudentID.setText(strStudentID);
				
		    	
		    	
		    	ArrayList<String> options = new ArrayList<String>();
		    	options= res.getStudentData().getCourse();
				list = FXCollections.observableArrayList(options);
				comboChooseAssignment.setItems(list);
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}  */
		
	
		
	}


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}






    








    


