package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.AddStudentToClassRequest;
import communication.AddStudentToClassResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import utils.Handler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * The Class AddStudentToClassController.
 */
public class AddStudentToClassController implements Handler {
	
	/**
	 * Instantiates a new adds the student to class controller.
	 */
	public AddStudentToClassController(){
		Dispatcher.addHandler(AddStudentToClassResponse.class.getCanonicalName(), this);
	}
	
	/** The cid. */
	int sid, cid;   // student id, class id

    /** The resources. */
    @FXML
    private ResourceBundle resources;

    /** The location. */
    @FXML
    private URL location;
    
    /** The btn close. */
    @FXML
    private Button btnClose;

    /** The Class ID. */
    @FXML
    private TextField ClassID;

    /** The Student ID. */
    @FXML
    private TextField StudentID;

    /**
     * Send add student.
     *
     * @param event the event
     */
    @FXML
    void sendAddStudent(ActionEvent event) {      	
    	
    	if(ClassID.getText().isEmpty() || StudentID.getText().isEmpty()) {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setHeaderText("one or more of the fields is empty");
    		alert.show();
    		Prompt.alert(3,"one or more of the fields is empty");
    	}
    	else { 
    		try {
    	    	sid = Integer.parseInt(StudentID.getText());
    	    	cid = Integer.parseInt(ClassID.getText());
    	    	} catch(NumberFormatException e){
    	    	Prompt.alert(3,"please enter numerical value");
    	    	return;
    	    	}  
    		AddStudentToClassRequest addStudentReq = new AddStudentToClassRequest(sid, cid);
	        MATClientController.getInstance().sendRequestToServer(addStudentReq);
    	}
    }
      
    /**
     * Close add stodent.
     *
     * @param event the event
     */
    @FXML
    void closeAddStodent(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddStudentToClassResponse) {
			AddStudentToClassResponse res = (AddStudentToClassResponse)msg;
			
			try {
				localPrompt(sid, cid,  res.getErrText(), res.actionSucceed());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
	}
	
/**
 * Local prompt.
 *
 * @param sid the sid
 * @param cid the cid
 * @param eror the eror
 * @param succ the succ
 * @throws Exception the exception
 */
public void localPrompt(final int sid, final int cid, final String eror, final boolean succ)  throws Exception {
		
		Platform.runLater(new Runnable() {
			int studentId = sid;
			int classId = cid;		
			String erorText = eror;
			boolean success = succ;
			
			public void run() {
				if(success)
					Prompt.alert(1, "student " + studentId + " added successfully to class " + classId);	
				else
					Prompt.alert(3, "cannot send request, check details again");
			}
		} );
	}
}
