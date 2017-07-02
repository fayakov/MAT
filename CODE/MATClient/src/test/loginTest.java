package test;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Vector;

import controller.loginController;


/**
 * The Class loginTest.
 */
public class loginTest extends Application {
	
	//public static Vector<Student> students=new Vector<Student>();
		
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
		clientTest cltTest = new clientTest();
		cltTest.startClient();
		loginController loginCont = new loginController();
		cltTest.staticController.setLogin(loginCont);
		loginCont.start(arg0);
	}
	

}
