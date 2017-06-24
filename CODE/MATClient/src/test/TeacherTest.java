package test;


import controller.TeacherController;
import javafx.application.Application;
import javafx.stage.Stage;


import controller.secretaryController;
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
		// TODO Auto-generated method stub
		
				TeacherController teaController = new TeacherController();
				teaController.start(arg0);

	}

}
