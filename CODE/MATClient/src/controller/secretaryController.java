package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class secretaryController {

	ObservableList<String> list ;

    @FXML
    private ComboBox<String> secretaryMenuCombox;

 
    @FXML
    void defineNewSemester(ActionEvent event) {

    }
    
    void ChangeTeacher() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/ChangeTeacher.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void RemoveStudentFromCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RemoveStudentFromCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void AddStudentToCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/AddStudentToCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/SecretaryMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    
    @FXML
    public void send(ActionEvent event) throws Exception {
    	
    	String option = secretaryMenuCombox.getValue().toString();
    	if(option.equalsIgnoreCase("Add student to course"))
    		AddStudentToCourse();	
    	if(option.equalsIgnoreCase("Remove student from course"))
    		RemoveStudentFromCourse();
    	if(option.equalsIgnoreCase("Change teacher"))
    		ChangeTeacher();

    	
    }
    
    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Add student to course");
      	options.add("Remove student from course"); 
      	options.add("Change teacher"); 

		
		list = FXCollections.observableArrayList(options);
		secretaryMenuCombox.setItems(list);
	}	

    
}
