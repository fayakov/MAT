package MATGui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AssignmentController implements Initializable 
{

	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
	}
	
	//@Override
			public void start(Stage primaryStage) throws Exception
			{
				try {
					Parent root = FXMLLoader.load(getClass().getResource("/MATGui/StudentMenu.fxml"));
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("/test/application.css").toExternalForm());//שיניתי לאפליקישיין
					primaryStage.setTitle("Student Menu");
					primaryStage.setScene(scene);
					
					primaryStage.show();
				    } 
				
				catch(Exception e) {
					e.printStackTrace();
				}
			}

}
