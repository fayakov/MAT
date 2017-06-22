package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AddTeacherToCourseClassController {

    @FXML
    private TextField classId;

    @FXML
    private TextField teacherId;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField courseId;
    
    @FXML
    private Button btnClose;

    @FXML
    void AddTeacher(ActionEvent event) {
    	
    	String tid = teacherId.getText().toString();
    	String coid = courseId.getText().toString();
    	String clid = classId.getText().toString();
    	/* send request to server
    	*  add teacher
    	*/
    	
    	// if succeeded
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("teacher " + tid + " added successfully to course " + coid);
    	alert.show();
    }
    
    @FXML
    void closeAddTeacher(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

}



