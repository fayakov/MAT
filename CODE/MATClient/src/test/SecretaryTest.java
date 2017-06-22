package test;

//import controller.NewSemesterSettingController;
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
		//StudentController secController = new StudentController();
		secController.start(arg0);
	}
	
}
