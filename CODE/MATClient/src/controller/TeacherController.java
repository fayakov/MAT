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

public class TeacherController 
{
	ObservableList<String> listT ;
	
	@FXML
    private ComboBox<String> comboChooseOptionTeacher;

    @FXML
    private Label LabelTeacherMenu;

    @FXML
    private Button buttonSendTeacherMenu;

    
    void defineAssignment() throws Exception 
    {
        	
        	Pane root = FXMLLoader.load(getClass().getResource("/gui/DefineAssignment.fxml"));
    		Scene scene = new Scene(root);
    		Stage primaryStage = new Stage();
    		primaryStage.setScene(scene);
    		primaryStage.show();
        }

    void checkAssignment() throws Exception 
    {
        	
        	Pane root = FXMLLoader.load(getClass().getResource("/gui/SubmissionStudentController.fxml"));
    		Scene scene = new Scene(root);
    		Stage primaryStage = new Stage();
    		primaryStage.setScene(scene);
    		primaryStage.show();
        }
    
    @FXML
    void sendTeacherMenu(ActionEvent event) throws Exception 
    {
    	String option = comboChooseOptionTeacher.getValue().toString();
    	if(option.equalsIgnoreCase("Define Assignment"))
    		defineAssignment();	
    	if(option.equalsIgnoreCase("Show Submission Of Student"))
    		checkAssignment();
    	
    }
    
    

    public void start(Stage primaryStage) throws Exception 
    {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/TeachertMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}   
    
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







    


