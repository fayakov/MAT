package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ClassController implements Initializable {

	
	public void defineClassGui(ActionEvent event) throws Exception {
	//	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/MATGui/DefineClass.fxml").openStream());
		
		//StudentFormController studentFormController = loader.getController();
		//studentFormController.loadStudent(Test.students.get(itemIndex));
		
		Scene scene = new Scene(root);			
		scene.getStylesheets().add(getClass().getResource("/MATGui/DefineClass.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	
	
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
//	Class tclass = new Class();
	
	
		
	

}
