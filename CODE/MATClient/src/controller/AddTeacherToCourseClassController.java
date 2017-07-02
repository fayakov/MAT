package controller;

import communication.AddTeacherToCourseClassRequest;
import communication.AddTeacherToCourseClassResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

/**
 * The Class AddTeacherToCourseClassController.
 */
public class AddTeacherToCourseClassController implements Handler {
	
	/**
	 * Instantiates a new adds the teacher to course class controller.
	 */
	public AddTeacherToCourseClassController(){
		Dispatcher.addHandler(AddTeacherToCourseClassResponse.class.getCanonicalName(), this);
	}
	
	/** The clid. */
	int tid, coid, clid;

    /** The class id. */
    @FXML
    private TextField classId;

    /** The teacher id. */
    @FXML
    private TextField teacherId;

    /** The btn add. */
    @FXML
    private Button btnAdd;

    /** The course id. */
    @FXML
    private TextField courseId;
    
    /** The btn close. */
    @FXML
    private Button btnClose;

    /**
     * Adds the teacher.
     *
     * @param event the event
     */
    @FXML
    void AddTeacher(ActionEvent event) {
    	
    	if(classId.getText().isEmpty() || teacherId.getText().isEmpty() || courseId.getText().isEmpty())
    		Prompt.alert(3, "one or more of the fields is empty");   		
    		
    	else { 
    		try {
    		tid = Integer.parseInt(teacherId.getText());
        	coid = Integer.parseInt(courseId.getText());
        	clid = Integer.parseInt( classId.getText());
    		} catch(NumberFormatException e){
    			Prompt.alert(3,"please enter numerical value");
		    	return;
    		}
    		AddTeacherToCourseClassRequest addTeacherReq = new AddTeacherToCourseClassRequest(tid, coid, clid);
	        MATClientController.getInstance().sendRequestToServer(addTeacherReq);
    	}
    }
    
    /**
     * Close add teacher.
     *
     * @param event the event
     */
    @FXML
    void closeAddTeacher(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddTeacherToCourseClassResponse) {
			AddTeacherToCourseClassResponse res = (AddTeacherToCourseClassResponse)msg;
			
			try {
				localPrompt(tid, coid,  res.getErrText(), res.actionSucceed());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			if (res.actionSucceed()) {
				Prompt.alert(1, "teacher " + tid + " added successfully to course " + coid);
			} else {
				Prompt.alert(3, res.getErrText());	
			}
			*/
		}
		
	}
	
/**
 * Local prompt.
 *
 * @param tid the tid
 * @param coid the coid
 * @param eror the eror
 * @param succ the succ
 * @throws Exception the exception
 */
public void localPrompt(final int tid, final int coid, final String eror, final boolean succ)  throws Exception {
		
		Platform.runLater(new Runnable() {
			int teacherId = tid;
			int courseId = coid;		
			String erorText = eror;
			boolean success = succ;
			
			public void run() {
				if(success)
					Prompt.alert(1, "teacher " + teacherId + " added successfully to course " + courseId);	
				else
					Prompt.alert(3, erorText);
			}
		} );
	}

}



