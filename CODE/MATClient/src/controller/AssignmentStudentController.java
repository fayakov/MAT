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
import entities.Request;
import entities.Student;
import entities.StudentCourse;
import entities.StudentCourseAssignment;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class AssignmentStudentController implements Initializable, Handler
{
	public AssignmentStudentController()
	{
		Dispatcher.addHandler(GetAssignmentsOfStudentResponse.class.getCanonicalName(), this);
	}
	
	public void initData(ArrayList<Assignment> assignments) {
		if (assignments == null)
			return;
		
		data.clear();
		
		for (Assignment assignment : assignments) {
			data.add(assignment);
		}
	}
	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML
    private Label labelMyAssignment;
    @FXML
    private TableView<Assignment> tableView;
    @FXML
    private TableColumn<Assignment,Integer > colTeaID;
    @FXML
    private TableColumn<Assignment, String> colCourse;
    @FXML
    private TableColumn<Assignment,Integer> colAssNum;
    @FXML
    private TableColumn<Assignment, String> colDate;
    
    @FXML
    private Button buttonNext;
    
    
    @FXML 
    ObservableList<Assignment> data= FXCollections.observableArrayList();


    public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		
		//GetAssignmentsOfStudentRequest GetAssignmentsOfStudentReq = new GetAssignmentsOfStudentRequest(userIdStr);//need id
    	//MATClientController.getInstance().sendRequestToServer(GetAssignmentsOfStudentReq);
		
		colDate.setCellValueFactory(new PropertyValueFactory<Assignment, String>("date"));
		colAssNum.setCellValueFactory(new PropertyValueFactory<Assignment, Integer>("assignmentNumber"));
		colTeaID.setCellValueFactory(new PropertyValueFactory<Assignment, Integer>("teacherId"));
		colCourse.setCellValueFactory(new PropertyValueFactory<Assignment,String>("courseName"));
    	
		
		tableView.setItems(data);
	}
    
    
    @FXML
    void pressNext(ActionEvent event) 
    {
    /*	Pane root = FXMLLoader.load(getClass().getResource("/gui/OpenAndSubmitAssigmentByStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();*/
    }
    
 
  
	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof GetAssignmentsOfStudentResponse) 
		{
			GetAssignmentsOfStudentResponse res = (GetAssignmentsOfStudentResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				ArrayList<Assignment> temp=res.getStuCourseAss().getAssignments();
				for(Assignment t: temp )
				{
					//data =FXCollections.observableArrayList(t);
				}
				
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
		
	}


}






    








    


