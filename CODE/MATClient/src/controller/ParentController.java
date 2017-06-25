package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class ParentController {

	    @FXML
	    private TextField StudentID;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void searchstudentID(ActionEvent event) {
	    	
	    	String sID = StudentID.getText().toString();
	    	/*
	    	 * send to server
	    	 * check if student ID exist if student ID exist show Data Student
	    	 * */
	    	
	    	// if succeeded
	    //	Alert alert = new Alert(AlertType.INFORMATION);
	    	//alert.setHeaderText("class " + cName + " was added succesfully");
	    	//alert.show(); // אם הסטודנט קיים לעבור למסך של הסטודנט
			
			
			//נסיון ניראה לי ככה צריך:
			
		//	 void parentMenu() throws Exception {
	    	
	    //	Pane root = FXMLLoader.load(getStudentID().getResource("/gui/ShowStudentData.fxml"));
		//	Scene scene = new Scene(root);
		//	Stage primaryStage = new Stage();
		//	primaryStage.setScene(scene);
		//	primaryStage.show();
	    }
	    
	    }
	    
	    @FXML
	    void close parentmenu(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}

