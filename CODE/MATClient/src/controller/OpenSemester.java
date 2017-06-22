package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class OpenSemester {
	
	 	@FXML
	    private TextField textYear;

	    @FXML
	    private RadioButton btnB;

	    @FXML
	    private RadioButton btnA;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void createSemester(ActionEvent event)	{
	    	
	    	String year = textYear.getText().toString();
	    	// get button value
	    	/*
	    	 * send to server
	    	 * create semester
	    	*/
	    	
	    	//if succeeded
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("semester was added succesfully");
	    	alert.show();

	    }
	    
	    @FXML
	    void closeOpenSemester(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	    
}
