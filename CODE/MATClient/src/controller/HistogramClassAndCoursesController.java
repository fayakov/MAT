package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HistogramClassAndCoursesController {

    @FXML
    private Button closebtn;

    @FXML
    void Close(ActionEvent event) {
	
    	    Stage stage = (Stage) closebtn.getScene().getWindow();
    	    stage.close();
        }
        
    }

