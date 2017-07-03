package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetAssignmentsOfStudentResponse;
import communication.GetAssignmentsOfTeacherRequest;
import communication.GetAssignmentsOfTeacherResponse;
import communication.MATClientController;
import communication.Message;
import entities.Assignment;
import entities.StudentCourse;
import entities.Submission;
import entities.SubmissionsForTeacherCheck;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.Handler;


/**
 * The Class SubmissionStudentController.
 */
public class SubmissionStudentController implements Initializable, Handler
{
	
	/**
	 * Instantiates a new submission student controller.
	 */
	public SubmissionStudentController()
	{
		Dispatcher.addHandler(GetAssignmentsOfTeacherResponse.class.getCanonicalName(), this);
	}
	
	
	/**
	 * Inits the data.
	 *
	 * @param submissions the submissions
	 */
	public void initData(ArrayList<Submission> submissions) {
		if (submissions == null)
			return;
		
		data.clear();
		
		for (Submission submission : submissions) {
			data.add(submission);
		}
	}
	
	
	
	 /** The resources. */
 	@FXML
	    private ResourceBundle resources;

	    /** The location. */
    	@FXML
	    private URL location;

	    /** The col stu ID. */
    	@FXML
	    private TableColumn<Submission, Integer> colStuID;

	    /** The label list of stu sub. */
    	@FXML
	    private Label labelListOfStuSub;

	    /** The col ass num. */
    	@FXML
	    private TableColumn<Submission, Integer> colAssNum;

	    /** The col sub num. */
    	@FXML
	    private TableColumn<Submission, Integer> colSubNum;

	    /** The col sub date. */
    	@FXML
	    private TableColumn<Submission, Date> colSubDate;

    	/** The data. */
        @FXML 
        ObservableList<Submission> data = FXCollections.observableArrayList();
    	
        @FXML
        private TableView<Submission> tableView;
        
        @FXML
        private Button buttonNext;
        
        /* (non-Javadoc)
    	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
    	 */
    	public void initialize(URL arg0, ResourceBundle arg1) 
    	{
    		// TODO Auto-generated method stub
    		colAssNum.setCellValueFactory(new PropertyValueFactory<Submission, Integer>("assignmentNumber"));
        	colSubNum.setCellValueFactory(new PropertyValueFactory<Submission, Integer>("submissionNumber"));
        	colStuID.setCellValueFactory(new PropertyValueFactory<Submission, Integer>("studentId"));
        	colSubDate.setCellValueFactory(new PropertyValueFactory<Submission, Date>("date"));
        	
        	tableView.setItems(data);
        	
        	//GetAssignmentsOfTeacherRequest getAssignmentsOfTeachertReq = new GetAssignmentsOfTeacherRequest(userIdStr);//need id
        	//MATClientController.getInstance().sendRequestToServer(getAssignmentsOfTeachertReq);
    	}
	    
        
    	/**
    	 * Next 
    	 *
    	 * @param event the event
    	 * @throws Exception the exception
    	 */
    	 @FXML
    	    void next(ActionEvent event) throws Exception
    	 {
    		 Pane root = FXMLLoader.load(getClass().getResource("/gui/CheckAssinment.fxml"));
 			Scene scene = new Scene(root);
 			Stage primaryStage = new Stage();
 			primaryStage.setScene(scene);
 			primaryStage.show();
    	    }
    	
    	

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) 
	{
//		// TODO Auto-generated method stub
//     ArrayList<String> assignments = new ArrayList<String>();
//		
//		if (msg instanceof GetAssignmentsOfTeacherResponse) 
//		{
//			GetAssignmentsOfTeacherResponse res = (GetAssignmentsOfTeacherResponse)msg;
//			
//			if (res.isRequestSecceded()) 
//			{
//				ArrayList<Submission> temp=res.getSubsTeaCheck().getSubmissionList();
//				for(Submission t: temp )
//				{
//					data =FXCollections.observableArrayList(t);
//				}
//				
//				
//			} else {
//				System.out.println("Server response:" + res.getErrText());
//			}
//			
//		}
		
	}
}








   











    

