package controller;

import communication.AddTeacherToCourseClassRequest;
import communication.AddTeacherToCourseClassResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

public class AddTeacherToCourseClassController implements Handler {
	
	public AddTeacherToCourseClassController(){
		Dispatcher.addHandler(AddTeacherToCourseClassResponse.class.getCanonicalName(), this);
	}
	
	int tid, coid, clid;

    @FXML
    private TextField classId;

    @FXML
    private TextField teacherId;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField courseId;
    
    @FXML
    private Button btnClose;

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
    
    @FXML
    void closeAddTeacher(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof AddTeacherToCourseClassRequest) {
			AddTeacherToCourseClassResponse res = (AddTeacherToCourseClassResponse)msg;
			if (res.actionSucceed()) {
				Prompt.alert(1, "teacher " + tid + " added successfully to course " + coid);
			} else {
				Prompt.alert(3, res.getErrText());	
			}
			
		}
		
	}

}



