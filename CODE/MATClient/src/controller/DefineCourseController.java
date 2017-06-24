package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DefineCourseController {
	

    @FXML
    private TextField cName;

    @FXML
    void defineCourseSend(ActionEvent event) {
    	
    	String courseName = cName.getText().toString();
    	
    	if(cName.getText().isEmpty()) 
    		Prompt.alert(3,  "one or more of the fields is empty");    
    	
    	else {  // define class in db
    		Prompt.alert(1, "course " + courseName + " was added succesfully");
    		
    	}

    }
    
public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/DefineCourse.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
