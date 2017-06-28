package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetParentDataRequest;
import communication.GetParentDataResponse;
import communication.GetStudentDataRequest;
import communication.GetStudentDataResponse;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.Handler;

public class SearchStudentController implements Initializable, Handler {
	
	
	public SearchStudentController(){
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}
	private int sid;

    @FXML
    private Button closebtn;
    
    @FXML
    private TextField studentId;

    @FXML
    void send(ActionEvent event) throws Exception {
    	
    	if(studentId.getText().isEmpty()) 
		 	Prompt.alert(3,"please enter class number");		    	
    	else {  		    		
    		try {
			    sid = Integer.parseInt(studentId.getText());
		    	
			    
			    GetStudentDataRequest StudentData = new GetStudentDataRequest(sid);
    			MATClientController.getInstance().sendRequestToServer(StudentData);
    			
		    	} catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return;
		    	}  	
    		}	    	

    }

    @FXML
    void close(ActionEvent event) {
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
