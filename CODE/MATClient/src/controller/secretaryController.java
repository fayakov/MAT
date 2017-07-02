package controller;

import java.util.ArrayList;
import java.util.ResourceBundle;

import entities.Request;

import java.net.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * The Class secretaryController.
 */
public class secretaryController {

	/** The list. */
	ObservableList<String> list ;
	
	/** The request. */
	public Request request;

    /** The resources. */
    @FXML
    private ResourceBundle resources;

    /** The location. */
    @FXML
    private URL location;

    
    /** The secretary menu combox. */
    @FXML
    private ComboBox<String> secretaryMenuCombox;
    
    /** The btn close. */
    @FXML
    private Button btnClose;

 
    /**
     * Define new semester.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    void defineNewSemester(ActionEvent event) throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/NewSemesterSettingSecretary.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    /**
     * Change teacher.
     *
     * @throws Exception the exception
     */
    void ChangeTeacher() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RequestChangeTeacher.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    /**
     * Removes the student from course.
     *
     * @throws Exception the exception
     */
    void RemoveStudentFromCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RequestRemoveStudentFromCourse.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    /**
     * Adds the student to course.
     *
     * @throws Exception the exception
     */
    void AddStudentToCourse() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RequestAddStudentToCourse.fxml"));
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
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/SecretaryMenu.fxml"));
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
    @FXML
    public void send(ActionEvent event) throws Exception {
    	
    	((Node)event.getSource()).getScene().getWindow().hide(); 
    	String option = secretaryMenuCombox.getValue().toString();
    	if(option.equalsIgnoreCase("Add student to course"))
    		AddStudentToCourse();	
    	if(option.equalsIgnoreCase("Remove student from course"))
    		RemoveStudentFromCourse();
    	if(option.equalsIgnoreCase("Change teacher"))
    		ChangeTeacher();   	
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
    	
    	options.add("Add student to course");
      	options.add("Remove student from course"); 
      	options.add("Change teacher"); 
      	
		
		list = FXCollections.observableArrayList(options);
		secretaryMenuCombox.setItems(list);
	}	

    
}
