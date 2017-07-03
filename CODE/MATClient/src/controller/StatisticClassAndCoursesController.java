package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassCoursesStatsRequest;
import communication.GetClassCoursesStatsResponse;
import communication.MATClientController;
import communication.Message;
import entities.CourseWithGrade;
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

/**
 * The Class StatisticClassAndCoursesController.
 */
public class StatisticClassAndCoursesController implements Initializable, Handler {
	

	/**
	 * Instantiates a new statistic class and courses controller.
	 */
	public StatisticClassAndCoursesController(){
		Dispatcher.addHandler(GetClassCoursesStatsResponse.class.getCanonicalName(), this);
	}
	
		/** The clid. */
		private int clid;

	    /** The class number. */
    	@FXML
	    private TextField classNumber;
	    
	    /** The btn close. */
    	@FXML
	    private Button btnClose;

	    /**
    	 * Statistic class and courses.
    	 *
    	 * @param event the event
    	 * @throws Exception the exception
    	 */
    	@FXML
	    void StatisticClassAndCourses(ActionEvent event) throws Exception {
	    	
	    	 if(classNumber.getText().isEmpty()) 
				 	Prompt.alert(3,"Please enter class number");		    	
		     else {
		    	 try {
		    		 clid = Integer.parseInt(classNumber.getText());
		    		 
		    		 GetClassCoursesStatsRequest ClassData = new GetClassCoursesStatsRequest(clid);
		    		 MATClientController.getInstance().sendRequestToServer(ClassData);
		    	
		    	 } catch(NumberFormatException e){
		    		 Prompt.alert(3,"Please enter numerical value");
		    		 return;
	    		 }
		     }
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

		/* (non-Javadoc)
		 * @see utils.Handler#handle(communication.Message, java.lang.Object)
		 */
		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			if (msg instanceof GetClassCoursesStatsResponse) {
				GetClassCoursesStatsResponse res = (GetClassCoursesStatsResponse)msg;
				if(res.getStats() == null)
					Prompt.alert(3, "class does not exist");
				else{
					
				ArrayList<CourseWithGrade> arr = res.getStats();
				statisticsCorses(arr);
				}
			}
		}

		/**
		 * Statistics corses.
		 *
		 * @param arr the arr
		 */
		private void statisticsCorses(final ArrayList<CourseWithGrade> arr) {
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
			

		/* (non-Javadoc)
		 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
		 */
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	}
