package controller;


import java.net.URL;
import java.util.ResourceBundle;

import communication.BlockParentRequest;
import communication.BlockParentResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;



/**
 * The Class BlockParentController.
 */
public class BlockParentController implements Initializable, Handler {
	
	/**
	 * Instantiates a new block parent controller.
	 */
	public BlockParentController(){
		Dispatcher.addHandler(BlockParentResponse.class.getCanonicalName(), this);
	}
	
	/** The pid. */
	private int pid;

    /** The Parent ID. */
    @FXML
    private TextField ParentID;

    /** The btn close. */
    @FXML
    private Button btnClose;

	    /**
    	 * Block parent.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void BlockParent(ActionEvent event) {
	    	
	    	if(ParentID.getText().isEmpty()) 
			 	Prompt.alert(3,"please enter Parent Id");		    	
	    	else {  		    		
	    		try {
				    pid = Integer.parseInt(ParentID.getText());
			    	
					BlockParentRequest ParentData = new BlockParentRequest(pid, true);
	    			MATClientController.getInstance().sendRequestToServer(ParentData);
			    	} catch(NumberFormatException e){
			    	Prompt.alert(3,"please enter numerical value");
			    	return;
			    	}
	    		
	    		}	    			
	    }
	    
	    /**
    	 * Close block parent.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void closeBlockParent(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }

		/* (non-Javadoc)
		 * @see utils.Handler#handle(communication.Message, java.lang.Object)
		 */
		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			
			if (msg instanceof BlockParentResponse) {
				BlockParentResponse res = (BlockParentResponse)msg;
				
				try {
					localPrompt(pid, res.getErrText(), res.isRequestSecceded());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*
				if (res.isRequestSecceded())  {
					 Prompt.alert(1, "Parent " + pid + " has been blocked ");
					 System.out.println("Parent " + pid + " has been blocked ");
				} else {
					Prompt.alert(3, res.getErrText());	
				}
				*/
			}
			
			
		}
		
		/**
		 * Local prompt.
		 *
		 * @param pid the pid
		 * @param eror the eror
		 * @param succ the succ
		 * @throws Exception the exception
		 */
		public void localPrompt(final int pid, final String eror, final boolean succ)  throws Exception {
			
			Platform.runLater(new Runnable() {
				int parentId = pid;		
				String erorText = eror;
				boolean success = succ;
				
				public void run() {
					if(success)
						Prompt.alert(1, "Parent " + parentId + " has been blocked ");
					else
						Prompt.alert(3, erorText);
				}
			} );
		}

		/* (non-Javadoc)
		 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
		 */
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			
		}
	}

