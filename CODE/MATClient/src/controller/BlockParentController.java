package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class BlockParentController {

    @FXML
    private TextField ParentID;

    @FXML
    private Button btnClose;

	    @FXML
	    void BlockParent(ActionEvent event) {
	    	
	    	String pId = ParentID.getText().toString();
	    	/*
	    	 * send to server
	    	 * search parent exist and chack if parent already block or not
	    	 * */
	    	
	    	// if succeeded
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("parent " + pId + " Blocked");
	    	alert.show();
	    }
	    
	    @FXML
	    void closeBlockParent(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	}

