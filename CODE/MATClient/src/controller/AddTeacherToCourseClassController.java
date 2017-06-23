package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AddTeacherToCourseClassController {
	
	int tid, coid, clid;

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
    	
    	if(classId.getText().isEmpty() || teacherId.getText().isEmpty() || courseId.getText().isEmpty()){
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setHeaderText("one or more of the fields is empty");
    		alert.show();
    	}	
    	else { 
    		tid = Integer.parseInt(teacherId.getText());
        	coid = Integer.parseInt(courseId.getText());
        	clid = Integer.parseInt( classId.getText());
        	Alert alert = new Alert(AlertType.INFORMATION);
        	alert.setHeaderText("teacher " + tid + " added successfully to course " + coid);
        	alert.show();
    	}
    }
    
    @FXML
    void closeAddTeacher(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

}



