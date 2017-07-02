package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import communication.Dispatcher;
import communication.GetClassTeachersStatsResponse;
import communication.Message;
import entities.CourseWithGrade;
import entities.TeacherWithGrade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.Handler;

/**
 * The Class HistogramClassAndCoursesController.
 */
public class HistogramClassAndCoursesController implements Initializable, Handler {
	
	/**
	 * Instantiates a new histogram class and courses controller.
	 */
	public HistogramClassAndCoursesController(){
		//Dispatcher.addHandler(GetClassCoursesStatsResponse.class.getCanonicalName(), this);
	}
	
	
	/** The arr to display. */
	private ArrayList<CourseWithGrade> arrToDisplay;

	
    /**
     * Gets the arr to display.
     *
     * @return the arr to display
     */
    public ArrayList<CourseWithGrade> getArrToDisplay() {
		return arrToDisplay;
	}

	/**
	 * Sets the arr to display.
	 *
	 * @param arrToDisplay the new arr to display
	 */
	public void setArrToDisplay(ArrayList<CourseWithGrade> arrToDisplay) {
		this.arrToDisplay = arrToDisplay;
	}
	
	/** The count. */
	static int count = arrToDisplay.size();
	
	/** The i. */
	private int i = 0;
	
	
	/** The x. */
	@FXML
    private CategoryAxis x;

    /** The y. */
    @FXML
    private NumberAxis y;

    /** The Course chart. */
    @FXML
    private BarChart<?, ?> CourseChart;



	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		
		//XYChart<x,y>.Series1 set1 = new XYChart.Series<>();
		XYChart.Series<x, y> set1 = new XYChart.Series<>();
		for(int i=0; i<count;i++){
		set1.getData().add(new XYChart.Data)();
		}
		CourseChart.getData().addAll(set1);
		
		
		
		}

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		
	}

	/**
	 * Inits the data.
	 *
	 * @param arr the arr
	 */
	public void initData(ArrayList<CourseWithGrade> arr) {
		// TODO Auto-generated method stub
		
	}
 
	
	
	
}

