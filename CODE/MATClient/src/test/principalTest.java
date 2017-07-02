package test;

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
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception {
		
		PrincipalController prinController = new PrincipalController();
		//ParentController prinController = new ParentController();
		prinController.start(arg0);
	}


}
