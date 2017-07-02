package test;

import controller.DefineCourseController;
import controller.NewSemesterSettingController;

import controller.secretaryController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The Class SecretaryTest.
 */
public class SecretaryTest extends Application {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main( String args[] ) throws Exception
	   { 
     launch(args);		
	  } // end main
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception {
		
		secretaryController secController = new secretaryController();
		//DefineCourseController secController = new DefineCourseController();
		//NewSemesterSettingController secController = new NewSemesterSettingController();
		secController.start(arg0);
	}
	
}
