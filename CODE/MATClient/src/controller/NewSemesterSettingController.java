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

/**
 * The Class NewSemesterSettingController.
 */
public class NewSemesterSettingController {
	
	/** The list. */
	ObservableList<String> list ;
	
	/** The btn close. */
	@FXML
	private Button btnClose;
	
    /** The resources. */
    @FXML
    private ResourceBundle resources;

    /** The location. */
    @FXML
    private URL location;
    
    /** The secretary combox. */
    @FXML
    private ComboBox<String> secretaryCombox;
    
    

    
    /**
     * Adds the student to class.
     *
     * @throws Exception the exception
     */
    void AddStudentToClass() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/AddStudentToClass.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    /**
     * Adds the class to course.
     *
     * @throws Exception the exception
     */
    void AddClassToCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/AddClassToCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    /**
     * Define class.
     *
     * @throws Exception the exception
     */
    void DefineClass() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/DefineClass.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    /**
     * Open semester.
     *
     * @throws Exception the exception
     */
    void OpenSemester() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/OpenSemester.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    /**
     * Adds the teacher to course class.
     *
     * @throws Exception the exception
     */
    void AddTeacherToCourseClass() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/AddTeacherToCourseClass.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    
    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/NewSemesterSettingSecretary.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    /**
     * Send.
     *
     * @param event the event
     * @throws Exception the exception
     */
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
    

    /**
     * Initialize.
     */
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
