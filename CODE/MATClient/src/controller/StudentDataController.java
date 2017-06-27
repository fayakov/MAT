package controller;

import java.net.URL;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetStudentDataResponse;
import communication.LoginRequestMsg;
import communication.LoginResponseMsg;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import utils.Handler;

public class StudentDataController  implements Initializable, Handler
{
	public StudentDataController()
	{
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}
	
	
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="textStudentID"
    private TextField textStudentID; // Value injected by FXMLLoader

    @FXML // fx:id="textLName"
    private TextField textLName; // Value injected by FXMLLoader

    @FXML // fx:id="labelLName"
    private Label labelLName; // Value injected by FXMLLoader

    @FXML // fx:id="textFName"
    private TextField textFName; // Value injected by FXMLLoader

    @FXML // fx:id="labelCourses"
    private Label labelCourses; // Value injected by FXMLLoader

    @FXML // fx:id="textCourses"
    private TextField textCourses; // Value injected by FXMLLoader

    @FXML // fx:id="labelStudentID"
    private Label labelStudentID; // Value injected by FXMLLoader

    @FXML // fx:id="textClasses"
    private TextField textClasses; // Value injected by FXMLLoader

    @FXML // fx:id="labelFNName"
    private Label labelFNName; // Value injected by FXMLLoader

    @FXML // fx:id="buttenExit"
    private Button buttenExit; // Value injected by FXMLLoader

    @FXML // fx:id="labelCllassID"
    private Label labelCllassID; // Value injected by FXMLLoader

    @FXML // fx:id="labelStudentData"
    private Label labelStudentData; // Value injected by FXMLLoader

    
    @FXML
    void StudentInfo(ActionEvent event) 
    {
    	//GetStudentDataRequest GetStudentDataReq = new GetStudentDataRequest(userIdStr);//מאיפה ת.ז?
		//MATClientController.getInstance().sendRequestToServer(GetStudentDataRequest);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() 
    {
    	textStudentID.setText("30529");
    	textFName.setText("tal");
    	textLName.setText("chen");
    	textClasses.setText("L703");
    	//textCourses.setText
    	
    	
    }

	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		
	}

	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof LoginResponseMsg) {
			LoginResponseMsg res = (LoginResponseMsg)msg;
			if (res.isValidUser()) {
				System.out.println("Server response: Success");
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
		
	}
}
