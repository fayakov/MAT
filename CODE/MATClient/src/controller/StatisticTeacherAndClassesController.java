package controller;

 import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassDataRequest;
import communication.GetClassDataResponse;
import communication.GetTeacherDataRequest;
import communication.GetTeacherDataResponse;
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



public class StatisticTeacherAndClassesController implements Initializable, Handler {
	
	public StatisticTeacherAndClassesController(){
		Dispatcher.addHandler(GetTeacherDataResponse.class.getCanonicalName(), this);
	}
		private int tid;

	    @FXML
	    private TextField TeacherID;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticTeacherAndClasses(ActionEvent event) throws Exception {
	    	
	    	 if(TeacherID.getText().isEmpty()) 
				 	Prompt.alert(3,"please enter teacher Id");		    	
		     else {  	
		    		
		    	 try {
					    tid = Integer.parseInt(TeacherID.getText());
					    
					    GetTeacherDataRequest TeacherData = new GetTeacherDataRequest(tid);
						 MATClientController.getInstance().sendRequestToServer(TeacherData);
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		    	 
		    	 	Pane root = FXMLLoader.load(getClass().getResource("/gui/HistogramTeachrAndClass.fxml"));
					Scene scene = new Scene(root);
					Stage primaryStage = new Stage();
					primaryStage.setScene(scene);
					primaryStage.show();
		     	}		
		     }	    			 
	    
	    
	    @FXML
	    void closeStatisticTeacherAndClasses(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }


		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			
		}


		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	

