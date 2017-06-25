package controller;


import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class StatisticsController {

	

	

		ObservableList<String> list ;

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    
	    @FXML
	    private ComboBox<String> StatisticsCombox;
	    
	    @FXML
	    private Button btnClose;

	 
	    @FXML
	    void StatisticsBetweenTeacherToClasses() throws Exception {
	    	
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticsBetweenTeacherToClasses.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
	    }
	    
	    void StatisticsBetweenClassToTeachers() throws Exception {
	    	
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticsBetweenClassToTeachers.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
	    }
	    
	    
	    void StatisticsBetweenClassToCourses() throws Exception {
	    	
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticsBetweenClassToCourses.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
	    }
	    
	    
	    
	    public void start(Stage primaryStage) throws Exception {
			
			Parent root = FXMLLoader.load(getClass().getResource("/gui/Statistic Data.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	    
	    
	    @FXML
	    public void send(ActionEvent event) throws Exception {
	    	
	    	String option = StatisticsCombox.getValue().toString();
	    	if(option.equalsIgnoreCase("Statistic Between Teacher To Classes"))
	    		StatisticsBetweenClassToTeachers() ;	
	    	if(option.equalsIgnoreCase("Statistic Between class To Teachers"))
	    		StatisticsBetweenClassToTeachers();
	    	if(option.equalsIgnoreCase("Statistic Between class To Courses"))
	    		StatisticsBetweenClassToCourses();   	
	    }
	    
	    @FXML
	    void close(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	    
	    @FXML
	    void initialize() {
	    	ArrayList<String> options = new ArrayList<String>();
	    	
	    	options.add("Statistic Between Teacher To Classes");
	      	options.add("Statistic Between class To Teachers"); 
	      	options.add("Statistic Between class To Courses"); 
	      	
			
			list = FXCollections.observableArrayList(options);
			StatisticsCombox.setItems(list);
		}	

	    
	}

	
	

