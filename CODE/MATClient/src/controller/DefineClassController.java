package controller;

import communication.DefineClassRequest;
import communication.DefineClassResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
    	
    	if(className.getText().isEmpty() || classId.getText().isEmpty()) 
    		Prompt.alert(3,  "one or more of the fields is empty");    
    	
    	else {  
    		try {
			    clid = Integer.parseInt(classId.getText());   	
		    	} catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return;
		    	} 
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
		if (msg instanceof DefineClassRequest) {
			DefineClassResponse res = (DefineClassResponse)msg;
			if (res.actionSucceed()) {
				Prompt.alert(1, "class " + clName + " was added succesfully");
			} else {
				Prompt.alert(3, res.getErrText());	
			}
			
		}
		
	}
}
