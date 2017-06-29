package controller;


	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassDataRequest;
import communication.GetClassDataResponse;
import communication.GetStudentDataRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
	import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.Handler;

public class StatisticClassAndCoursesController implements Initializable, Handler {
	

	public StatisticClassAndCoursesController(){
		Dispatcher.addHandler(GetClassDataResponse.class.getCanonicalName(), this);
	}
	
		private int clid;

	    @FXML
	    private TextField classNumber;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticClassAndCourses(ActionEvent event) throws Exception {
	    	
	    	 if(classNumber.getText().isEmpty()) 
				 	Prompt.alert(3,"please enter class number");		    	
		     else {  	
		    		
		    	 try {
					    clid = Integer.parseInt(classNumber.getText());
					    

						 GetClassDataRequest ClassData = new GetClassDataRequest(clid);
						 MATClientController.getInstance().sendRequestToServer(ClassData);
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		    	 	Pane root = FXMLLoader.load(getClass().getResource("/gui/HistogranClassAndCourses.fxml"));
					Scene scene = new Scene(root);
					Stage primaryStage = new Stage();
					primaryStage.setScene(scene);
					primaryStage.show();
					}		
		          		    			 
		    	  }
		    
	    		    	
	    
	    
	    @FXML
	    void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }




		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			
		}




		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	}


