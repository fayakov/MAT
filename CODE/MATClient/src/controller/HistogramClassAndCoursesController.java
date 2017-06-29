package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.Handler;

public class HistogramClassAndCoursesController implements Initializable, Handler {
	
	

    @FXML
    private Button closebtn;

    @FXML
    void Close(ActionEvent event) {
	
    	    Stage stage = (Stage) closebtn.getScene().getWindow();
    	    stage.close();
        }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
        
    }

