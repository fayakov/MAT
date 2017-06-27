package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class AssignmentStudent
{
	ObservableList<String> listAss;
	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
	
	@FXML
    private Label labelMyAssignment;

    @FXML
    private ComboBox<String> comboChooseAssignment;

    @FXML
    private Button ButtonAssignmentNext;

    
    @FXML
    void AssignmentNext(ActionEvent event) throws IOException 
    {
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/OpenAndSubmitAssigmentByStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    @FXML 
    void initialize() 
    {
    	ArrayList<String> optionsAssig = new ArrayList<String>();	    	
    	optionsAssig.add("Assignment A");
    	optionsAssig.add("Assignment B");	
    	
    	listAss = FXCollections.observableArrayList(optionsAssig);
    	comboChooseAssignment.setItems(listAss);
    }

}






    








    


