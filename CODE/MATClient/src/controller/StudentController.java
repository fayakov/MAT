package controller;

import java.io.IOException;
import java.util.ArrayList;
import communication.Dispatcher;
import communication.GetAssignmentsOfStudentRequest;
import communication.GetAssignmentsOfStudentResponse;
import communication.GetPendingRequestsRequest;
import communication.GetPendingRequestsResponse;
import communication.GetStudentDataByUserIDRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import entities.Assignment;
import entities.Student;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Handler;

/**
 * The Class StudentController.
 */
public class StudentController implements Handler
{
	
	/** The list. */
	ObservableList<String> list ;
	
	/** The user ID. */
	private int userID = 124;

    /** The option combo. */
    @FXML
    private ComboBox<String> optionCombo;
    
    
    /**
     * Instantiates a new student controller.
     */
    public StudentController() 
    {
		super();
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
		Dispatcher.addHandler(GetAssignmentsOfStudentResponse.class.getCanonicalName(), this);
	}
    
    /**
     * Inits the data.
     *
     * @param userId the user id
     */
    public void initData(int userId) {
    	this.userID = userId;
    }

	/**
	 * Student data 1.
	 *
	 * @throws Exception the exception
	 */
	public void studentData1() throws Exception 
    {
    	GetStudentDataByUserIDRequest getStudentDataRequest = new GetStudentDataByUserIDRequest(userID);
		MATClientController.getInstance().sendRequestToServer(getStudentDataRequest);   
    }
    
    /**
     * Assignment.
     *
     * @throws Exception the exception
     */
    public void assignment() throws Exception 
    {
    	GetAssignmentsOfStudentRequest getAssignmentsOfStudentRequest = new GetAssignmentsOfStudentRequest(userID);
		MATClientController.getInstance().sendRequestToServer(getAssignmentsOfStudentRequest);
    }
    
    
    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    public void start(Stage primaryStage) throws Exception 
    {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/StudentMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}   
    
    /**
     * Student info.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    public void StudentInfo(ActionEvent event) throws Exception 
    {
    	
	String option = optionCombo.getValue().toString();
    	if(option.equalsIgnoreCase("Student Data"))
    		studentData1();	
    	if(option.equalsIgnoreCase("Assignment"))
    		assignment();
    }

    /**
     * Initialize.
     */
    @FXML
    void initialize() 
    {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Student Data");
      	options.add("Assignment"); 
			
		list = FXCollections.observableArrayList(options);
		optionCombo.setItems(list);

    }



	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	@Override
	public void handle(Message msg, Object obj) 
	{
		if (msg instanceof GetStudentDataResponse) {
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			Student student = res.getStudentData();
			
			runStudentDataForm(student);
		} else if (msg instanceof GetAssignmentsOfStudentResponse) {
			GetAssignmentsOfStudentResponse res = (GetAssignmentsOfStudentResponse)msg;
			if (res.getStuCourseAss() != null) {
				ArrayList<Assignment> assignments = res.getStuCourseAss().getAssignments();
				
				runAssignmentsForm(assignments);
			}
		}
	}

	/**
	 * Run student data form.
	 *
	 * @param student the student
	 */
	private void runStudentDataForm(final Student student) {
		Platform.runLater(new Runnable() {
			
			public void run() {
			FXMLLoader loader = new FXMLLoader(
				    getClass().getResource(
				      "/gui/StudentData.fxml"
				    )
				  );

				  Stage stage = new Stage(StageStyle.DECORATED);
				  try {
					stage.setScene(
					    new Scene(
					      (Pane) loader.load()
					    )
					  );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				  StudentDataController controller = 
				    loader.<StudentDataController>getController();
				  
				  controller.initData(student);

				  stage.show();
			}
		});
	}
	
	/**
	 * Run assignments form.
	 *
	 * @param assignments the assignments
	 */
	private void runAssignmentsForm(final ArrayList<Assignment> assignments) {
		Platform.runLater(new Runnable() {
			
			public void run() {
			FXMLLoader loader = new FXMLLoader(
				    getClass().getResource(
				      "/gui/AssignmentStudentController.fxml"
				    )
				  );

				  Stage stage = new Stage(StageStyle.DECORATED);
				  try {
					stage.setScene(
					    new Scene(
					      (Pane) loader.load()
					    )
					  );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				  AssignmentStudentController controller = 
				    loader.<AssignmentStudentController>getController();
				  
				  controller.initData(assignments);

				  stage.show();
			}
		});
	}
}
