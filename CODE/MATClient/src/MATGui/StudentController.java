package MATGui;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import entities.Student;
import entities.User;


public class StudentController {

	
	private Student s;
	
    @FXML
    private Label labelStudentData;

    @FXML
    private Label labelStudentID;

    @FXML
    private Label labelFNName;

    @FXML
    private Label labelLName;

    @FXML
    private Label labelCllassID;

    @FXML
    private Label labelCourses;

    @FXML
    private TextField textStudentID;

    @FXML
    private TextField textFName;

    @FXML
    private TextField textLName;

    @FXML
    private TextField textClasses;

    @FXML
    private TextField textCourses;

    @FXML
    private Button buttenExit;

    @FXML
    
    
    public void loadStudent(Student s1){
		this.s=s1;
		this.textFName.setText(s.getFirstName());
		this.textLName.setText(s.getLastName());		
		this.textClasses.setText(s.getClassID());
		//this.textStudentID.setText(s.getId());
		//this.textCourses.setText(s1.getID());
	}
    
  
}
