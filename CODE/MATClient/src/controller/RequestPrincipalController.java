package controller;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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

public class RequestPrincipalController {
	
	ObservableList<String> list ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClose;

    @FXML
    private ComboBox<String> requestComboBox;
    
    
    void ResponseChangeTeacher() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RequestChangeTeacher.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void ResponseRemoveStudentFromCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/ResponseRemoveStudentFromCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void ResponseAddStudentToCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/ResponseAddStudentToCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/RequestPrincipal.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    

    @FXML
    void send(ActionEvent event) throws Exception{
    	
    	String option = requestComboBox.getValue().toString();
    	if(option.equalsIgnoreCase("Add student to course"))
    		ResponseAddStudentToCourse();	
    	if(option.equalsIgnoreCase("Remove student from course"))
    		ResponseRemoveStudentFromCourse();
    	if(option.equalsIgnoreCase("Change teacher"))
    		ResponseChangeTeacher();   	

    }

    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();

    }

    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Add student to course");
      	options.add("Remove student from course"); 
      	options.add("Change teacher"); 
      	
		
		list = FXCollections.observableArrayList(options);
		requestComboBox.setItems(list);

    }
}
