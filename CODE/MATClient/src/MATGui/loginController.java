package MATGui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import test.clientTest;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
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
import entities.EUserType;


public class loginController implements Initializable {

	public loginController(){
	}
	
	public void setClient(clientTest clientTst){
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
    @FXML
    private TextField userIdTextField;

    @FXML
    private PasswordField passwordTextField;
    

    @FXML
    private Text errorText;

    @FXML
    void logInBtn(ActionEvent event) {
    	errorText.setText("");
		String userIdStr = userIdTextField.getText();
		String userPassword = passwordTextField.getText();
    	if(userPassword.equals("") || userIdStr.equals("") ){
    		errorText.setText("must enter id and password");
    	}
    	else{
    		try{
    			int userId = Integer.parseInt(userIdStr);
    			clientTest.staticController.sendReq(userId, userPassword);
    		}catch (NumberFormatException nfe) {
	    		errorText.setText("id must be number");
	    	}
    	}
    }
    
    public void getLogInResault(boolean isLoged, boolean errorPassword, boolean errorId){
    	errorText.setText("");
    	if(isLoged)
    	{
    		//tmp print error
    		errorText.setText("login with user type:");
    		
    		//add code to move to next screen
    	}
    	else if(errorPassword)
    	{
    		errorText.setText("wrong password");
    	}
    	else if(errorId)
    	{
    		errorText.setText("wrong id");
    	}
    }
    
	public void start(Stage primaryStage) throws Exception {	
	    
	    Parent root = FXMLLoader.load(getClass().getResource("/MATGui/logIn.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
