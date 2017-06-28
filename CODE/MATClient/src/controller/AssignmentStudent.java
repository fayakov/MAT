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
	public static int choosenAss=88;
	
	
	
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
    	String choosenAssStr = comboChooseAssignment.getValue().toString();
    	choosenAss = Integer.parseInt(choosenAssStr);
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/OpenAndSubmitAssigmentByStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    @FXML 
    void initialize() 
    {
    }


	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> assignments = new ArrayList<String>();
		
		if (msg instanceof GetAssignmentsOfStudentResponse) 
		{
			GetAssignmentsOfStudentResponse res = (GetAssignmentsOfStudentResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				int len=res.getListOfStudentAssignment().size();
				for(int i = 0 ; i < len ; i++)
				{
				Integer intAss =(Integer) res.getListOfStudentAssignment().get(i);
				String strStudentID = Integer.toString(intAss);
				assignments.add(strStudentID);
				}
				
				list = FXCollections.observableArrayList(assignments);
				comboChooseAssignment.setItems(list);
				
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
		
	}


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//GetAssignmentsOfStudentRequest GetAssignmentsOfStudentReq = new GetAssignmentsOfStudentRequest(userIdStr);//need id
    	//MATClientController.getInstance().sendRequestToServer(GetAssignmentsOfStudentReq);
	}


	public static int getChoosenAss() {
		return choosenAss;
	}


	public void setChoosenAss(int choosenAss) {
		this.choosenAss = choosenAss;
	}

}






    








    


