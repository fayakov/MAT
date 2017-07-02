package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetPendingRequestsRequest;
import communication.GetPendingRequestsResponse;
import communication.MATClientController;
import communication.Message;
import entities.ERequestType;
import entities.Request;
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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Handler;

/**
 * The Class RequestPrincipalController.
 */
public class RequestPrincipalController implements Handler {
	
	/** The list. */
	ObservableList<String> list ;

	/** The selected option. */
	String selectedOption;
	
    /** The resources. */
    @FXML
    private ResourceBundle resources;

    /** The location. */
    @FXML
    private URL location;

    /** The btn close. */
    @FXML
    private Button btnClose;

    /** The request combo box. */
    @FXML
    private ComboBox<String> requestComboBox;
    
    
    /**
     * Instantiates a new request principal controller.
     */
    public RequestPrincipalController() {
  		super();
  		Dispatcher.addHandler(GetPendingRequestsResponse.class.getCanonicalName(), this);
  	}
    
    
    /**
     * Response change teacher.
     *
     * @param requests the requests
     */
    private void responseChangeTeacher(final ArrayList<Request> requests) {
    	
    	Platform.runLater(new Runnable() {
		
		public void run() {
		FXMLLoader loader = new FXMLLoader(
    		    getClass().getResource(
    		      "/gui/ResponseChangeTeacher.fxml"
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

    		  ResponseChangeTeacherController controller = 
    		    loader.<ResponseChangeTeacherController>getController();
    		  
    		  controller.initData(requests);

    		  stage.show();
		}
	});
}

	/**
	 * Response remove student from course.
	 *
	 * @param requests the requests
	 */
	private void responseRemoveStudentFromCourse(final ArrayList<Request> requests) {

	Platform.runLater(new Runnable() {
		
		public void run() {
		FXMLLoader loader = new FXMLLoader(
    		    getClass().getResource(
    		      "/gui/ResponseRemoveStudentFromCourse.fxml"
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

    		  ResponseRemoveStudentFromCourseController controller = 
    		    loader.<ResponseRemoveStudentFromCourseController>getController();
    		  
    		  controller.initData(requests);

    		  stage.show();
		}
	});
}
    
    /**
     * Response add student to course.
     *
     * @param requests the requests
     */
    private void responseAddStudentToCourse(final ArrayList<Request> requests) {

    	Platform.runLater(new Runnable() {
			
    		public void run() {
    		FXMLLoader loader = new FXMLLoader(
        		    getClass().getResource(
        		      "/gui/ResponseAddStudentToCourse.fxml"
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

        		  ResponseAddStudentToCourseController controller = 
        		    loader.<ResponseAddStudentToCourseController>getController();
        		  
        		  controller.initData(requests);

        		  stage.show();
    		}
    	});
    }
    
    
    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/RequestPrincipal.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    

    /**
     * Send.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    void send(ActionEvent event) throws Exception{
    	
    	selectedOption = requestComboBox.getValue().toString();
    	
    	GetPendingRequestsRequest pendigreq= new GetPendingRequestsRequest();
		MATClientController.getInstance().sendRequestToServer(pendigreq);    	
    }

    /**
     * Close.
     *
     * @param event the event
     */
    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();

    }

    /**
     * Initialize.
     */
    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Add student to course");
      	options.add("Remove student from course"); 
      	options.add("Change teacher"); 
      	
		
		list = FXCollections.observableArrayList(options);
		requestComboBox.setItems(list);

    }


	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof GetPendingRequestsResponse) {
			GetPendingRequestsResponse res = (GetPendingRequestsResponse)msg;
			
	    	if(selectedOption.equalsIgnoreCase("Add student to course"))
	    		responseAddStudentToCourse(res.getPendingRequests());	
	    	if(selectedOption.equalsIgnoreCase("Remove student from course"))
	    		responseRemoveStudentFromCourse(res.getPendingRequests());
	    	if(selectedOption.equalsIgnoreCase("Change teacher"))
	    		responseChangeTeacher(res.getPendingRequests());	
		}
	}
}
