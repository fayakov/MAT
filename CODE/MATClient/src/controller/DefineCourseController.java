package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import communication.DefineCourseRequest;
import communication.DefineCourseResponse;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import entities.Course;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import utils.Handler;

/**
 * The Class DefineCourseController.
 */
public class DefineCourseController implements Initializable, Handler {
	
	/**
	 * Instantiates a new define course controller.
	 */
	public DefineCourseController() {
		Dispatcher.addHandler(DefineCourseResponse.class.getCanonicalName(), this);
	}
	

    @FXML
    private TableColumn<Course, Integer> courseId;
    
    @FXML
    private TableColumn<Course, String> courseName;
    
    @FXML
    private TableColumn<Course, Integer> teachingHours;
    
    @FXML
    private TableColumn<Course, Integer> teachingUnit;

    @FXML
    private TableView<Course> perCourse;


   
    
	/** The t unit. */
	private int teachHours, tUnit, preCourseId;
	
	/** The course name. */
	private String newCourseName;

	 /** The teaching unit text. */
 	@FXML
	 private TextField teachingUnitText;

	 /** The course name text. */
 	@FXML
	 private TextField courseNameText;

	 /** The teaching hours text. */
 	@FXML
	 private TextField teachingHoursText;
	
 	
    @FXML 
    ObservableList<Course> data= FXCollections.observableArrayList();
    
    /**
     * Inits the data.
     *
     * @param allCourses the all courses
     */
    public void initData(ArrayList<Course> allCourses) {
    	data.clear();
		
		for (Course course : allCourses) 
				data.add(course);

	}
    
    
    /**
     * Define course send.
     */
    @FXML
    void defineCourseSend(ActionEvent event) {
    	
    	newCourseName = courseNameText.getText().toString(); 	
    	
    	if(courseNameText.getText().isEmpty() || teachingUnitText.getText().isEmpty() || teachingHoursText.getText().isEmpty()) 
    		Prompt.alert(3, "one or more of the fields is empty");     
    	
    	else {
    		try {
    		teachHours = Integer.parseInt(teachingHoursText.getText());
    		tUnit =  Integer.parseInt(teachingUnitText.getText());

    	   	Course preCourse = perCourse.getSelectionModel().getSelectedItem();
    	   	preCourseId = preCourse.getCourseId();

    		DefineCourseRequest defineCourseReq = new DefineCourseRequest(newCourseName, tUnit, teachHours, preCourseId);
	        MATClientController.getInstance().sendRequestToServer(defineCourseReq);  
    		}
    		catch(NumberFormatException e){
		    	Prompt.alert(3,"please enter numerical value");
		    	return; }
    	}

    }

/* (non-Javadoc)
 * @see utils.Handler#handle(communication.Message, java.lang.Object)
 */
public void handle(Message msg, Object obj) {
	// TODO Auto-generated method stub
		if (msg instanceof DefineCourseResponse) {
			DefineCourseResponse res = (DefineCourseResponse)msg;
			
			try {
				localPrompt(newCourseName, res.getErrText(), res.actionSucceed());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
}

public void localPrompt(final String clName1,final String eror1, final boolean succ)  throws Exception {
	
	Platform.runLater(new Runnable() {
		String clName = clName1;
		String erorText = eror1;
		boolean success = succ;
		
		public void run() {
			if(success)
				Prompt.alert(1, "course " + clName + " was added succesfully");	
			else
				Prompt.alert(3, erorText);
		}
	} );
}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		courseId.setCellValueFactory(new PropertyValueFactory<Course, Integer>("courseId"));
		courseName.setCellValueFactory(new PropertyValueFactory<Course, String>("courseName"));
		teachingHours.setCellValueFactory(new PropertyValueFactory<Course, Integer>("duration"));
		teachingUnit.setCellValueFactory(new PropertyValueFactory<Course, Integer>("teachingUnit"));

		
		perCourse.setItems(data);
	
	}

}
