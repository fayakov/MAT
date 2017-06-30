package controller;

import java.io.IOException;

import communication.DefineClassRequest;
import communication.DefineClassResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.Handler;

public class DefineClassController implements Handler {
	
	public DefineClassController() {
		Dispatcher.addHandler(DefineClassResponse.class.getCanonicalName(), this);
	}
	
	int clid; 
	String clName;
	
	@FXML
    private TextField classId;

    @FXML
    private TextField className;
    
    @FXML
    private Button btnClose;

    @FXML
    void createClass(ActionEvent event) {
    	
    	clName = className.getText().toString();
    	
    	if(className.getText().isEmpty()) 
    		Prompt.alert(3,  "please enter class name");    
    	
    	else {  
    		DefineClassRequest defineClassReq = new DefineClassRequest(clid, clName);
	        MATClientController.getInstance().sendRequestToServer(defineClassReq);
    	}
    }
    
    @FXML
    void closeDefineClass(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof DefineClassResponse) {
			DefineClassResponse res = (DefineClassResponse)msg;
			try {			
			if (res.actionSucceed())	
				localPrompt(clName,  res.getErrText(), res.actionSucceed());				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void localPrompt(final String clName1,final String eror1, final boolean succ)  throws Exception {
		
		Platform.runLater(new Runnable() {
			String clName = clName1;
			String erorText = eror1;
			boolean success = succ;
			
			public void run() {
				if(success)
					Prompt.alert(1, "class " + clName + " was added succesfully");	
				else
					Prompt.alert(3, erorText);
			}
		} );
	}
}
