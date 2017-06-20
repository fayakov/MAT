package MATGui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class OpenSemester {
	
	 	@FXML
	    private TextField textYear;

	    @FXML
	    private RadioButton btnB;

	    @FXML
	    private RadioButton btnA;

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
	    
}
