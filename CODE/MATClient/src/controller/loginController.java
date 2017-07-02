package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.function.UnaryOperator;

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
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
    private Text serverIpLabel;
    @FXML
    private Text serverPortLabel;
    @FXML
    private TextField serverIpTextField;
    @FXML
    private TextField serverPortTextField;
    
    private static boolean checkIfValidIpv4(String text)  {
    	   StringTokenizer st = new StringTokenizer(text,".");
    	   for(int i = 0; i < 4; i++){ 
    	     if(!st.hasMoreTokens()){
    	       return false;
    	     }
    	     int num = 0;
    	     try {
    	    	 num = Integer.parseInt(st.nextToken());
    	     }
    	     catch (NumberFormatException e) {
    	    	 	return false;
    	     }
    	     if(num < 0 || num > 255){
    	       return false;
    	    }
    	   }
    	   if(st.hasMoreTokens()){
    	     return false;
    	   }
    	   return true;
    }
    
    @FXML
    void logInBtn(ActionEvent event) {    			
    	errorText.setText("");
    	
    	if (!checkIfValidIpv4(serverIpTextField.getText())) {
    		errorText.setText("Enter valid IP address");
    		return;
    	}
    	
    	String serverPortStr = serverPortTextField.getText();
    	int serverPort = 5555;
    	try{
			serverPort = Integer.parseInt(serverPortStr);			
		}catch (NumberFormatException nfe) {
    		errorText.setText("port must be number");
    		return;
    	}
    	
    	
		String userIdStr = userIdTextField.getText();
		String userPassword = passwordTextField.getText();
    	if(userPassword.equals("") || userIdStr.equals("") ){
    		errorText.setText("must enter id and password");
    	}
    	else{
    		try{
    			int userId = Integer.parseInt(userIdStr);
    			LoginRequestMsg loginReqMsg = new LoginRequestMsg(userId, userPassword,true);
    			if (MATClientController.getInstance(serverIpTextField.getText(), serverPort) == null) {
    				errorText.setText("Connection refused. Unable to connect to Server.");
    				return;
    			}
    			else {    				
    				MATClientController.getInstance(serverIpTextField.getText(), serverPort).sendRequestToServer(loginReqMsg);
    			}
    			
    		}catch (NumberFormatException nfe) {
	    		errorText.setText("id must be number");
	    	}
    	}
    }
    
    @FXML
    void settingsBtn(ActionEvent event) {
        serverIpLabel.setVisible(!serverIpLabel.isVisible());
        serverPortLabel.setVisible(!serverPortLabel.isVisible());
        serverIpTextField.setVisible(!serverIpTextField.isVisible());
        serverPortTextField.setVisible(!serverPortTextField.isVisible());    	
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
	  /*
		final String regex = makePartialIPRegex();
        final UnaryOperator<Change> ipAddressFilter = c -> {
            String text = c.getControlNewText();
            if  (text.matches(regex)) {
                return c ;
            } else {
                return null ;
            }
        };
        serverIpTextField.setTextFormatter(new TextFormatter<>(ipAddressFilter));
        */
	    Parent root = FXMLLoader.load(getClass().getResource("/gui/logIn.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    private String makePartialIPRegex() {
        String partialBlock = "(([01]?[0-9]{0,2})|(2[0-4][0-9])|(25[0-5]))" ;
        String subsequentPartialBlock = "(\\."+partialBlock+")" ;
        String ipAddress = partialBlock+"?"+subsequentPartialBlock+"{0,3}";
        return "^"+ipAddress ;
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
				case EUserParent: path = "/gui/ParentMenu.fxml"; break; 
				case EUserSystemManager: path = "/gui/DefineCourse.fxml"; break;
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
