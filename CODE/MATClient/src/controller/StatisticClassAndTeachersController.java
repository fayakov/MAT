package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassDataRequest;
import communication.GetClassDataResponse;
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


public class StatisticClassAndTeachersController implements Initializable, Handler {
	
	public StatisticClassAndTeachersController(){
		Dispatcher.addHandler(GetClassDataResponse.class.getCanonicalName(), this);
	}
	
		private int clid;

	    @FXML
	    private TextField ClassNumber;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticClassAndTeachers(ActionEvent event) throws Exception {
	    	
	    	 if(ClassNumber.getText().isEmpty()) 
				 	Prompt.alert(3,"please enter class number");		    	
		     else {  	
		    		
		    	 try {
					    clid = Integer.parseInt(ClassNumber.getText());
					    
					    GetClassDataRequest ClassData = new GetClassDataRequest(clid);
						 MATClientController.getInstance().sendRequestToServer(ClassData);
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}
		    	 	Pane root = FXMLLoader.load(getClass().getResource("/gui/HistogramClassAndTeachers.fxml"));
					Scene scene = new Scene(root);
					Stage primaryStage = new Stage();
					primaryStage.setScene(scene);
					primaryStage.show();
					}		
		     }	    			 
	    
	    
	    @FXML
	    void closeStatisticClassAndTeachers(ActionEvent event) {	
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

