package controller;

 import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassDataRequest;
import communication.GetClassDataResponse;
import communication.GetClassTeachersStatsResponse;
import communication.GetTeacherDataRequest;
import communication.GetTeacherDataResponse;
import communication.GetTeacherStatsRequest;
import communication.GetTeacherStatsResponse;
import communication.MATClientController;
import communication.Message;
import entities.ClassWithGrade;
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



/**
 * The Class StatisticTeacherAndClassesController.
 */
public class StatisticTeacherAndClassesController implements Initializable, Handler {
	
	/**
	 * Instantiates a new statistic teacher and classes controller.
	 */
	public StatisticTeacherAndClassesController(){
		Dispatcher.addHandler(GetTeacherStatsResponse.class.getCanonicalName(), this);
	}
		
		/** The tid. */
		private int tid;

	    /** The Teacher ID. */
    	@FXML
	    private TextField TeacherID;
	    
	    /** The btn close. */
    	@FXML
	    private Button btnClose;

	    /**
    	 * Statistic teacher and classes.
    	 *
    	 * @param event the event
    	 * @throws Exception the exception
    	 */
    	@FXML
	    void StatisticTeacherAndClasses(ActionEvent event) throws Exception {
	    	
	    	 if(TeacherID.getText().isEmpty()) 
				 	Prompt.alert(3,"please enter teacher Id");		    	
		     else {  	
		    		
		    	 try {
					    tid = Integer.parseInt(TeacherID.getText());
					    
					    GetTeacherStatsRequest TeacherData = new GetTeacherStatsRequest(tid);
						 MATClientController.getInstance().sendRequestToServer(TeacherData);
				    	
				    	} catch(NumberFormatException e){
				    	Prompt.alert(3,"please enter numerical value");
				    	return;
				    	}  	
		    	 
		    	 //	Pane root = FXMLLoader.load(getClass().getResource("/gui/HistogramTeachrAndClass.fxml"));
				//	Scene scene = new Scene(root);
					//Stage primaryStage = new Stage();
					//primaryStage.setScene(scene);
					//primaryStage.show();
		     	}		
		     }	    			 
	    
	    
	    /**
    	 * Close statistic teacher and classes.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void closeStatisticTeacherAndClasses(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }


		/* (non-Javadoc)
		 * @see utils.Handler#handle(communication.Message, java.lang.Object)
		 */
		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			
			if (msg instanceof GetTeacherStatsResponse) {
				GetTeacherStatsResponse res = (GetTeacherStatsResponse)msg;
				ArrayList<ClassWithGrade> arr = res.getStats();
				
				if(res.getStats() == null)
					Prompt.alert(3, "teacher is not exist");
				else{

					ArrayList<ClassWithGrade> arr = res.getStats();
					statisticsClass(arr);
					}
					Platform.runLater(new Runnable() {
						
						@Override
						public void run() {

					    	Pane root;
							try {
								root = FXMLLoader.load(getClass().getResource("/gui/HistogramTeachrAndClass.fxml"));
								Scene scene = new Scene(root);
								Stage primaryStage = new Stage();
								primaryStage.setScene(scene);
								primaryStage.show();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
									
						}
					}};
		

					


			
			
			
			
			
			
			
				
		}


		/**
		 * Statistics class.
		 *
		 * @param arr the arr
		 */
		private void statisticsClass(ArrayList<ClassWithGrade> arr) {
			// TODO Auto-generated method stub
			
Platform.runLater(new Runnable() {
				
	    		public void run() {
	    		FXMLLoader loader = new FXMLLoader(
	        		    getClass().getResource(
	        		      "/gui/HistogramTeachrAndClass.fxml"
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

	        		  HistogramClassAndTeachersController controller = 
	        		    loader.< HistogramClassAndTeachersController>getController();
	        		  
	        		  controller.initData(arr);

	        		  stage.show();
	    		}
	    	});
	    }
			
		


		/* (non-Javadoc)
		 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
		 */
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	

