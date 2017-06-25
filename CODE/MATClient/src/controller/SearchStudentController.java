package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SearchStudentController {

    @FXML
    private Button closebtn;
    
    @FXML
    private TextField studentId;

    @FXML
    void send(ActionEvent event) throws Exception {
    	
    	String cName = studentId.getText().toString();
    	
    	if(studentId.getText().isEmpty()) 
    		Prompt.alert(3,  "the field is empty");    
    	
    	else {  
    		Pane root = FXMLLoader.load(getClass().getResource("/gui/StudentData.fxml"));
    		Scene scene = new Scene(root);
    		Stage primaryStage = new Stage();
    		primaryStage.setScene(scene);
    		primaryStage.show();
    	}

    }

    @FXML
    void close(ActionEvent event) {
    	 Stage stage = (Stage) closebtn.getScene().getWindow();
 	    stage.close();

    }

}
