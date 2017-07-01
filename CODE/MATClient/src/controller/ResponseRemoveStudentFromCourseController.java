package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import entities.Request;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ResponseRemoveStudentFromCourseController {

	private ArrayList<Request> allRequests;
	
    public void initData(ArrayList<Request> allRequests) {
    	data.clear();
		
		for (Request request : allRequests) {
			data.add(request);
		}
	}
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClose;

    @FXML
    void send(ActionEvent event) {

    }

    @FXML
    void close(ActionEvent event) {

    }

    @FXML
    void initialize() {
    
    }
}
