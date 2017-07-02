package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * The Class TeacherController.
 */
public class TeacherController 
{
	
	/** The list T. */
	ObservableList<String> listT ;
	
	/** The combo choose option teacher. */
	@FXML
    private ComboBox<String> comboChooseOptionTeacher;

    /** The Label teacher menu. */
    @FXML
    private Label LabelTeacherMenu;

    /** The button send teacher menu. */
    @FXML
    private Button buttonSendTeacherMenu;

    
    /**
     * Define assignment.
     *
     * @throws Exception the exception
     */
    void defineAssignment() throws Exception 
    {
        	
        	Pane root = FXMLLoader.load(getClass().getResource("/gui/DefineAssignment.fxml"));
    		Scene scene = new Scene(root);
    		Stage primaryStage = new Stage();
    		primaryStage.setScene(scene);
    		primaryStage.show();
        }

    /**
     * Check assignment.
     *
     * @throws Exception the exception
     */
    void checkAssignment() throws Exception 
    {
        	
        	Pane root = FXMLLoader.load(getClass().getResource("/gui/SubmissionsOfStudents.fxml"));
    		Scene scene = new Scene(root);
    		Stage primaryStage = new Stage();
    		primaryStage.setScene(scene);
    		primaryStage.show();
        }
    
    /**
     * Send teacher menu.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    void sendTeacherMenu(ActionEvent event) throws Exception 
    {
    	String option = comboChooseOptionTeacher.getValue().toString();
    	if(option.equalsIgnoreCase("Define Assignment"))
    		defineAssignment();	
    	if(option.equalsIgnoreCase("Show Submission Of Student"))
    		checkAssignment();
    }
    
    

    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    public void start(Stage primaryStage) throws Exception 
    {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/TeacherMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}   
    
    /**
     * Initialize.
     */
    @FXML
    void initialize() 
    {
        ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Define Assignment");
      	options.add("Show Submission Of Student"); 
      	
		listT = FXCollections.observableArrayList(options);
		comboChooseOptionTeacher.setItems(listT);
       
    }
	
}







    


