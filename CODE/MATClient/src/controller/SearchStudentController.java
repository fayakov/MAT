package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetParentDataRequest;
import communication.GetParentDataResponse;
import communication.GetPendingRequestsResponse;
import communication.GetStudentDataRequest;
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

public class SearchStudentController implements Initializable, Handler {
	
	
	public SearchStudentController(){
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}
	private int sid;

    @FXML
    private Button closebtn;
    
    @FXML
    private TextField studentId;

    @FXML
    void send(ActionEvent event) throws Exception {
    	
    	
    	
    	
    	if(studentId.getText().isEmpty()) 
		 	Prompt.alert(3,"please enter Student Id");		    	
    	else {  		    		
    		try {
			    sid = Integer.parseInt(studentId.getText());
		    	
			    
			    GetStudentDataRequest StudentData = new GetStudentDataRequest(sid);
    			MATClientController.getInstance().sendRequestToServer(StudentData);
    			
		    	} catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return;
		    	}  	
    		Pane root = FXMLLoader.load(getClass().getResource("/gui/StudentData.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
			}		

    }

    @FXML
    void close(ActionEvent event) {
    	 Stage stage = (Stage) closebtn.getScene().getWindow();
 	    stage.close();

    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof GetStudentDataResponse) {
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			if(res.getStudentData() == null)
				Prompt.alert(3,"Student is not exist");
			else
				showStudentData(res.getStudentData());
				
				
				
			
		}
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

    
    private void showStudentData(final Student stu ) {

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
        		  
        		  controller.initData(stu);

        		  stage.show();
    		}
    	});
    }
    

	
	
	
}
