package test;

import controller.StudentController;
import javafx.application.Application;
import javafx.stage.Stage;

//TAL
public class studentGuiTest extends Application 
{
	
	public static void main( String args[] ) throws Exception
	{
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception 
	{
		StudentController aFrame = new StudentController();
				aFrame.start(arg0);
	}

}

