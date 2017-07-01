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
import utils.Handler;

public class RequestPrincipalController implements Handler {
	
	ObservableList<String> list ;

	String selectedOption;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClose;

    @FXML
    private ComboBox<String> requestComboBox;
    
    
    public RequestPrincipalController() {
  		super();
  		Dispatcher.addHandler(GetPendingRequestsResponse.class.getCanonicalName(), this);
  	}
    
    
    private void responseChangeTeacher(final ArrayList<Request> requests) {
		Platform.runLater(new Runnable() {
			ArrayList<Request> requestsToShow = requests;
			public void run() {
			// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader();
					Pane root = loader.load(getClass().getResource("/gui/ResponseChangeTeacher.fxml"));
				
					ResponseAddStudentToCourseController cont = loader.getController();
				
					cont.setAllRequests(requestsToShow);
				
					Scene scene = new Scene(root);
					Stage primaryStage = new Stage();
					primaryStage.setScene(scene);
					primaryStage.show();
				
				} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
	} );
}
   

	private void responseRemoveStudentFromCourse(final ArrayList<Request> requests) {
    	
		Platform.runLater(new Runnable() {
			ArrayList<Request> requestsToShow = requests;
			public void run() {
			// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader();
					Pane root = loader.load(getClass().getResource("/gui/ResponseRemoveStudentFromCourse.fxml"));
				
					ResponseAddStudentToCourseController cont = loader.getController();
				
					cont.setAllRequests(requestsToShow);
				
					Scene scene = new Scene(root);
					Stage primaryStage = new Stage();
					primaryStage.setScene(scene);
					primaryStage.show();
				
				} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
	} );
}
    
    private void responseAddStudentToCourse(final ArrayList<Request> requests) {
		
		Platform.runLater(new Runnable() {
			ArrayList<Request> requestsToShow = requests;
			public void run() {
				// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader();
					Pane root = loader.load(getClass().getResource("/gui/ResponseAddStudentToCourse.fxml"));
					
					ResponseAddStudentToCourseController cont = loader.getController();
					
					cont.setAllRequests(requestsToShow);
					
					Scene scene = new Scene(root);
					Stage primaryStage = new Stage();
					primaryStage.setScene(scene);
					primaryStage.show();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} );
    }
    
    
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/RequestPrincipal.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    

    @FXML
    void send(ActionEvent event) throws Exception{
    	
    	selectedOption = requestComboBox.getValue().toString();
    	
    	GetPendingRequestsRequest pendigreq= new GetPendingRequestsRequest();
		MATClientController.getInstance().sendRequestToServer(pendigreq);    	
    }

    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();

    }

    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Add student to course");
      	options.add("Remove student from course"); 
      	options.add("Change teacher"); 
      	
		
		list = FXCollections.observableArrayList(options);
		requestComboBox.setItems(list);

    }


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
