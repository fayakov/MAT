package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import communication.Dispatcher;
import communication.GetClassTeachersStatsRequest;
import communication.GetClassTeachersStatsResponse;
import communication.MATClientController;
import communication.Message;
import entities.TeacherWithGrade;
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
 * The Class StatisticClassAndTeachersController.
 */
public class StatisticClassAndTeachersController implements Initializable, Handler {
	
	/**
	 * Instantiates a new statistic class and teachers controller.
	 */
	public StatisticClassAndTeachersController()
	{
		Dispatcher.addHandler(GetClassTeachersStatsResponse.class.getCanonicalName(), this);
	}
	
		/** The clid. */
		private int clid;

	    /** The Class number. */
    	@FXML
	    private TextField ClassNumber;
	    
	    /** The btn close. */
    	@FXML
	    private Button btnClose;

	    /**
    	 * Statistic class and teachers.
    	 *
    	 * @param event the event
    	 * @throws Exception the exception
    	 */
    	@FXML
	    void StatisticClassAndTeachers(ActionEvent event) throws Exception {
	    	
	    	 if(ClassNumber.getText().isEmpty()) 
				 	Prompt.alert(3,"Please enter class number");		    	
		     else {  	
		    	 try {
		    		 clid = Integer.parseInt(ClassNumber.getText());
		    		 
		    		 GetClassTeachersStatsRequest ClassData = new GetClassTeachersStatsRequest(clid);
		    		 MATClientController.getInstance().sendRequestToServer(ClassData);
		    	 
		    	 } catch(NumberFormatException e){
		    		 Prompt.alert(3,"Please enter numerical value");
		    		 return;
		    	 }
		     }		
    	}
	  
	    /**
    	 * Close statistic class and teachers.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void closeStatisticClassAndTeachers(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }

	
		public void handle(Message msg, Object obj) 
		{
			// TODO Auto-generated method stub
			if (msg instanceof GetClassTeachersStatsResponse) {
				GetClassTeachersStatsResponse res = (GetClassTeachersStatsResponse)msg;
				
				if(res.getStats() == null)
					Prompt.alert(3, "class does not exist");
				else{
					
				ArrayList<TeacherWithGrade> arr = res.getStats();
				statisticsTeacher(arr);
				}
			}
		}

		/**
		 * Statistics teacher.
		 *
		 * @param arr the arr
		 */
		private void statisticsTeacher(final ArrayList<TeacherWithGrade> arr) {
			// TODO Auto-generated method stub
			
			Platform.runLater(new Runnable() {
				
				public void run() {
					
					FXMLLoader loader = new FXMLLoader(
					    getClass().getResource(
					      "/gui/HistogramClassAndTeachers.fxml"
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
						  loader.<HistogramClassAndTeachersController>getController();
				  
				  controller.initData(arr);
				  stage.show();
				}
			});
	    }
			
	
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
		
		}
	}

