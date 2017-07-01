package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import communication.Dispatcher;
import communication.LoginRequestMsg;
import communication.LoginResponseMsg;
import communication.MATClientController;
import communication.Message;
import javafx.fxml.Initializable;
import test.clientTest;
import utils.Handler;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import entities.EUserType;
import entities.Student;


public class loginController implements Initializable, Handler 
{
	public static Student st= new Student();

	public loginController()
	{
		Dispatcher.addHandler(LoginResponseMsg.class.getCanonicalName(), this);
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
    			LoginRequestMsg loginReqMsg = new LoginRequestMsg(userId, userPassword,true);
    			MATClientController.getInstance().sendRequestToServer(loginReqMsg);
    			
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
	    
	    Parent root = FXMLLoader.load(getClass().getResource("/gui/logIn.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}



	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof LoginResponseMsg) {
			LoginResponseMsg res = (LoginResponseMsg)msg;
			if (res.isValidUser()) {
				try {
					open(res, userIdTextField.getText());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// handle response from server
//	public void handle(Message msg, Object obj) {
//		// TODO Auto-generated method stub
//		if (msg instanceof LoginResponseMsg) {
//			LoginResponseMsg res = (LoginResponseMsg)msg;
//			if (res.isValidUser()) {
//				System.out.println("Server response: Success");
//				try {
//				switch(res.getUserType()) {
//				
//				case EUserPrincipal: open("/gui/PrincipalMenu.fxml"); break;  
//				case EUserTeacher: open("/gui/TeacherMenu.fxml"); break;    
//				case EUserSecretary: open("/gui/SecretaryMenu.fxml"); break;    		
//				case EUserStudent: open("/gui/StudentMenu.fxml"); break;    
//				case EUserParent: open("/gui/TeacherMenu.fxml"); break;    
//				}
//				
//				} catch (Exception e) {	e.printStackTrace(); }
//			} else {
//				System.out.println("Server response:" + res.getErrText());
//			}
//			
//		}
//	}
//	
//	
	public void open(final LoginResponseMsg res, final String userId) throws Exception {
			Platform.runLater(new Runnable() {
			
			public void run() {
				
				String path = "/gui/StudentMenu.fxml";
				
				switch(res.getUserType()) {
				
				case EUserPrincipal: path = "/gui/PrincipalMenu.fxml"; break;  
				case EUserTeacher: path = "/gui/TeacherMenu.fxml"; break;    
				case EUserSecretary: path = "/gui/SecretaryMenu.fxml"; break;    		
				case EUserStudent: path = "/gui/StudentMenu.fxml"; break;    
				case EUserParent: path = "/gui/TeacherMenu.fxml"; break;    
				}
				
			FXMLLoader loader = new FXMLLoader(getClass().getResource(path));

				  Stage stage = new Stage(StageStyle.DECORATED);
				  try {
					stage.setScene(
					    new Scene(
					      (Pane) loader.load()
					    )
					  );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				  switch(res.getUserType()) {
					
					case EUserPrincipal: 
						break;  
					case EUserTeacher: 
						break;    
					case EUserSecretary: 
						break;    		
					case EUserStudent:
						StudentController controller = 
					    loader.<StudentController>getController();
					  
						int userIdInt = Integer.parseInt(userId);
						controller.initData(userIdInt);
						break;    
					case EUserParent: 
						break;    
					}
				  
				  stage.show();
			}
		});
	}

}
