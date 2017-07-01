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
			if (msg instanceof GetClassCoursesStatsResponse) {
				GetClassCoursesStatsResponse res = (GetClassCoursesStatsResponse)msg;
				ArrayList<CourseWithGrade> arr = res.getStats();
				if( arr.size() == 0)
					res.setErrText("teacher is not exist");
				else{
//					((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
					Stage primaryStage = new Stage();
					FXMLLoader loader = new FXMLLoader();
					Pane root;
					try {
						root = loader.load(getClass().getResource("/gui/HistogranClassAndCourses.fxml").openStream());
						Scene scene = new Scene(root);			
						scene.getStylesheets().add(getClass().getResource("/gui/HistogranClassAndCourses.fxml").toExternalForm());
						
						primaryStage.setScene(scene);		
						primaryStage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					StatisticClassAndCoursesController StatisticClassAndCourses = loader.getController();		
					//StatisticClassAndTeachersController.loadStudent(Test.students.get(itemIndex));
					
		
			
		}




		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
	}


