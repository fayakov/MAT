package controller;

 import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class StatisticTeacherAndClassesController {

	    @FXML
	    private TextField TeacherID;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticTeacherAndClasses(ActionEvent event) {
	    	
	    	String tID = TeacherID.getText().toString();
	    	/*
	    	 * send to server
	    	 * chack if tecaher ID exist
	    	 * */
	    	
	    	// if succeeded
	    	//Alert alert = new Alert(AlertType.INFORMATION);
	    	//alert.setHeaderText("class " + cName + " was added succesfully");
	    	//alert.show(); //להציג בהיסטוגרמה
	    }
	    
	    @FXML
	    void closeStatisticTeacherAndClasses(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}
	
	
	
	
	

