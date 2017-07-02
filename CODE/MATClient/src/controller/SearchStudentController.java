package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetParentDataRequest;
import communication.GetParentDataResponse;
import communication.GetPendingRequestsResponse;
import communication.GetStudentDataByStudentIDRequest;
import communication.GetStudentDataByUserIDRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import entities.Request;
import entities.Student;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Handler;

/**
 * The Class SearchStudentController.
 */
public class SearchStudentController implements Initializable, Handler {
	
	
	/**
	 * Instantiates a new search student controller.
	 */
	public SearchStudentController(){
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}
	
	/** The sid. */
	private int sid;

    /** The closebtn. */
    @FXML
    private Button closebtn;
    
    /** The student id. */
    @FXML
    private TextField studentId;

    /**
     * Send.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    void send(ActionEvent event) throws Exception {
    	
    	
    	
    	
    	if(studentId.getText().isEmpty()) 
		 	Prompt.alert(3,"please enter Student Id");		    	
    	else {  		    		
    		try {
			    sid = Integer.parseInt(studentId.getText());
			    
			    GetStudentDataByStudentIDRequest StudentData = new GetStudentDataByStudentIDRequest(sid);
    			MATClientController.getInstance().sendRequestToServer(StudentData);
    			
		    	} catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return;
		    	}  	
    //		Pane root = FXMLLoader.load(getClass().getResource("/gui/StudentData.fxml"));
		//	Scene scene = new Scene(root);
			//Stage primaryStage = new Stage();
		//	primaryStage.setScene(scene);
	//		primaryStage.show();
			}		

    }

    /**
     * Close.
     *
     * @param event the event
     */
    @FXML
    void close(ActionEvent event) {
    	 Stage stage = (Stage) closebtn.getScene().getWindow();
 	    stage.close();

    }
    
	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
    
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	@Override
	public void handle(Message msg, Object obj) {
		if (msg instanceof GetStudentDataResponse) {
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			Student student = res.getStudentData();
			
			runStudentDataForm(student);
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
}
