package controller;


import java.net.URL;
import java.util.ResourceBundle;

import communication.BlockParentRequest;
import communication.BlockParentResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;



public class BlockParentController implements Initializable, Handler {
	
	public BlockParentController(){
		Dispatcher.addHandler(BlockParentResponse.class.getCanonicalName(), this);
	}
	
	private int pid;

    @FXML
    private TextField ParentID;

    @FXML
    private Button btnClose;

	    @FXML
	    void BlockParent(ActionEvent event) {
	    	
	    	if(ParentID.getText().isEmpty()) 
			 	Prompt.alert(3,"please enter Parent Id");		    	
	    	else {  		    		
	    		try {
				    pid = Integer.parseInt(ParentID.getText());
			    	
					BlockParentRequest ParentData = new BlockParentRequest(pid);
	    			MATClientController.getInstance().sendRequestToServer(ParentData);
			    	} catch(NumberFormatException e){
			    	Prompt.alert(3,"please enter numerical value");
			    	return;
			    	}
	    		
	    		}	    			
	    }
	    
	    @FXML
	    void closeBlockParent(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
		    
		    
		    
	    }

		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			
			if (msg instanceof BlockParentResponse) {
				BlockParentResponse res = (BlockParentResponse)msg;
				if (res.isRequestSecceded())  {
					 Prompt.alert(1, "Parent " + pid + " is blocked ");
				} else {
					Prompt.alert(3, res.getErrText());	
				}
			}
			
			
		}

		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			
		}
	}

