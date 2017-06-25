package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class StatisticClassAndTeachersController {

	    @FXML
	    private TextField ClassNumber;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticClassAndTeachers(ActionEvent event) {
	    	
	    	String cNum = ClassNumber.getText().toString();
	    	/*
	    	 * send to server
	    	 * check if Class Number exist
	    	 * */
	    	
	    	// if succeeded
	    	//Alert alert = new Alert(AlertType.INFORMATION);
	    	//alert.setHeaderText("class " + cName + " was added succesfully");
	    	//alert.show(); //מפה אם קיים צריך לעבור למסך שמראה את ההיסטוגרמה  
	    }
	    
	    @FXML
	    void close StatisticClassAndTeachers(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}

