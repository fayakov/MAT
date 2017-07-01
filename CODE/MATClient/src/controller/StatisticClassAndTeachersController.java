package controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassDataRequest;
import communication.GetClassDataResponse;
import communication.GetClassTeachersStatsRequest;
import communication.GetClassTeachersStatsResponse;
import communication.LoginResponseMsg;
import communication.MATClientController;
import communication.Message;
import entities.TeacherWithGrade;
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
		Dispatcher.addHandler(GetClassTeachersStatsResponse.class.getCanonicalName(), this);
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
					    
					    GetClassTeachersStatsRequest ClassData = new GetClassTeachersStatsRequest(clid);
					    MATClientController.getInstance().sendRequestToServer(ClassData);
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}
					}		
		     }	    			 
	    
	    
	    @FXML
	    void closeStatisticClassAndTeachers(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }


		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			if (msg instanceof GetClassTeachersStatsResponse) {
				GetClassTeachersStatsResponse res = (GetClassTeachersStatsResponse)msg;
				ArrayList<TeacherWithGrade> arr = res.getStats();
				
				
				
				
				
				
				
				if( arr.size() == 0) {
					// PopUp
					;
				}
				else{
//					((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
					Stage primaryStage = new Stage();
					FXMLLoader loader = new FXMLLoader();
					Pane root;
					try {
						root = loader.load(getClass().getResource("/gui/HistogramClassAndTeachers.fxml").openStream());
						Scene scene = new Scene(root);			
						scene.getStylesheets().add(getClass().getResource("/gui/HistogramClassAndTeachers.fxml").toExternalForm());
						
						primaryStage.setScene(scene);		
						primaryStage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					StatisticClassAndTeachersController StatisticClassAndTeachers = loader.getController();		
					//StatisticClassAndTeachersController.loadStudent(Test.students.get(itemIndex));
					
					 
					
					
				}
					
			
				//con.setDisplayArr(arr);
			}
			
		}


		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	}

