package test;


import controller.secretaryController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The Class requestTest.
 */
public class requestTest extends Application {
	
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
		secController.start(arg0);
	}

}
