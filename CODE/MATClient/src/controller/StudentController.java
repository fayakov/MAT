package controller;

import java.io.IOException;
import java.util.ArrayList;

import communication.Dispatcher;
import communication.GetPendingRequestsRequest;
import communication.GetPendingRequestsResponse;
import communication.GetStudentDataRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
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

public class StudentController implements Handler
{
	ObservableList<String> list ;
	private int userID = 124;

    @FXML
    private ComboBox<String> optionCombo;
    
    
    
    public StudentController() {
		super();
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}



	public void studentData1() throws Exception 
    {
    	GetStudentDataRequest getStudentDataRequest = new GetStudentDataRequest(userID);
		MATClientController.getInstance().sendRequestToServer(getStudentDataRequest);   
    }
    

    
    public void assignment() throws Exception 
    {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/AssignmentsStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    public void start(Stage primaryStage) throws Exception 
    {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/StudentMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}   
    
    @FXML
    public void StudentInfo(ActionEvent event) throws Exception 
    {
    	
	String option = optionCombo.getValue().toString();
    	if(option.equalsIgnoreCase("Student Data"))
    		studentData1();	
    	if(option.equalsIgnoreCase("Assignment"))
    		assignment();
    }

    @FXML
    void initialize() 
    {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Student Data");
      	options.add("Assignment"); 
			
		list = FXCollections.observableArrayList(options);
		optionCombo.setItems(list);

    }



	@Override
	public void handle(Message msg, Object obj) {
		if (msg instanceof GetStudentDataResponse) {
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			Student student = res.getStudentData();
			
			runStudentDataForm(student);
		}
	}

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
}
