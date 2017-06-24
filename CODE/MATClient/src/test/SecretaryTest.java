package test;

import controller.DefineCourseController;
import controller.NewSemesterSettingController;

import controller.secretaryController;
import javafx.application.Application;
import javafx.stage.Stage;

public class SecretaryTest extends Application {

	public static void main( String args[] ) throws Exception
	   { 
     launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		secretaryController secController = new secretaryController();
		//DefineCourseController secController = new DefineCourseController();
		//NewSemesterSettingController secController = new NewSemesterSettingController();
		secController.start(arg0);
	}
	
}
