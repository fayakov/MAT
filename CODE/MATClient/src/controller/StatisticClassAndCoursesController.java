package controller;


	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Alert;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
	import javafx.scene.control.Alert.AlertType;
	import javafx.stage.Stage;

public class StatisticClassAndCoursesController {

	    @FXML
	    private TextField classNumber;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void StatisticClassAndCourses(ActionEvent event) {
	    	
	    	String cNum = classNumber.getText().toString();
	    	/*
	    	 * send to server
	    	 * check if class number exist
	    	 * */
	    	
	    	// if succeeded
	    	//Alert alert = new Alert(AlertType.INFORMATION);
	    	//alert.setHeaderText("class " + cName + " was added succesfully");
	    	//alert.show(); //להציג היסטוגרמה
	    }
	    
	    @FXML
	    void close(ActionEvent event) {		
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	 }
	}


