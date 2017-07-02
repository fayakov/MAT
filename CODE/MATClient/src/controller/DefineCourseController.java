package controller;

import communication.DefineCourseRequest;
import communication.DefineCourseResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

public class DefineCourseController implements Handler {
	
	public DefineCourseController() {
		Dispatcher.addHandler(DefineCourseResponse.class.getCanonicalName(), this);
	}
	private int teachHours, tUnit;
	private String courseName;

	 @FXML
	 private TextField teachingUnitText;

	 @FXML
	 private TextField courseNameText;

	 @FXML
	 private TextField teachingHoursText;
	
    @FXML
    void defineCourseSend(ActionEvent event) {
    	
    	courseName = courseNameText.getText().toString(); 	
    	
    	if(courseNameText.getText().isEmpty() || teachingUnitText.getText().isEmpty() || teachingHoursText.getText().isEmpty()) 
    		Prompt.alert(3,  "one or more of the fields is empty");    
    	
    	else {
    		try {
    		teachHours = Integer.parseInt(teachingHoursText.getText());
    		tUnit =  Integer.parseInt(teachingUnitText.getText());
    		
    		DefineCourseRequest defineClassReq = new DefineCourseRequest(courseName, teachHours, tUnit);
	        MATClientController.getInstance().sendRequestToServer(defineClassReq);  
    		}
    		catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return; }
    	}

    }
    
public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/DefineCourse.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

public void handle(Message msg, Object obj) {
	// TODO Auto-generated method stub
		if (msg instanceof DefineCourseRequest) {
			DefineCourseResponse res = (DefineCourseResponse)msg;
			if (res.actionSucceed()) {
				Prompt.alert(1, "course " + courseName + " was added succesfully");
			} else {
				Prompt.alert(3, res.getErrText());	
			}
			
		}
	
}

}
