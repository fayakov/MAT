package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StudentDataController 
{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="textStudentID"
    private TextField textStudentID; // Value injected by FXMLLoader

    @FXML // fx:id="textLName"
    private TextField textLName; // Value injected by FXMLLoader

    @FXML // fx:id="labelLName"
    private Label labelLName; // Value injected by FXMLLoader

    @FXML // fx:id="textFName"
    private TextField textFName; // Value injected by FXMLLoader

    @FXML // fx:id="labelCourses"
    private Label labelCourses; // Value injected by FXMLLoader

    @FXML // fx:id="textCourses"
    private TextField textCourses; // Value injected by FXMLLoader

    @FXML // fx:id="labelStudentID"
    private Label labelStudentID; // Value injected by FXMLLoader

    @FXML // fx:id="textClasses"
    private TextField textClasses; // Value injected by FXMLLoader

    @FXML // fx:id="labelFNName"
    private Label labelFNName; // Value injected by FXMLLoader

    @FXML // fx:id="buttenExit"
    private Button buttenExit; // Value injected by FXMLLoader

    @FXML // fx:id="labelCllassID"
    private Label labelCllassID; // Value injected by FXMLLoader

    @FXML // fx:id="labelStudentData"
    private Label labelStudentData; // Value injected by FXMLLoader

    
    @FXML
    void StudentInfo(ActionEvent event) 
    {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() 
    {
    	textStudentID.setText("30529");
    	textFName.setText("tal");
    	textLName.setText("chen");
    	textClasses.setText("L703");
    	//textCourses.setText
    	
    	
    }
}
