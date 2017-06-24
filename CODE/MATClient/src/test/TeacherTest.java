package test;


import controller.TeacherController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;


public class TeacherTest extends Application 
{

	public static void main( String args[] ) throws Exception
	   { 
  launch(args);		
	  }
	
	@Override
	public void start(Stage arg0) throws Exception 
	{
				TeacherController teaController = new TeacherController();
				teaController.start(arg0);

	}

}
