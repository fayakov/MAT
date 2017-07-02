package test;

import controller.StudentController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The Class studentGuiTest.
 */
//TAL
public class studentGuiTest extends Application 
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
		StudentController aFrame = new StudentController();
				aFrame.start(arg0);
	}

}

