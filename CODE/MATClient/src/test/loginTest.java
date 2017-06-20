package test;

import MATGui.loginController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Vector;


public class loginTest extends Application {
	
	//public static Vector<Student> students=new Vector<Student>();
		
	public static void main( String args[] ) throws Exception
	   { 
        launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		clientTest cltTest = new clientTest();
		cltTest.startClient();
		loginController loginCont = new loginController();
		cltTest.staticController.setLogin(loginCont);
		loginCont.start(arg0);
	}
	

}
