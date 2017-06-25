package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class StatisticsController {
	
	ObservableList<String> list ;

    @FXML
    private Button btnClose;

    @FXML
    private ComboBox<String> StatisticsCombox;
    
    void StatisticsBetweenTeacherToClasses() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticTeacherAndClasses.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    void StatisticsBetweenClassToTeachers() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticClassAndTeachers.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void StatisticsBetweenClassToCourses() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticClassAndCourses.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    @FXML
    void send(ActionEvent event) throws Exception {
    	
    	String option = StatisticsCombox.getValue().toString();
    	
    	if(option.equalsIgnoreCase("Statistic Between Teacher To Classes"))
    		StatisticsBetweenTeacherToClasses();	
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
