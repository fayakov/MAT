package controller;


	import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassCoursesStatsRequest;
import communication.GetClassCoursesStatsResponse;
import communication.GetClassDataRequest;
import communication.GetClassDataResponse;
import communication.GetClassTeachersStatsResponse;
import communication.GetStudentDataRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import entities.CourseWithGrade;
import entities.TeacherWithGrade;
import javafx.application.Platform;
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
import javafx.stage.StageStyle;
import utils.Handler;

public class StatisticClassAndCoursesController implements Initializable, Handler {
	

	public StatisticClassAndCoursesController(){
		Dispatcher.addHandler(GetClassCoursesStatsResponse.class.getCanonicalName(), this);
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
					    

					    GetClassCoursesStatsRequest ClassData = new GetClassCoursesStatsRequest(clid);
						 MATClientController.getInstance().sendRequestToServer(ClassData);
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		    	// 	Pane root = FXMLLoader.load(getClass().getResource("/gui/HistogranClassAndCourses.fxml"));
				//	Scene scene = new Scene(root);
				//	Stage primaryStage = new Stage();
				//	primaryStage.setScene(scene);
				//	primaryStage.show();
					}		
		          		    			 
		    	  }
		    
	    		    	
	    
	    
	    @FXML
	    void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }



	    
	    
	    

		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			if (msg instanceof GetClassCoursesStatsResponse) {
				GetClassCoursesStatsResponse res = (GetClassCoursesStatsResponse)msg;
				if(res.getStats() == null)
					Prompt.alert(3, "class is not exist");
				else{
					
				ArrayList<CourseWithGrade> arr = res.getStats();
				statisticsCorses(arr);
				}
				Platform.runLater(new Runnable() {
					
					@Override
					public void run() {

				    	Pane root;
						try {
							root = FXMLLoader.load(getClass().getResource("/gui/HistogranClassAndCourses.fxml"));
							Scene scene = new Scene(root);
							Stage primaryStage = new Stage();
							primaryStage.setScene(scene);
							primaryStage.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
								
					}
				});
				

			
		}


		}

		private void statisticsCorses(ArrayList<CourseWithGrade> arr) {
			// TODO Auto-generated method stub

	    	Platform.runLater(new Runnable() {
				
	    		public void run() {
	    		FXMLLoader loader = new FXMLLoader(
	        		    getClass().getResource(
	        		      "/gui/HistogranClassAndCourses.fxml"
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

	        		  HistogramClassAndCoursesController controller = 
	        		    loader.<HistogramClassAndCoursesController>getController();
	        		  
	        		  controller.initData(arr);

	        		  stage.show();
	    		}
	    	});
	    }
			
			
		}




		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	}


