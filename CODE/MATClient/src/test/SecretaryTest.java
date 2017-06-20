package test;

import MATGui.SecretaryController;
import javafx.application.Application;
import javafx.stage.Stage;

public class SecretaryTest extends Application {

	public static void main( String args[] ) throws Exception
	   { 
     launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		SecretaryController secController = new SecretaryController();
		secController.start(arg0);
	}
	
}
