package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import communication.Dispatcher;
import communication.GetCourseRequest;
import communication.GetCourseResponse;
import communication.MATClientController;
import communication.Message;
import entities.Course;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.Handler;

public class SystemManagerMenuController implements Initializable, Handler{

	
    public SystemManagerMenuController()  {
  		super();
  		Dispatcher.addHandler(GetCourseResponse.class.getCanonicalName(), this);
  	}
     
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCourse;

    @FXML
    void defineCourse(ActionEvent event) {
    	
    	GetCourseRequest coursereq= new GetCourseRequest();
		MATClientController.getInstance().sendRequestToServer(coursereq);

    }

    @FXML
    void initialize() {

    }

	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof GetCourseResponse) {
			GetCourseResponse res = (GetCourseResponse)msg;
		defineCourses(res.getPreCourse());
		}
	}


    private void defineCourses(final ArrayList<Course> preCourse) {

    	Platform.runLater(new Runnable() {
			
    		public void run() {
    		FXMLLoader loader = new FXMLLoader(
        		    getClass().getResource(
        		      "/gui/DefineCourse.fxml"
        		    )
        		  );

        		  Stage stage = new Stage(StageStyle.DECORATED);
        		  try {
					stage.setScene(
					    new Scene(
					      (Pane) loader.load()
					    )
					  );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

        		  DefineCourseController controller = 
        		    loader.<DefineCourseController>getController();
        		  
        		  controller.initData(preCourse);

        		  stage.show();
    		}
    	});
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}