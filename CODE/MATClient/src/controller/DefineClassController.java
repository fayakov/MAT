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

/**
 * The Class DefineClassController.
 */
public class DefineClassController implements Handler {
	
	/**
	 * Instantiates a new define class controller.
	 */
	public DefineClassController() {
		Dispatcher.addHandler(DefineClassResponse.class.getCanonicalName(), this);
	}
	
	/** The clid. */
	int clid; 
	
	/** The cl name. */
	String clName;
	
	/** The class id. */
	@FXML
    private TextField classId;

    /** The class name. */
    @FXML
    private TextField className;
    
    /** The btn close. */
    @FXML
    private Button btnClose;

    /**
     * Creates the class.
     *
     * @param event the event
     */
    @FXML
    void createClass(ActionEvent event) {
    	
    	clName = className.getText().toString();
    	String classIdStr = classId.getText().toString();
    	 
    			
    	
    	if(className.getText().isEmpty()) 
    		Prompt.alert(3,  "please enter class name");
    	else if(classId.getText().isEmpty()) 
    		Prompt.alert(3,  "please enter class id");
    	else { 
    		clid = Integer.parseInt(classIdStr);
    		DefineClassRequest defineClassReq = new DefineClassRequest(clid, clName);
	        MATClientController.getInstance().sendRequestToServer(defineClassReq);
    	}
    }
    
    /**
     * Close define class.
     *
     * @param event the event
     */
    @FXML
    void closeDefineClass(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
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
	
	/**
	 * Local prompt.
	 *
	 * @param clName1 the cl name 1
	 * @param eror1 the eror 1
	 * @param succ the succ
	 * @throws Exception the exception
	 */
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
