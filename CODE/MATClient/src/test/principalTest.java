package test;

import controller.HistogramClassAndTeachersController;
import controller.ParentController;
import controller.PrincipalController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The Class principalTest.
 */
public class principalTest extends Application {
	
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
	

	@Override
	public void start(Stage arg0) throws Exception {
		
		//HistogramClassAndTeachersController prinController = new HistogramClassAndTeachersController();
		PrincipalController prinController = new PrincipalController();
		//ParentController prinController = new ParentController();
		prinController.start(arg0);
	}


}
