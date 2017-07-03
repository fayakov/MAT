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


/**
 * The Class loginController.
 */
public class loginController implements Initializable, Handler 
{
	
	/** The st. */
	public static Student st= new Student();

	/**
	 * Instantiates a new login controller.
	 */
	public loginController()
	{
		Dispatcher.addHandler(LoginResponseMsg.class.getCanonicalName(), this);
	}
	
	
	
	/**
	 * Sets the client.
	 *
	 * @param clientTst the new client
	 */
	public void setClient(clientTest clientTst){
	}
	
	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
    /** The user id text field. */
    @FXML
    private TextField userIdTextField;

    /** The password text field. */
    @FXML
    private PasswordField passwordTextField;
    
    /** The error text. */
    @FXML
    private Text errorText;

    /** The server ip label. */
    @FXML
    private Text serverIpLabel;
    
    /** The server port label. */
    @FXML
    private Text serverPortLabel;
    
    /** The server ip text field. */
    @FXML
    private TextField serverIpTextField;
    
    /** The server port text field. */
    @FXML
    private TextField serverPortTextField;
    
    /** The login btn. */
    @FXML
    private Button loginBtn;
    
	/** The root. */
	private Parent root;

	/** The scene. */
	private Scene scene;

	/** The primary stage. */
	private Stage primaryStage;
    
    /**
     * Check if valid ipv 4.
     *
     * @param text the text
     * @return true, if successful
     */
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
    
    /**
     * Log in btn.
     *
     * @param event the event
     */
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
    
    /**
     * Sets the tings btn.
     *
     * @param event the new tings btn
     */
    @FXML
    void settingsBtn(ActionEvent event) {
        serverIpLabel.setVisible(!serverIpLabel.isVisible());
        serverPortLabel.setVisible(!serverPortLabel.isVisible());
        serverIpTextField.setVisible(!serverIpTextField.isVisible());
        serverPortTextField.setVisible(!serverPortTextField.isVisible());    	
    }
    
    /**
     * Gets the log in resault.
     *
     * @param isLoged the is loged
     * @param errorPassword the error password
     * @param errorId the error id
     * @return the log in resault
     */
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
    
	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 * @throws Exception the exception
	 */
	public void start(Stage primaryStage) throws Exception {	
	  
	    root = FXMLLoader.load(getClass().getResource("/gui/logIn.fxml"));
		scene = new Scene(root);
		this.primaryStage = primaryStage;
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
    }

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof LoginResponseMsg) {
			LoginResponseMsg res = (LoginResponseMsg)msg;
			if (res.isValidUser()) {
				loginBtn.setDisable(true);
				
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
/**
	 * Open.
	 *
	 * @param res the res
	 * @param userId the user id
	 * @throws Exception the exception
	 */
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
					case EUserTeacher: {
						TeacherController controller = 
					    loader.<TeacherController>getController();
					  
						int userIdInt = Integer.parseInt(userId);
						controller.initData(userIdInt);
						break;
					}
					case EUserSecretary: {
						secretaryController controller = 
					    loader.<secretaryController>getController();
					  
						int userIdInt = Integer.parseInt(userId);
//						controller.initData(userIdInt);
						break;
					}  		
					case EUserStudent: {
						StudentController controller = 
					    loader.<StudentController>getController();
					  
						int userIdInt = Integer.parseInt(userId);
						controller.initData(userIdInt);
						break;
					}
					case EUserParent: 
						break;    
					}
				  
				  stage.show();
			}
		});
		
	}
}
