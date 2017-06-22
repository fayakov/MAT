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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StudentController {
	
	ObservableList<String> list ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelStudentMenu;

    @FXML
    private ComboBox<String> comboStudentMenu;

    @FXML
    private Button btnSend;

    @FXML
    public void StudentInfo(ActionEvent event) throws Exception
    {
    	
		String option = comboStudentMenu.getValue().toString();
    	/*if(option.equalsIgnoreCase("Student Data"))
    		studentData1();	
    	if(option.equalsIgnoreCase("Assignment"))
    		assignment();*/	
    }
    
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/StudentMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    
    

    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Student Data");
      	options.add("Assignment"); 
		
		
		list = FXCollections.observableArrayList(options);
		comboStudentMenu.setItems(list);

    }
}
