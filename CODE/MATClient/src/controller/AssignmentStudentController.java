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
import javafx.stage.StageStyle;
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


/**
 * The Class AssignmentStudentController.
 */
public class AssignmentStudentController implements Initializable, Handler
{
	
	int userId;
	
	/**
	 * Instantiates a new assignment student controller.
	 */
	public AssignmentStudentController()
	{
		Dispatcher.addHandler(GetAssignmentsOfStudentResponse.class.getCanonicalName(), this);
	}
	
	/**
	 * Inits the data.
	 *
	 * @param assignments the assignments
	 */
	public void initData(ArrayList<Assignment> assignments, int userId) {
		if (assignments == null)
			return;
		
		data.clear();
		
		for (Assignment assignment : assignments) {
			data.add(assignment);
		}
		
		this.userId = userId;
	}
	
	/** The resources. */
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    
    /** The location. */
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    /** The label my assignment. */
    @FXML
    private Label labelMyAssignment;
    
    /** The table view. */
    @FXML
    private TableView<Assignment> tableView;
    
    /** The col tea ID. */
    @FXML
    private TableColumn<Assignment,Integer > colTeaID;
    
    /** The col course. */
    @FXML
    private TableColumn<Assignment, String> colCourse;
    
    /** The col ass num. */
    @FXML
    private TableColumn<Assignment,Integer> colAssNum;
    
    /** The col date. */
    @FXML
    private TableColumn<Assignment, String> colDate;
    
    /** The button next. */
    @FXML
    private Button buttonNext;
    
    
    /** The data. */
    @FXML 
    ObservableList<Assignment> data= FXCollections.observableArrayList();


    /* (non-Javadoc)
     * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
     */
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
    
    
    /**
     * Press next.
     *
     * @param event the event
     */
    @FXML
    void pressNext(ActionEvent event) 
    {
    	Assignment assignment = tableView.getSelectionModel().getSelectedItem();
    	if (assignment == null) return;
    	
    	FXMLLoader loader = new FXMLLoader(
				getClass().getResource(
						"/gui/OpenAndSubmitAssigmentByStudent.fxml"));
		
		Stage stage = new Stage(StageStyle.DECORATED);
		try {
			stage.setScene(
					new Scene(
							(Pane) loader.load()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		OpenAndSubmitAssignmentByStudentController controller =
				loader.<OpenAndSubmitAssignmentByStudentController>getController();
		
		controller.initData(assignment, this.userId);
		
		stage.show();
		
    }
    
 
  
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
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






    








    


