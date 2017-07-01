package controller;
import java.net.URL;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.util.ArrayList;
import java.util.ResourceBundle;
import communication.Dispatcher;
import communication.GetStudentDataRequest;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import utils.Handler;
import entities.User;
import entities.EUserType;
import entities.Request;
import entities.Student;
import entities.StudentCourse;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

//נשאר להעביר ת.ז ולהוסיף ציונים
public class StudentDataController  implements Initializable, Handler
{
	
	private Student student;
	
	ObservableList<String> list ;
	final ObservableList<StudentCourse> data= FXCollections.observableArrayList(new StudentCourse(1,2,5));
	
	public StudentDataController()
	{
		Dispatcher.addHandler(GetStudentDataResponse.class.getCanonicalName(), this);
	}
	
    @FXML 
    private ResourceBundle resources;
    @FXML 
    private URL location;
    @FXML
    private TextField textStudentID;
    @FXML
    private TextField textLName;
    @FXML
    private Label labelLName;
    @FXML
    private TextField textFName;
    @FXML
    private Label labelStudentID;
    @FXML
    private TableColumn<StudentCourse, Integer> colGrade;
    @FXML
    private TextField textClasses;
    @FXML
    private TableColumn<StudentCourse, Integer> colCourse;
    @FXML
    private Label labelFNName;
    @FXML
    private Label labelCllassID;
    @FXML
    private Label labelStudentData;
    @FXML
    private TableView<StudentCourse> tableViewID;
    
    void initData(Student student) {
    	this.student = student;
    }
    
    @FXML
    void StudentInfo(ActionEvent event) 
    {
    	GetStudentDataRequest GetStudentDataReq = new GetStudentDataRequest(loginController.st.getId());//מאיפה ת.ז?
		MATClientController.getInstance().sendRequestToServer(GetStudentDataReq);
    }
    
    //בלי טבלה
    public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		//colCourse.setCellValueFactory(new PropertyValueFactory<StudentCourse, Integer>("courseID"));
		//colGrade.setCellValueFactory(new PropertyValueFactory<StudentCourse, Integer>("grade"));
    	
		//tableViewID.setItems(data);
	}
    
    
    
	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof GetStudentDataResponse) 
		{
			GetStudentDataResponse res = (GetStudentDataResponse)msg;
			
			if (res.isSucceed()) 
			{
				String strStudentID = Integer.toString(res.getStudentData().getId());
				textStudentID.setText(strStudentID);
				
		    	textFName.setText(res.getStudentData().getFirstName());
		    	textLName.setText(res.getStudentData().getLastName());
		    	
		    	String strClass = Integer.toString(res.getStudentData().getId());
		    	textClasses.setText(strClass); 
		    	
		    	
		    	
		    	/*
		    	for(int i=0;i<res.getClassCourseData().size();i++)
				{
					data.add(res.getClassCourseData().get(i).getCourseID(),res.getClassCourseData().get(i).getGrade());
					tableViewID.setItems(data);
				}
		    	
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
		}
		*/
	}

	
	
	
		}}

}











   



