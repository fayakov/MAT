package test;

import controller.TeacherController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * The Class TeacherTest.
 */
public class TeacherTest extends Application 
{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main( String args[] ) throws Exception
	   { 
  launch(args);		
	  }
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception 
	{
				TeacherController teaController = new TeacherController();
				teaController.start(arg0);

	}

}
