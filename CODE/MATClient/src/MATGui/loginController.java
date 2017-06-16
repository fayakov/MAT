package MATGui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class loginController implements Initializable {

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}

    @FXML
    private TextField userIdTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    void logInBtn(ActionEvent event) {
    	System.out.println(userIdTextField.getText());
    	System.out.println(passwordTextField.getText());
    }
    
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/gui/logIn.fxml"));
				
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/gui/AcademicFrame.css").toExternalForm());
		//primaryStage.setTitle("Academic Managment Tool");
		primaryStage.setScene(scene);
		
		primaryStage.show();	
	}


}
