package test;

import controller.PrincipalController;
import javafx.application.Application;
import javafx.stage.Stage;

public class principalTest extends Application {
	public static void main( String args[] ) throws Exception
	   { 
launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		PrincipalController prinController = new PrincipalController();
		prinController.start(arg0);
	}


}
