package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
    	
    	if(classId.getText().isEmpty() || teacherId.getText().isEmpty() || courseId.getText().isEmpty())
    		Prompt.alert(3, "one or more of the fields is empty");   		
    		
    	else { 
    		try {
    		tid = Integer.parseInt(teacherId.getText());
        	coid = Integer.parseInt(courseId.getText());
        	clid = Integer.parseInt( classId.getText());
    		} catch(NumberFormatException e){
    			Prompt.alert(3,"please enter numerical value");
		    	return;
    		}
    		Prompt.alert(1, "teacher " + tid + " added successfully to course " + coid);
    	}
    }
    
    @FXML
    void closeAddTeacher(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

}



