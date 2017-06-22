package MATGui;

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
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SecretaryController {
	
	ObservableList<String> list ;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private ComboBox<String> secretaryCombox;
    
    @FXML
    private ComboBox<String> secretaryCombox2;
    
    

    
    void AddStudentToClass() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/MATGui/AddStudentToClass.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    void AddClassToCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/MATGui/AddClassToCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    void DefineClass() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/MATGui/DefineClass.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    void OpenSemester() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/MATGui/OpenSemester.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    void AddTeacherToCourseClass() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/MATGui/AddTeacherToCourseClass.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/MATGui/SecretaryForm.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    public void send(ActionEvent event) throws Exception {
    	//String name = StudentName.getValue().toString();
    	String option = secretaryCombox.getValue().toString();
    	if(option.equalsIgnoreCase("Add student to class"))
    		AddStudentToClass();	
    	if(option.equalsIgnoreCase("Add class to course"))
    		AddClassToCourse();
    	if(option.equalsIgnoreCase("Define class"))
    		DefineClass();
    	if(option.equalsIgnoreCase("Open semester"))
    		OpenSemester();
    	if(option.equalsIgnoreCase("Add teacher to course in class"))
    		AddTeacherToCourseClass();
    	
    }
    
    @FXML
    void send2(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Add student to class");
      	options.add("Add class to course"); 
      	options.add("Define class"); 
      	options.add("Open semester"); 
      	options.add("Add teacher to course in class"); 
		
		list = FXCollections.observableArrayList(options);
		secretaryCombox.setItems(list);
	}	

    
}
