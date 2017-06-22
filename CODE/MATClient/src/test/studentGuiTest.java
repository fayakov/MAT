package test;


import java.net.URL;
import controller.StudentController;
import entities.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


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

