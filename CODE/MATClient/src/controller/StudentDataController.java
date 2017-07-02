package controller;
import java.net.URL;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.util.ArrayList;
import java.util.ResourceBundle;
import communication.Dispatcher;
import communication.GetStudentDataByStudentIDRequest;
import communication.GetStudentDataByUserIDRequest;
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

/**
 * The Class StudentDataController.
 */
//נשאר להעביר ת.ז ולהוסיף ציונים
public class StudentDataController  implements Initializable
{
	
	/** The list. */
	ObservableList<String> list ;
	
	/** The data. */
	final ObservableList<StudentCourse> data= FXCollections.observableArrayList(new StudentCourse(1,2,5));
	
    /** The resources. */
    @FXML 
    private ResourceBundle resources;
    
    /** The location. */
    @FXML 
    private URL location;
    
    /** The text student ID. */
    @FXML
    private TextField textStudentID;
    
    /** The text L name. */
    @FXML
    private TextField textLName;
    
    /** The label L name. */
    @FXML
    private Label labelLName;
    
    /** The text F name. */
    @FXML
    private TextField textFName;
    
    /** The label student ID. */
    @FXML
    private Label labelStudentID;
    
    /** The col grade. */
    @FXML
    private TableColumn<StudentCourse, Integer> colGrade;
    
    /** The text classes. */
    @FXML
    private TextField textClasses;
    
    /** The col course. */
    @FXML
    private TableColumn<StudentCourse, Integer> colCourse;
    
    /** The label FN name. */
    @FXML
    private Label labelFNName;
    
    /** The label cllass ID. */
    @FXML
    private Label labelCllassID;
    
    /** The label student data. */
    @FXML
    private Label labelStudentData;
    
    /** The table view ID. */
    @FXML
    private TableView<StudentCourse> tableViewID;
    
    /**
     * Inits the data.
     *
     * @param student the student
     */
    void initData(Student student) 
    {
    	if (student != null) {
    		String strStudentID = Integer.toString(student.getId());
    		String strClass = Integer.toString(student.getClassID());
	    	
    		textStudentID.setText(strStudentID);
	    	textFName.setText(student.getFirstName());
	    	textLName.setText(student.getLastName());
	    	textClasses.setText(strClass); 
    	}
    }
    
    /* (non-Javadoc)
     * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
     */
    //בלי טבלה
    public void initialize(URL location, ResourceBundle resources) 
	{
//    	if (student != null) {
//    		String strStudentID = Integer.toString(student.getId());
//    		String strClass = Integer.toString(student.getId());
//	    	
//    		textStudentID.setText(strStudentID);
//	    	textFName.setText(student.getFirstName());
//	    	textLName.setText(student.getLastName());
//	    	textClasses.setText(strClass); 
//    	}
//    	
//    	else {
//    		System.out.println(arg0);
//    	}
    	
    	
		// TODO Auto-generated method stub
		//colCourse.setCellValueFactory(new PropertyValueFactory<StudentCourse, Integer>("courseID"));
		//colGrade.setCellValueFactory(new PropertyValueFactory<StudentCourse, Integer>("grade"));
    	
		//tableViewID.setItems(data);
	}
}

