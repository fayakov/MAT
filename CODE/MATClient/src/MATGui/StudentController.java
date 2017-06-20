package MATGui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

//import logic.Test;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;

import entities.Student;
import entities.User;


public class StudentController implements Initializable
{
	//public Student s;
	Student s= new Student("0",123,"1","2","4");
	
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
    private Label labelStudentMenu;
    @FXML
<<<<<<< HEAD
    public void loadStudent(Student s1){
		this.s=s1;
=======
    private Button ButtonMyData;
    
    
    @FXML
    public void StudentInfo(ActionEvent event) throws Exception
    {
    	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/MATGui/StudentData.fxml").openStream());
		
		StudentController studentController = loader.getController();	
>>>>>>> bb4e0e2ba7c7e8fc197926f3190efeb1e69a1fb9
		this.textFName.setText(s.getFirstName());
		this.textLName.setText(s.getLastName());		
		this.textClasses.setText(s.getClassID());
		
		Scene scene = new Scene(root);			
		scene.getStylesheets().add(getClass().getResource("/MATGui/StudentData.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
    			
    }
    
    
    //@Override
	public void start(Stage primaryStage) throws Exception
	{
		try {
			//לפי הרצאה
		    //URL url = getClass().getResource("StudentData.fxml");
			//AnchorPane pane= FXMLLoader.load( url );
			//Scene scene = new Scene(pane);//אני הוספתי שיתאים
			
			// נוסף אוטומטית
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
			
			//lab
			Parent root = FXMLLoader.load(getClass().getResource("/MATGui/StudentMenu.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/test/application.css").toExternalForm());//שיניתי לאפליקישיין
			primaryStage.setTitle("Student Menu");
			primaryStage.setScene(scene);
			
			primaryStage.show();
		    } 
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
=======
    
    
    //@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		labelStudentMenu.setText("Accepted");
		ButtonMyData.setText("Say 'Hello World'");
    	//ButtonMyData.setValue("select student");
		
	}
>>>>>>> bb4e0e2ba7c7e8fc197926f3190efeb1e69a1fb9
}
