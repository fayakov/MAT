package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class AddStudentToClassController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ClassID;

    @FXML
    private TextField StudentID;

    @FXML
    void sendAddStudent(ActionEvent event) {
    	
    	String sid = StudentID.getText().toString();
    	String cid = ClassID.getText().toString();
    	/* send request to server
    	*  add student to class
    	*/
    	
    	// if succeeded
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("student " + sid + " added successfully to class " + cid);
    	alert.show();
    }

    @FXML
    void initialize() {
        assert ClassID != null : "fx:id=\"ClassID\" was not injected: check your FXML file 'AddStudentToClass.fxml'.";
        assert StudentID != null : "fx:id=\"StudentID\" was not injected: check your FXML file 'AddStudentToClass.fxml'.";

    }
}
