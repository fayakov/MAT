package test;


import controller.secretaryController;
import javafx.application.Application;
import javafx.stage.Stage;

public class requestTest extends Application {
	
	public static void main( String args[] ) throws Exception
	   { 
  launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		secretaryController secController = new secretaryController();
		secController.start(arg0);
	}

}
