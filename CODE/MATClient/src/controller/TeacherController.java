package controller;

import java.io.IOException;
import java.util.ArrayList;
import communication.Dispatcher;
import communication.GetAssignmentsOfStudentRequest;
import communication.GetAssignmentsOfStudentResponse;
import communication.GetAssignmentsOfTeacherRequest;
import communication.GetAssignmentsOfTeacherResponse;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import entities.Assignment;
import entities.Student;
import entities.Submission;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Handler;

/**
 * The Class TeacherController.
 */
public class TeacherController implements Handler
{
	/** The user ID. */
	private int userID = 124;
	
	/** The list T. */
	ObservableList<String> listT ;
	
	/** The combo choose option teacher. */
	@FXML
    private ComboBox<String> comboChooseOptionTeacher;

    /** The Label teacher menu. */
    @FXML
    private Label LabelTeacherMenu;

    /** The button send teacher menu. */
    @FXML
    private Button buttonSendTeacherMenu;

    
    /**
     * Instantiates a new teacher controller.
     */
    public TeacherController() 
    {
		super();
		Dispatcher.addHandler(GetAssignmentsOfTeacherResponse.class.getCanonicalName(), this);
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
     * Define assignment.
     *
     * @throws Exception the exception
     */
    void defineAssignment() throws Exception 
    {
        	
        	Pane root = FXMLLoader.load(getClass().getResource("/gui/DefineAssignment.fxml"));
    		Scene scene = new Scene(root);
    		Stage primaryStage = new Stage();
    		primaryStage.setScene(scene);
    		primaryStage.show();
        }

    /**
     * Check assignment.
     *
     * @throws Exception the exception
     */
    void checkAssignment() throws Exception 
    {
    	GetAssignmentsOfTeacherRequest getAssignmentsOfTeacherRequest = new GetAssignmentsOfTeacherRequest(userID);
		MATClientController.getInstance().sendRequestToServer(getAssignmentsOfTeacherRequest);
        	
        	//Pane root = FXMLLoader.load(getClass().getResource("/gui/SubmissionsOfStudents.fxml"));
    		//Scene scene = new Scene(root);
    		//Stage primaryStage = new Stage();
    		//primaryStage.setScene(scene);
    		//primaryStage.show();
        }
    
    /**
     * Send teacher menu.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    void sendTeacherMenu(ActionEvent event) throws Exception 
    {
    	String option = comboChooseOptionTeacher.getValue().toString();
    	if(option.equalsIgnoreCase("Define Assignment"))
    		defineAssignment();	
    	if(option.equalsIgnoreCase("Show Submission Of Student"))
    		checkAssignment();
    }
    
    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    public void start(Stage primaryStage) throws Exception 
    {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/TeacherMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}   
    
    /**
     * Initialize.
     */
    @FXML
    void initialize() 
    {
        ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Define Assignment");
      	options.add("Show Submission Of Student"); 
      	
		listT = FXCollections.observableArrayList(options);
		comboChooseOptionTeacher.setItems(listT);
       
    }
    
    /* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	@Override
	public void handle(Message msg, Object obj) 
	{
		if (msg instanceof GetAssignmentsOfTeacherResponse) {
			GetAssignmentsOfTeacherResponse res = (GetAssignmentsOfTeacherResponse)msg;
			if (res.getSubsTeaCheck() != null) {
				ArrayList<Submission> submissions = res.getSubsTeaCheck().getSubmissionList();
				
				runSubmissionsForm(submissions);
			}
		}
	}
	
	
	/**
	 * Run submissions form.
	 *
	 * @param submissions the submissions
	 */
	private void runSubmissionsForm(final ArrayList<Submission> submissions) {
		Platform.runLater(new Runnable() {
			
			public void run() {
			FXMLLoader loader = new FXMLLoader(
				    getClass().getResource(
				      "/gui/SubmissionsOfStudents.fxml"
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

				  SubmissionStudentController controller = 
				    loader.<SubmissionStudentController>getController();
				  
				  controller.initData(submissions);

				  stage.show();
			}
		});
	}
	
}







    


