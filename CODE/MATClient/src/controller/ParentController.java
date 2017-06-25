package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class ParentController {

	    @FXML
	    private TextField StudentID;
	    
	    @FXML
	    private Button btnClose;

	       	
	    	/*
	    	 * send to server
	    	 * check if student ID exist if student ID exist show Data Student
	    	 * */
	    	
	    	// if succeeded
	    //	Alert alert = new Alert(AlertType.INFORMATION);
	    	//alert.setHeaderText("class " + cName + " was added succesfully");
	    	//alert.show(); // אם הסטודנט קיים לעבור למסך של הסטודנט
			
			
			//נסיון ניראה לי ככה צריך:
			
	    	 @FXML
	 	    void searchstudentID (ActionEvent event) throws Exception {
	    	
			String sID = StudentID.getText().toString();
			// check student
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StudentData.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
	    }
	    	 
	   	 public void start(Stage primaryStage) throws Exception {
	    			
	   			Parent root = FXMLLoader.load(getClass().getResource("/gui/ParentMenu.fxml"));
    			Scene scene = new Scene(root);
	    		primaryStage.setScene(scene);
	    		primaryStage.show();
	    		}	 
	    
	    
	    @FXML
	    void closeParentMenu(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}

