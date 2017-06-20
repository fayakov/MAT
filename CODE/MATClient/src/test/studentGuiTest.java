package test;


import java.net.URL;
import MATGui.StudentController;
import entities.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



public class studentGuiTest extends Application 
{
	//public static void main(String[] args) 
	public static void main( String args[] ) throws Exception
	{
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception 
	{
		//Student s= new Student("0",123,"1","2","4");
		StudentController aFrame = new StudentController();
				aFrame.start(arg0);
	}
	
	
	
	
	
	
	
	

}