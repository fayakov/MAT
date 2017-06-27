package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetStudentDataResponse;
import communication.LoginRequestMsg;
import communication.LoginResponseMsg;
import communication.MATClientController;
import communication.Message;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import utils.Handler;
import entities.User;
import entities.Student;

public class StudentDataController  implements Initializable, Handler
{
	ObservableList<String> list ;
	
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

    @FXML
    private ComboBox<String> comboxListCourses;

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
    	
    	
    }

	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof GetStudentDataResponse) 
		{
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			if (res.isRequestSecceded()) 
			{
				
				String strStudentID = Integer.toString(res.getStudentData().getId());
				textStudentID.setText(strStudentID);
				
		    	textFName.setText(res.getStudentData().getFirstName());
		    	textLName.setText(res.getStudentData().getLastName());
		    	textClasses.setText(res.getStudentData().getClassID());
		    	
		    	ArrayList<String> options = new ArrayList<String>();
		    	options= res.getStudentData().getCourse();
				list = FXCollections.observableArrayList(options);
				comboxListCourses.setItems(list);
				
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
			
		}
	}

	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		
		
	}
}
