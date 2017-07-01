package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetStudentDataByStudentIDRequest;
import communication.GetStudentDataByUserIDRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import entities.Student;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Handler;


public class ParentController implements Initializable, Handler  {
	
	public ParentController(){
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}
	
	
		private int sid;

	    @FXML
	    private TextField StudentID;
	    
	    @FXML
	    private Button btnClose;

	       	
	    	/*
	    	 * send to server
	    	 * check if student ID exist if student ID exist show Data Student
	    	 * */
	    	
	    	
			
	    	@FXML
	 	    void searchstudentID (ActionEvent event) throws Exception {
	    	
	    	if(StudentID.getText().isEmpty()) 
	    		Prompt.alert(3,"please enter student id");
	    		
			else {
				try {
				    sid = Integer.parseInt(StudentID.getText());
				    
			GetStudentDataByStudentIDRequest StudentData = new GetStudentDataByStudentIDRequest(sid);
			 MATClientController.getInstance().sendRequestToServer(StudentData);
	    			
			    	
			    	} catch(NumberFormatException e){
			    	Prompt.alert(3,"please enter numerical value");
			    	return;
			    	}  	
	    //	Pane root = FXMLLoader.load(getClass().getResource("/gui/StudentData.fxml"));
		//	Scene scene = new Scene(root);
		//	Stage primaryStage = new Stage();
		//	primaryStage.setScene(scene);
		//	primaryStage.show();
			}
	    }
	    	 
	   	 public void start(Stage primaryStage) throws Exception {
	    			
	   			Parent root = FXMLLoader.load(getClass().getResource("/gui/ParentMenu.fxml"));
    			Scene scene = new Scene(root);
	    		primaryStage.setScene(scene);
	    		primaryStage.show();
	    		}	 
	    
	    
	    @FXML
	    void closeParentMenu(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
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

		private void showStudentData(final Student stu) {
			// TODO Auto-generated method stub
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

		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	}

